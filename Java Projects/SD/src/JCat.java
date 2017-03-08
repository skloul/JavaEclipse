import java.util.*;
import java.io.*;
class JCat{
	JCat(){
		
	} // constructor

void new_cat(Scanner s){
	System.out.println("S1" + s.nextLine().length());
	
	String line;
	//int lineCounter = 0;
	while(s.hasNext()){
	line = s.nextLine();
	//lineCounter++;
	System.out.println(line);
	}
	//System.out.println("Number of lines is this file "+lineCounter);
}
}