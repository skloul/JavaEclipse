import java.util.Scanner;

public class UseInputStream {
	
	Scanner keyboard = new Scanner(System.in);
	
	
	private void InputStream() throws Exception{
	 
		try{
	 
		System.out.print ("Enter a Line  ... " );
		String  input4 = keyboard.nextLine();
		System.out.println(input4);
		
		System.out.print ("Enter a byte ... " );
		Byte input1 = keyboard.nextByte();
		System.out.println(input1);
		
		System.out.print ("Enter a character ... " );
		String  input2 = keyboard.next();
		System.out.println(input2);
		
		System.out.print ("Enter a String ... " );
		String  input3 = keyboard.next();
		System.out.println(input3);
		
		
 
	}catch(Exception err){
		System.out.println( err.getMessage( ) );
		keyboard.nextLine(); // Clear the input stream to avoid an infinite loop
        System.out.println("Please enter a valid value.");
        
	}
}
	
	public static void main(String args[]) throws Exception{
		
		UseInputStream obj1 = new UseInputStream();
        obj1.InputStream();
		
	}
}
