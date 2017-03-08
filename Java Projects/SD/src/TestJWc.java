import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TestJWc{
	
	
	public static void main(String args[]) throws FileNotFoundException{
		File f = new File("/home/isi3/output.txt");
		JWc c = new JWc();
		Scanner s = new Scanner(f);
		System.out.println(c.new_wc(s)+	" lines.");
	}	
}
 