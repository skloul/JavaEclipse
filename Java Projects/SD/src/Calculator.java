
public class Calculator{
	
   protected float add(float a, float b){
		System.out.print("Hello 1 \n");
		
		return a+b;
	}
   
    protected float add(float a, float b, float c){
		System.out.print("Hello 2 \n");
		
		return a+b;
	}
	
	public static void main(String args[]){
		Calculator obj1 = new Calculator();
		Add obj2 = new Add();
		System.out.println ("Total = "+ obj1.add(5,6));		
		System.out.println ("Total = "+ obj1.add(5,6,5));
		
		System.out.println ("Total = "+ obj2.add(5,6));		
		System.out.println ("Total = "+ obj2.add(5,6,5));
		
	}

}
