import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TestJCat
{	
public static void main(String [] args) throws FileNotFoundException  
{
	String path = "/home/isi3/output.txt";
	File f = new File(path);
	Scanner s = new Scanner(f);
	JCat c = new JCat();
	c.new_cat(s);
  }
}