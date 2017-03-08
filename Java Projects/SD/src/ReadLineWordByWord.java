

import java.util.Scanner;

public class ReadLineWordByWord {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in); // Reads data form input Unit (Keyboard)
	    
	        String inputLine;   // will hold the full input line
	        String word1 = null;
	        String word2 = null;

	        System.out.print("> ");         // print prompt

	        inputLine = reader.nextLine();  // Reads data from keyboard in line format using 'reader object' (until you hit Enter)  
            System.out.println(inputLine);  // Print whatever the user has entered from keyboard
	      
            // Find up to two words on the line.
	        Scanner tokenizer = new Scanner(inputLine);  // This reads the entered line 
	        
	       /* 
	        while (tokenizer.hasNext()){          // checks if there is word in the given line 'tokenizer'
	        	 String word = tokenizer.next();  // gets the words one by one
	        	 System.out.println(word);        // prints words 
	        }
	        
	        */
	        
	        if(tokenizer.hasNext()) {          // checks if there is word in the given line
	            word1 = tokenizer.next();      // get the first word
	            System.out.println(word1);
	            if(tokenizer.hasNext()) {
	                word2 = tokenizer.next();      // get the second word
	                System.out.println(word2);
	                // note: we just ignore the rest of the input line.
	            }
	        }
		
	        reader.close();
	        tokenizer.close();
		
	}

}
