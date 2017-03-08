import java.io.File;
import java.io.FileNotFoundException;

public class WordCountInLineJAPI {
       
	public static void main(String arg[]) throws FileNotFoundException{
		String path ="/home/isi3/output.txt";
		File file = new File(path); // get path's file
		FileReadandWordCount frwc = new  FileReadandWordCount(file);
	}
	
}

