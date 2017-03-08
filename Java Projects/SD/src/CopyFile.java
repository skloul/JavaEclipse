

	import java.io.*;
	public class CopyFile {

	   public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("/home/isi3/CTI/a2.tr");
	         out = new FileWriter("/home/isi3/CTI/a3.tr");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}

