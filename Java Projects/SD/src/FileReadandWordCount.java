import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileReadandWordCount{

	String inputLine;
	int y,c,b,m,s=0;
	
	FileReadandWordCount(File file) throws FileNotFoundException{
		
	    Scanner sc = new Scanner(file); // read file
		while(sc.hasNext()){
			inputLine=sc.nextLine().trim().toLowerCase();
			 String[] wordArray = inputLine.split(" ");  // split at spaces
		   
		   //for(String value : wordArray){
	       for(String word : wordArray){
           System.out.println(word); // prints word per word
           wordCoun(word);
        	
        }
			//System.out.println(line); // prints line per line
		}
		 wordCounPrint();
	}
			 
	void wordCoun(String word){
		if(word.equalsIgnoreCase("yellow")) y++;
		if(word.equalsIgnoreCase("cheese")) c++;	
		if(word.equalsIgnoreCase("banana")) b++;	
		if(word.equalsIgnoreCase("meat"))   m++;	
		if(word.equalsIgnoreCase("skloul")) s++;
	}
	
	void wordCounPrint( ){
		System.out.println("Yellow : ="+ y);
		System.out.println("cheese : ="+ c);
		System.out.println("banana : ="+ b);
		System.out.println("banana : ="+ m);
		System.out.println("Skloul : ="+ s);
	}
	
}
