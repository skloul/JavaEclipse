import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class NsTraceFileAnalyser1{
    String s, thisLine, currLine,thisLine1;
    FileReader  fin;
    FileWriter fout;
    final int FILES = 0;
    final int MAX_PACKETS = 400000; 
    float start_time[] = new float[MAX_PACKETS];
    float end_time[] = new float[MAX_PACKETS];
    String tokeNs2[] = new String[100];
    
    
    int j,sends, receives, drops , packet_id , highest_packet_id , line_count,current_line,
    routing_packets, count=0;

    float pdfraction, time=0, packet_duration=0, end_to_end_delay=0;      
    float avg_end_to_end_delay=0;
	// Constructor	
	NsTraceFileAnalyser1(){ 	
		j=0; sends=0; receives=0; drops=0 ; packet_id=0 ; highest_packet_id = 0;
        line_count=0 ; current_line=0 ; routing_packets=0; count=0;
	}
	
	void  PacketDuration(){
		// calculate the packet duration for all the packets
	    for (packet_id = 0; packet_id <= highest_packet_id ; packet_id++) {
	      packet_duration = end_time[packet_id] - start_time[packet_id];
	      if (packet_duration >0) end_to_end_delay += packet_duration;
	    }
	}
	
	void AverageEndtoEnd_packet_delay(){
		// calculate the average end-end packet delay
	    avg_end_to_end_delay = end_to_end_delay / (receives );
	}
	
	void PacketDeliveryFraction(){
		 // calculate the packet delivery fraction
        pdfraction = ((float)receives/(float)(sends))*100;
	}
	
	void ResultsPrint(){
		
		System.out.println("The updated ver.1.1 OOP ");
        
        System.out.println(" \n Sent Packets .. "+sends);
        System.out.println(" Received Packets .. "+receives);
        System.out.println(" Routing overhead (packets) "+routing_packets);
        System.out.println(" Normalized routing load "+(float)routing_packets/(float)receives);
        System.out.println(" Packet delevery Fraction PDF .." +pdfraction);
        System.out.println(" Avg End-End delay " +avg_end_to_end_delay);     
	}
	
	void WriteResultsInFile(BufferedWriter op) throws IOException{
		
		 op.write("------------------"+'\n');
         op.write(sends+'\n');
         op.write(","+receives+'\n');
         op.write(","+ routing_packets+'\n');
         op.write(","+(float)routing_packets/(float)receives +'\n');
         op.write("," +pdfraction +'\n');
         op.write("," +avg_end_to_end_delay);
         op.write('\n');	 
		
	}
	   
    // parse the time; get time
	float GetTheTime(String tokeN1, String tokeN2){
	   
	   float time=0;
	   if (tokeN1.equals("-t")) time = Float.valueOf(tokeN2).floatValue();
	   //if (Ns2.tokeNs2[1].equals("-t")) Ns2.time = Float.valueOf(Ns2.tokeNs2[2]).floatValue();
	   return time;
	}
	
  public static void main (String args[]) throws IOException {
	  String inputFileName = "/home/isi3/examples_a/a1.tr";
	  String outputFileName = "/home/isi3/examples_a/a1"+".txt";
	  
	  // create object called Ns2 from the main class  
	  NsTraceFileAnalyser1 Ns2 = new  NsTraceFileAnalyser1();
      Ns2.fout  = new FileWriter(outputFileName);
      BufferedWriter op = new BufferedWriter(Ns2.fout);
	  
  try {
         int i, j=0; 
         for(int k=0;k<=1;k++)
         {	  
              // initialize the start time       
              for (i=0; i<Ns2.MAX_PACKETS ; i++)
                Ns2.start_time[i] = 0;
              // DataOutputStream op = new DataOutputStream(fout);
              j=0;
              Ns2.sends=0; Ns2.receives=0; Ns2.routing_packets=0;
              Ns2.highest_packet_id = 0;
              Ns2.end_to_end_delay=0;
               for (i=0; i<Ns2.MAX_PACKETS ; i++){
            	    Ns2.start_time[i] = 0; Ns2.end_time[i]=0;}
               		Ns2.fin =  new FileReader (inputFileName);
               		BufferedReader br = new BufferedReader(Ns2.fin);
               		while ((Ns2.thisLine = br.readLine()) != null) { /* while 1*/  
                      // scan it line by line
			  
					   //System.out.println(thisLine);
			           java.util.StringTokenizer st = new java.util.StringTokenizer(Ns2.thisLine, " ");        
			           i=0;
			           while(st.hasMoreElements())  /* while 2*/ 
			           Ns2.tokeNs2[i++]= st.nextToken();
			           if (Ns2.tokeNs2[0].equals("s") || Ns2.tokeNs2[0].equals("r")|| Ns2.tokeNs2[0].equals("f"))
			               {
			                 // parse the time; get time
			        	     Ns2.time = Ns2.GetTheTime(Ns2.tokeNs2[1],Ns2.tokeNs2[2]);
			                
			        	     System.out.println("here it is time  "+ Ns2.time);
			                 // parse the packet_id
			                 if (Ns2.tokeNs2[39].equals("-Ii")) Ns2.packet_id = Integer.valueOf(Ns2.tokeNs2[40]).intValue();
			                
							
							 //System.out.println("here it is you are "+ Ns2.tokeNs2[0] +" ,,," + Ns2.tokeNs2[18] +",,," + Ns2.tokeNs2[34]);
			                 /// calculate the sent packets
			                 if (Ns2.tokeNs2[0].equals("s")&&Ns2.tokeNs2[18].equals("AGT")&& (Ns2.tokeNs2[34].equals("cbr")||Ns2.tokeNs2[34].equals("tcp")))Ns2.sends++;
							 
			                 // find the number of packets in the simulation
			                 if (Ns2.packet_id >Ns2.highest_packet_id) Ns2.highest_packet_id = Ns2.packet_id;
			                  
			                 // set the start time, only if its not already set
			                     if (Ns2.start_time[Ns2.packet_id] == 0) Ns2.start_time[Ns2.packet_id] = Ns2.time;
			   
			                   // calculate the receives and end-end delay   
						   if (Ns2.tokeNs2[0].equals("r") && Ns2.tokeNs2[18].equals("AGT") && (Ns2.tokeNs2[34].equals("cbr") || Ns2.tokeNs2[34].equals("tcp"))) 
			                 { 
							   Ns2.receives++;
			                    Ns2.end_time[Ns2.packet_id] = Ns2.time;
			                 }            
			                 else Ns2.end_time[Ns2.packet_id] = -1;
			                 // calculate the routing packets
			                 if ((Ns2.tokeNs2[0].equals("s") || Ns2.tokeNs2[0].equals("f"))  && Ns2.tokeNs2[18].equals("RTR") 
			                 &&  (Ns2.tokeNs2[34].equals("AODV") || Ns2.tokeNs2[34].equals("DSR") 
			                 || Ns2.tokeNs2[34].equals("message") ))
			                	 Ns2.routing_packets++;
			                }        
            } /* while 1*/  
 
         Ns2.PacketDuration();               // calculate the packet duration for all the packets
         Ns2.AverageEndtoEnd_packet_delay(); // calculate the average end-end packet delay
         Ns2.PacketDeliveryFraction();		 // calculate the packet delivery fraction
         Ns2.ResultsPrint();                 // Print all the calculated results
         Ns2.WriteResultsInFile(op);         // Write data into a File
        }//end of for
         op.close();           
       } //end of try
      catch (Exception e) {
         e.printStackTrace();
         } 
  } // end of main

}// end of class

	
	
