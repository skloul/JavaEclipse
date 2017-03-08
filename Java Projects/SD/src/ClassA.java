import java.util.ArrayList;
public class ClassA {

	
	public static void add(int num1, int num2){
		
		System.out.println(num1 + num2);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*ClassB Object1 = new ClassB(); 	
		
	add(5,6);
	Object1.sub(5, 7);*/
		
//		int i =16;
//		System.out.println(i);
//		while (i>=7)
//	      
//	System.out.println("i=" + i);
		
//		int i=7, k=7;
//		
//		if(i<k)
//			System.out.println("Bingo !");
//		else
//			System.out.println("House ");
		
	

//		ArrayList<String> myList = new ArrayList<String>();
//
//		myList.add("cat");
//		myList.add("dog");
//		myList.add("hamster");
//		myList.add("cat");
//		myList.remove( 1);
//
//		for(String element : myList) 
//		    System.out.print(element+',');

//**************  Block Prints a square 
		for(int i=0 ; i <= 10 ; i++)
		{
			for(int j=0 ; j <= 10 ; j++)
				  System.out.print("*"); 
		
		System.out.println(); 
		}
		
		System.out.println(); 
//**************  Block Prints 2 triangle s 
		for(int i=0 ; i <= 10 ; i++)
		{
			for(int j=0 ; j <= 10 ; j++)
				if (i==j)
				  System.out.print(" "); 
				else
				  System.out.print("C"); 
		
		System.out.println(); 
		}
//			
		System.out.println(); 
//**************  Block Prints Cross   
		for(int i=0 ; i <= 10 ; i++)
		{
			for(int j=0 ; j <= 10 ; j++)
				if ((j==5)||(i==5))
				  System.out.print("T"); 
				else
				  System.out.print(" "); 
		
		System.out.println(); 
		}
		
		System.out.println(); 
		
		//*******  Block Prints Cross   
		for(int i=0 ; i <= 10 ; i++)
		{
			for(int j=0 ; j <= 10 ; j++)
				if (i+j==10)
				  System.out.print(" "); 
				else
				  System.out.print("*"); 
		
		System.out.println(); 
		}			
	}

}
