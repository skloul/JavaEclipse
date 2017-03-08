import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestJMore {
	
	
	
	public static void main(String args[]) throws FileNotFoundException{
		
		JMore j = new JMore(10);
		String path = "/home/isi3/output.txt";
		File f = new File(path);
		Scanner sc= new Scanner(f);
		j.new_more(sc);
	}

}
