import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;

// Original Code for Ns2 Trace File Analyser

public class OriginalNs2TraceFileAnalyser2{
  public static void main (String args[]) {
    String s, thisLine, currLine,thisLine1;
    int j=0;
    FileReader  fin;
    FileWriter fout;
    final int FILES = 0;
    final int MAX_PACKETS = 400000;  
  try {
         int i=0, sends=0, receives=0;
         int drops=0,packet_id=0, highest_packet_id = 0;
         int line_count=0,current_line=0, routing_packets=0;
         int count=0;
//         if (args[0].length()<1)
//         {
//            System.out.println("usage: java ParseTrace <input scenario> <protocol>");
//            System.exit(0);
//         }
         //String outputFileName = args[0]+".txt";
         String outputFileName = "/home/isi3/examples_a/a1"+".txt";
         fout  = new FileWriter(outputFileName);
         BufferedWriter op = new BufferedWriter(fout);
         for(int k=0;k<=1;k++)
         {	  
              //String inputFileName = args[0] + ".tr";
			  //String inputFileName = args[0];
        	  String inputFileName = "/home/isi3/examples_a/a1.tr";
			  
			  
              float pdfraction, time=0, packet_duration=0, end_to_end_delay=0;      
              float avg_end_to_end_delay=0;
              float start_time[] = new float[MAX_PACKETS];
              float end_time[] = new float[MAX_PACKETS];
              float sent_packets[] = new float[MAX_PACKETS];
              float received_packets[] = new float[MAX_PACKETS];
              String tokens[] = new String[100];
                  // initialize the start time       
              for (i=0; i<MAX_PACKETS ; i++)
                start_time[i] = 0;
              // DataOutputStream op = new DataOutputStream(fout);
              j=0;
              sends=0; receives=0; routing_packets=0;
              highest_packet_id = 0;
              end_to_end_delay=0;
               for (i=0; i<MAX_PACKETS ; i++)
                { start_time[i] = 0; end_time[i]=0;}
                fin =  new FileReader (inputFileName);
                BufferedReader br = new BufferedReader(fin);
                  while ((thisLine = br.readLine()) != null) {  
               // scan it line by line
			  
			   //System.out.println(thisLine);
               java.util.StringTokenizer st = new java.util.StringTokenizer(thisLine, " ");        
               i=0;
               while(st.hasMoreElements())
               tokens[i++]= st.nextToken();
               if (tokens[0].equals("s") || tokens[0].equals("r")|| tokens[0].equals("f"))
                   {
                      //System.out.println("here it is you are "+ tokens[0] +" ,,," + tokens[2]);
					  
					 // parse the time
                     if (tokens[1].equals("-t")) time = Float.valueOf(tokens[2]).floatValue();
                     System.out.println("here it is time  "+ time);
                     // parse the packet_id
                     if (tokens[39].equals("-Ii")) packet_id = Integer.valueOf(tokens[40]).intValue();
                    
					
					 //System.out.println("here it is you are "+ tokens[0] +" ,,," + tokens[18] +",,," + tokens[34]);
                     /// calculate the sent packets
                     if (tokens[0].equals("s")&&tokens[18].equals("AGT")&& (tokens[34].equals("cbr")||tokens[34].equals("tcp")))sends++;
					 
                     // find the number of packets in the simulation
                     if (packet_id >highest_packet_id) highest_packet_id = packet_id;
                      
                     // set the start time, only if its not already set
                     if (start_time[packet_id] == 0) start_time[packet_id] = time;
   
                   // calculate the receives and end-end delay   
				   if (tokens[0].equals("r") && tokens[18].equals("AGT") && (tokens[34].equals("cbr") || tokens[34].equals("tcp"))) 
                     { 
                        receives++;
                        end_time[packet_id] = time;
                     }            
                     else end_time[packet_id] = -1;
                     // calculate the routing packets
                     if ((tokens[0].equals("s") || tokens[0].equals("f"))  && tokens[18].equals("RTR") 
                     &&  (tokens[34].equals("AODV") || tokens[34].equals("DSR") 
                     || tokens[34].equals("message") ))
                     routing_packets++;
                    }        
            }
          // calculate the packet duration for all the packets
         for (packet_id = 0; packet_id <= highest_packet_id ; packet_id++) {
           packet_duration = end_time[packet_id] - start_time[packet_id];
           if (packet_duration >0) end_to_end_delay += packet_duration;
         }
         
        // calculate the average end-end packet delay
         avg_end_to_end_delay = end_to_end_delay / (receives );
         // calculate the packet delivery fraction
         pdfraction = ((float)receives/(float)(sends))*100;
             
         System.out.println(" \n Sent Packets .. "+sends);
         System.out.println(" Received Packets .. "+receives);
         System.out.println(" Routing overhead (packets) "+ routing_packets);
         System.out.println(" Normalized routing load "+(float)routing_packets/(float)receives);
         System.out.println(" Packet delevery Fraction PDF .." +pdfraction);
         System.out.println(" Avg End-End delay " +avg_end_to_end_delay);      
         op.write(sends);
         op.write(","+receives);
         op.write(","+ routing_packets);
         op.write(","+(float)routing_packets/(float)receives);
         op.write("," +pdfraction);
         op.write("," +avg_end_to_end_delay);
         op.write('\n');	 
        }//end of for
         op.close();           
       } //end of try
      catch (Exception e) {
         e.printStackTrace();
         } 
  } // end of main

}// end of class

	
	
