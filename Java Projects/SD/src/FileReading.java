import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
	

	
	
	public static void main(String args[]) throws FileNotFoundException{
		String path = "/home/isi3/output.txt";
		String line=null;
		Scanner file = new Scanner(new File(path));
		while(file.hasNextLine()){/*not end of file, returns	true if	not	at	end	of	file*/
			line = file.nextLine();
			System.out.println(line);
		}
	}//end of main

}//end of class
