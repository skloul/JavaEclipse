import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
public class Addition {
	
	Scanner Keyboard = new Scanner(System.in);
	
	public static void main(String arg[]){
		
 	Addition obj1= new Addition ();
		
 		float number = 0;
		int totalSum=0;
		while (number>=0){
			totalSum +=number;
			System.out.print("Eneter a number [0..10] ? = ");
			number=obj1.Keyboard.nextFloat();
		}
			
		System.out.print("Total numbers = " + totalSum);
		
//		Scanner Keyboard = new Scanner(System.in);
//		int totalSum=0;
//		for(int i=0;i<10;i++){
//			
//			System.out.print("Enetr a number [1...9]  ?");
//			System.out.flush();
//			int x =Keyboard.nextInt();
//			if(x<0 || x>9)
//				System.out.print("wrong number; out of range"); 
//			 else
//				 totalSum += x;	
//		}
//		System.out.println("Total numbers = " + totalSum);
//		
		 		
		 JOptionPane.showMessageDialog( null, "Hello World!" );	  
	}
}
