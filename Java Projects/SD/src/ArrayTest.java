
import java.io.File;
import java.util.ArrayList;

public class ArrayTest {
	ArrayList<String>  A1 = new ArrayList<String>() ;
	ArrayList<String> ArrayList1 = new ArrayList<String>();
	private void setArray(){
		System.out.println("The array size before ...."+ A1.size());
		A1.add("A");
		A1.add("AB");
		A1.add("AC");
		A1.add("AD");
		A1.add("AE");
	}
	private void getArayy(){
		System.out.println("The  array size after ... " + A1.size());
		System.out.println("The  array contensts are ... " + A1);
	}
	
	private void removArray( int index){
		A1.remove(index);
		 System.out.println("The  array contensts after remov A1[" + index + "]" + A1);
	}

	private void insertValueArray(int index , String value){
		A1.add(index, value);
		 System.out.println("The  array contensts after adding A1[" + index + "]" + A1);
	}
	
	private void getFolder(File folder ){
		File[] listOfFiles = folder.listFiles();
		//System.out.println("That is your folders path ...." + folder);
		//System.out.println("Number of files in this folder  ...." + listOfFiles.length);
		
		
		for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        //System.out.println("- " + listOfFiles[i].getName());
		    	  
		      } else if (listOfFiles[i].isDirectory()) {
		        //System.out.println("<d> " + listOfFiles[i].getName());
		        File folder1 = new File(folder +"/"+ listOfFiles[i].getName());
				getFolder(folder1);
		        
		      }
		 ArrayList1.add(listOfFiles[i].getName());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	   ArrayTest a1 = new ArrayTest();
	   a1.setArray(); // to fill the array cells
	 	
	   a1.getArayy();
	   a1.insertValueArray(0, "AA");
	   a1.removArray(1);
	   
	  
		
		File folder = new File("/home/isi3/Mood-Softwares");
		folder.mkdir();
		
		a1.getFolder(folder );
		System.out.println("Number of files and directories are  : " + a1.ArrayList1.size());
		System.out.println("" + a1.ArrayList1);
		
		 
		
	}

}
