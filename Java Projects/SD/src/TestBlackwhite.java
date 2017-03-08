 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Blackwhite extends JFrame
{  
	Color [] rainbow = 
		{ Color.red,Color.orange,Color.yellow,
		   Color.green,Color.blue,Color.magenta,Color.black  };
	
	
	int[][] x = { 
		         {1,2,3},
		         {4,5,6},
		         {7,8,9},
	             };
	
	public Blackwhite()
   {  getContentPane().setBackground(Color.black);  }

   private void pause(long millisecs)
   { 
	  //long startTime = Calendar.getInstance().getTimeInMillis();
      //while(Calendar.getInstance().getTimeInMillis()-startTime<millisecs);
	   Scanner keyboard = new Scanner(System.in);
	   String k= keyboard.next();
	   System.out.println(k);	 
	   
   }

   public void test(){
	    // this a algorithm to show how to swap between 
	    // two background screen ... 
	   
   }
   
   
   public void flash()
   {  
	   int i=0;
	   while(true)
      {   
	     pause(500);
         getContentPane().setBackground(rainbow[i]);
         i++;
         if(i==7)
        	 i=0;
         //pause(500);
         //getContentPane().setBackground(Color.black);
      }
   }
}

class TestBlackwhite
{  public static void main(String [] args)
   {  Blackwhite b;
      b = new Blackwhite();
      b.setSize(200,220);
      b.setTitle("Black and white");
      b.setVisible(true);
      b.addWindowListener(new WindowAdapter()
                              {  public void windowClosing(WindowEvent e)
                                 {  System.exit(0); }
                              });
      b.flash();
      
//      for (int i =0; i <3;i++)
//      {
//    	  for (int j=0;j<3; j++)
//    	  {
//    		  if(i==j || i+j==2)
//    			  System.out.print("V"+"   ");
//    		  else
//    		      System.out.print(b.x[i][j]+"   ");
//    		  
//    	  }
//    	  System.out.println("");
//      }
   }
}
