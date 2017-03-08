
public class Ns2Methods extends MainNs2Trace{

	float PacketDeliveryFraction(float receives, float sends){
		 // calculate the packet delivery fraction
			   return ((float)receives/(float)(sends))*100;
		  }
	float AverageEndtoEnd_packet_delay(float end_to_end_delay, float receives){
		// calculate the average end-end packet delay
	    return (end_to_end_delay / (receives ));
	}
//	
//   float PacketDuration(int highest_packet_id, float start_time[],  float end_time[]){
//	// calculate the packet duration for all the packets
//	    for (packet_id = 0; packet_id <= highest_packet_id ; packet_id++) {
//	      packet_duration = end_time[packet_id] - start_time[packet_id];
//	      //System.out.println("start_time[packet_id]" + start_time[packet_id]);
//	      //System.out.println("end_time[packet_id]" + end_time[packet_id]);
//	      if (packet_duration >0) {
//	    	  System.out.println("end_to_end_delay"+ end_to_end_delay);
//	    	  end_to_end_delay += packet_duration;
//	      }
//	    }
//		System.out.println("packet_duration ="+packet_duration); 
//		System.out.println("end_to_end_delay"+ end_to_end_delay);
//		return end_to_end_delay;		
//	}
}
