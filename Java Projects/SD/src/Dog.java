
public class Dog {

	
//		Individual	characteristics	(instance	fields).
	private String	name;
	//constructor
	 Dog(String	name1)
	{
	 this.name=name1;
	}
	//accessor method
	private	String getName(){
	return	name;
	}
	
	
	public static void main (String arg[]){
		Dog obj1 ;
		StaticTest obj2 = new StaticTest();
		
		obj1 = new Dog("Dogx");
		
		System.out.println("This dog name is => "+ obj1.getName());
		obj1.name ="hhh";
		
		System.out.println("This dog name is => "+ obj1.getName());
		
		System.out.println();
		obj2.Test1();
		obj2.Test2();
		
				
		
	}
}
	
	
	

