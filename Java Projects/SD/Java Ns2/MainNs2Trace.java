import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class MainNs2Trace{
    String s, thisLine, currLine,thisLine1;
    FileReader  fin;
    FileWriter fout;
    final int FILES = 0;
    final int MAX_PACKETS = 400000; 
    float start_time[] = new float[MAX_PACKETS];
    float end_time[] = new float[MAX_PACKETS];
    String tokeNs2[] = new String[100];
    
    String inputFileName = "/home/isi3/examples_a/a1.tr";
	String outputFileName = "/home/isi3/examples_a/a1"+".txt";
    
    int j;
	int sends;
	int receives;
	int drops;
	int packet_id;
	int highest_packet_id;
	int line_count;
	int current_line;
	int routing_packets;
	int count=0;

    float pdfraction, time=0, packet_duration=0, end_to_end_delay=0;      
    float avg_end_to_end_delay=0;
	// Constructor	
    MainNs2Trace(){ 	
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
	
//	void AverageEndtoEnd_packet_delay(){
//		// calculate the average end-end packet delay
//	    avg_end_to_end_delay = end_to_end_delay / (receives );
//	}
	
//	void PacketDeliveryFraction(){
//		 // calculate the packet delivery fraction
//        pdfraction = ((float)receives/(float)(sends))*100;
//	}
	
	void ResultsPrint(){
		
		System.out.println("**** The updated ver.1.1 OOP ");
        
        System.out.println(" \n **Sent Packets .. "+sends);
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
	   //if (  tokeNs2[1].equals("-t"))   time = Float.valueOf(  tokeNs2[2]).floatValue();
	   return time;
	}
	
  public static void main (String args[]) throws IOException {
	  // create object called Ns2 from the main class  
	  MainNs2Trace Ns2 = new  MainNs2Trace();    
      Ns2.calculat();
  } // end of main


	
void calculat() throws IOException{
	 
	//AverageEndtoEnd_packet_delay AvrEtED= new AverageEndtoEnd_packet_delay();
	//PacketDuration Ptime= new PacketDuration();
	//PacketDeliveryFraction PDF= new PacketDeliveryFraction();
	Ns2Methods Ns2Methods = new Ns2Methods();
	
	fout  = new FileWriter(outputFileName);
    BufferedWriter op = new BufferedWriter(fout);	
try {
    int i, j=0; 
    for(int k=0;k<=1;k++)
    {	  
         // initialize the start time       
         for (i=0; i<MAX_PACKETS ; i++)
           start_time[i] = 0;
         // DataOutputStream op = new DataOutputStream(fout);
         j=0;
         sends=0;   receives=0;   routing_packets=0;
         highest_packet_id = 0;
         end_to_end_delay=0;
          for (i=0; i<  MAX_PACKETS ; i++){
       	      start_time[i] = 0;   end_time[i]=0;}
          		  fin =  new FileReader (inputFileName);
          		BufferedReader br = new BufferedReader(  fin);
          		while ((  thisLine = br.readLine()) != null) { /* while 1*/  
                 // scan it line by line
		  
				   //System.out.println(thisLine);
		           java.util.StringTokenizer st = new java.util.StringTokenizer(  thisLine, " ");        
		           i=0;
		           while(st.hasMoreElements())  /* while 2*/ 
		             tokeNs2[i++]= st.nextToken();
		           if (  tokeNs2[0].equals("s") ||   tokeNs2[0].equals("r")||   tokeNs2[0].equals("f"))
		               {
		                 // parse the time; get time
		        	       time =   GetTheTime(  tokeNs2[1],  tokeNs2[2]);
		                
		        	     System.out.println("here it is time  "+   time);
		                 // parse the packet_id
		                 if (  tokeNs2[39].equals("-Ii"))   packet_id = Integer.valueOf(  tokeNs2[40]).intValue();
		                
						
						 //System.out.println("here it is you are "+   tokeNs2[0] +" ,,," +   tokeNs2[18] +",,," +   tokeNs2[34]);
		                 /// calculate the sent packets
		                 if (  tokeNs2[0].equals("s")&&  tokeNs2[18].equals("AGT")&& (  tokeNs2[34].equals("cbr")||  tokeNs2[34].equals("tcp")))  sends++;
						 
		                 // find the number of packets in the simulation
		                 if (  packet_id >  highest_packet_id)   highest_packet_id =   packet_id;
		                  
		                 // set the start time, only if its not already set
		                     if (  start_time[  packet_id] == 0)   start_time[  packet_id] =   time;
		   
		                   // calculate the receives and end-end delay   
					   if (  tokeNs2[0].equals("r") &&   tokeNs2[18].equals("AGT") && (  tokeNs2[34].equals("cbr") ||   tokeNs2[34].equals("tcp"))) 
		                 { 
						     receives++;
		                      end_time[  packet_id] =   time;
		                 }            
		                 else   end_time[  packet_id] = -1;
		                 // calculate the routing packets
		                 if ((  tokeNs2[0].equals("s") ||   tokeNs2[0].equals("f"))  &&   tokeNs2[18].equals("RTR") 
		                 &&  (  tokeNs2[34].equals("AODV") ||   tokeNs2[34].equals("DSR") 
		                 ||   tokeNs2[34].equals("message") ))
		                	   routing_packets++;
		                }        
       } /* while 1*/  
      PacketDuration(); 
      //this.end_to_end_delay= Ns2Methods.PacketDuration(highest_packet_id, start_time, end_time);
      //System.out.print("end_to_end_delay" + end_to_end_delay);
      avg_end_to_end_delay=Ns2Methods.AverageEndtoEnd_packet_delay(end_to_end_delay,receives); // calculate the average end-end packet delay
      pdfraction =Ns2Methods.PacketDeliveryFraction(receives,sends);		 // calculate the packet delivery fraction
      ResultsPrint();                 // Print all the calculated results
      WriteResultsInFile(op);         // Write data into a File
   }//end of for
    op.close();           
  } //end of try
 catch (Exception e) {
    e.printStackTrace();
    } 
}
}// end of class
