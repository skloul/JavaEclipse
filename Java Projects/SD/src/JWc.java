import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class JWc
{
	JWc(){
		
	} //constructor
			
	
	int new_wc(Scanner s) {
				String line=null;
				int lineCounter = 0;
				while(s.hasNext()){
					line = s.nextLine();
					lineCounter++;
				}
			return lineCounter;
			}
}



