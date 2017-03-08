import java.util.Scanner;

public class JMore {
    
	private int pageLength;
	
	JMore(int J){
		pageLength = J;		
	}
	
	void new_more(Scanner s){
		int lineCount=0;
		@SuppressWarnings("resource")
		Scanner key = new Scanner(System.in);
		while(s.hasNext()){
			if(lineCount!=pageLength){
			    System.out.println(s.nextLine());
			     lineCount++;}
			else{
				
				 System.out.println("End of page hit Enter to shoe Next page...");
				 String line = key.nextLine();
				 lineCount=0; 
			}
		}
	}
}
