import java.util.Scanner;

public class Sumup
{
  
	 static int D2(int x)
	{
		
		return -x;
		
	}
	
	public static void addSequence(Scanner s)
  {
    int sum = 0;
    int current =0;
   //int current = s.nextInt();;
    while (current >= 0)
    {
      sum = current + sum;
      current = s.nextInt();
    }
    System.out.println("Sum = "+sum);
    
//    int[] a = {2, 4, 6, 8, 10, 12};
//    for(int i = 0; i<a.length; i++)
//      System.out.println(a[i]);
    
  int[] x ={1,2,3,4,5,6,7,8,9};
    
    System.out.println("array size ="+x.length);
    for(int i = 0; i<x.length; i++)
      System.out.print(x[i]+" ");  
    
    System.out.println();  
    for(int i = 0; i<x.length; i+=2)
        System.out.print(x[i]+" ");  
    
    System.out.println();  
    for(int i = 1; i<x.length; i+=2)
        System.out.print(x[i]+" ");  
    
    int[] numbers = { 3, 15, 4, 5 };
    
    numbers = new int[] { 
    3, 15, 4, 5
    };
    
    
    
    
  }
  
  public static void main(String[]argv)
  {
    addSequence(new Scanner(System.in));
    
  }
  
} 