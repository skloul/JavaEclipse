import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestForRemovedirtyData {
	
	
	
	public static void main(String args[]) throws FileNotFoundException{
		//String path = null;
		File file = new File("/home/isi3/Labhelpers.txt");
		
		 Scanner sc = new Scanner(file); // read file
			while(sc.hasNext()){
				String inputLine = sc.nextLine().trim().toLowerCase();
				 String[] wordArray = inputLine.split(" ");  // split at spaces
			   
			   //for(String value : wordArray){
		       for(String word : wordArray){
	            System.out.println(word); // prints word per word
	          
	        }
			}
	}
}
