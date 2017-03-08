import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 
class White extends JFrame
{ 
	
	public White(char c, String title){
		Color colorx = null;
		if(c=='r'||c=='R'){
			colorx=Color.RED;
			setSize(250,250);
		}
		if(c=='b'||c=='B'){
			colorx=Color.BLUE;
			setSize(350,100);
		}
		if(c=='g'||c=='G'){
			colorx=Color.GREEN;
			setSize(200,450);
		}
		getContentPane().setBackground(colorx);  
		setTitle(title);
	}
}

class TestWhite
{  public static void main(String [] args)
   {  White w;
      w = new White('r',"Green Background");
      //w.setSize(200,220);
      //w.setTitle("White");
      w.setVisible(true);
      w.addWindowListener(new WindowAdapter()
                              {  public void windowClosing(WindowEvent e)
                                 {  System.exit(0); }
                              });
   }
}
