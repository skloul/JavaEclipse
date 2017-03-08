import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReadFolderContents {

	// this class is used to read and display the folder contents 
	// what you need to do just s give the folder's path 
	//ArrayList<String> ArrayList1 = new ArrayList<String>();
	Scanner keyboard = new Scanner(System.in);	// for keyboard inputs
	String homeFolder ="";
	int[] totalFilesAndDirectories = new int [2]; // array to return 2 values, java doesn't support that	
	int totalFiles =0; 
	int totalDirectories=0;
	
	
	//Method to print files and directories in a given folder 
	private int[] getFolderContentce(File homeFolder){
	 File[] listOfallFiles = homeFolder.listFiles();
	 //System.out.println("    *** You have      ..." + listOfallFiles.length + "  files and directory");
	 System.out.println(" ");
	 for (int i=0 ; i<listOfallFiles.length ; i++){
		 
		 if (listOfallFiles[i].isFile()){
			    // returns the time file was last modified
	            long millisec = listOfallFiles[i].lastModified();
	            
	            // date and time
	            Date dt = new Date(millisec);
	            
				 System.out.println("  -" + listOfallFiles[i].getName()+ "    "+dt + "    "+ listOfallFiles[i].length()/1024+"KB");
				 totalFiles++;
		 }
		 if (listOfallFiles[i].isDirectory()){
			 System.out.print("<d>" + listOfallFiles[i].getName());
			 totalDirectories++;
			 String NewDirectoryPath = listOfallFiles[i].getPath();
			 File folder1 = new File(NewDirectoryPath); 
			 getFolderContentce(folder1); // excursion
			 System.out.println(" "); 
		 } 	
	 }
	 	totalFilesAndDirectories[0]= totalFiles;          
		totalFilesAndDirectories[1]= totalDirectories;
		
	return totalFilesAndDirectories ;	 // array to return 2 values, java doesn't support that	
	}
	
	//Method takes folder and path to print some information
	 private void informatinPrint(File folder, String homePath){
	 try
	    {
	    	if (folder.exists())
	    	{
	    		   System.out.println("    *** In this Path (" + homePath + ")");
	    		   
	    		   getFolderContentce(folder); // calling method to print files and directories in a folder
	               System.out.println("");
	               System.out.println("    ----------------");
	               System.out.println("    *** total files (" + totalFilesAndDirectories[0]+")");
	               System.out.println("    *** total directories (" +totalFilesAndDirectories[1]+")");
	    	}
	    	else
	    		System.out.println("Error : Wrong Path !");
	    	
	    }catch(Exception e){
     // if any error occurs
     e.printStackTrace();
    }
}	
	
	public static void  main(String arg[]){
	
    ReadFolderContents reader = new ReadFolderContents(); 
	
	    while (reader.homeFolder.isEmpty())
	    {
		 System.out.print("Enter the folder's path .... ?");
		 reader.homeFolder = reader.keyboard.next(); // reading path form keyboard
		}
	    
	    File folder = new File(reader.homeFolder);   // to read a folder from a path
	    reader.informatinPrint(folder,reader.homeFolder ); // pass folder and path to information print method
	   
	 }
}