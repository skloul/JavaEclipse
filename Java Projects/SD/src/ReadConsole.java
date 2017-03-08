

	import java.io.*;
	public class ReadConsole {

	   public static void main(String args[]) throws IOException {
	      InputStreamReader cin = null;
	      FileWriter out = null;
	      out = new FileWriter("/home/isi3/CTI/a5.txt");
	      try {
	         cin = new InputStreamReader(System.in);
	         System.out.println("Enter characters, 'q' to quit.");
	         char c;
	         do {
	            c = (char) cin.read();
	            System.out.print(c);  // writes on console CRT
	            
	            out.write(c);         // writes in a file .. 
	            
	         } while(c != 'q');
	      }finally {
	         if (cin != null) {
	            cin.close();
	            out.close();
	         }
	      }
	   }
	}

