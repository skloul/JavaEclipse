import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class FileRead {
	
	private Scanner keyboard = new Scanner(System.in); // for stream reading from keyboard reading 
	
	 // a method to read filtered files within a folder one by one
	private void FolderReader(String folderPath){
		File folder = new File(folderPath);
		try{
			if(folder.exists())
			{
			    File[] AllOfFiles = folder.listFiles(new FilenameFilter() {
			    public boolean accept(File dir, String name) {
			        return name.toLowerCase().endsWith(".tr");
			       }
			    });
			
			//Read files one by one
			for(int i=0;i<AllOfFiles.length;i++)
				if(AllOfFiles[i].isFile()) // go through them one by one
				{
			      System.out.println(AllOfFiles[i].getName());
			      System.out.println("-------------------------------------");
			       if(AllOfFiles[i].canRead())
			    	   ReadFileContentsLinebyLine(AllOfFiles[i]); // Read file's contents line/line
			       else
			    	  //System.out.println("Error: Unreadable file ..");
			          JOptionPane.showMessageDialog( null, "Hello World!" );
			
				}
			}// folder not exist
			else
				 //System.out.println("Error: Wrong folder");
				JOptionPane.showMessageDialog(null,"Error: Wrong folder" );
		}catch(Exception e){
		     // if any error occurs
		     e.printStackTrace();
		}

	}
	
	 // a method  to read a file contents and, display them line by line
	private void ReadFileContentsLinebyLine(File filename) throws IOException{
			   
 	   // Open the file
 	   //FileInputStream fstream = new FileInputStream("textfile.txt");
 	   FileInputStream fstream = new FileInputStream(filename);
 	   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

 	   String strLine;

 	   //Read File Line By Line
 	   while ((strLine = br.readLine()) != null)   {
 	     // Print the content on the console
 	     System.out.println (strLine);
 	   }
 	   //Close the input stream
 	   br.close();
	}
	
	public static void main(String arg[]){
		FileRead Obj = new FileRead();
		String FolderPath =""; 
			
		while(FolderPath.isEmpty())	{
		System.out.println("Enter the file path");
		FolderPath=Obj.keyboard.next();
        }
		System.out.println(FolderPath);
		Obj.FolderReader(FolderPath);
	}

} 
