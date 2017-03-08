class Animal {
  
	private static String name;
	private int age;
	private String address;
	private int[] array1= {1,2,3,4,45};
	
	 
	
	
	public void move() {
      System.out.println("Animals can move");
   }
   
    static void eat() {
	  System.out.println("Animals can eat");
    }
    
    public Animal(String name, int age , String address ){
      this.name=name;
      this.age=age;
      this.address=address;    
     
    }
    
	static String getNam(){
    	
    	return name;
    	
    }
   
}





class Cat extends Animal {
    public Cat(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}

	static void move1() {
      System.out.println("Dogs can walk and run");
   }
   
}




public class TestDog {

   public static void main(String args[]) {
    
	Animal a = new Animal("Popy", 5, "15/3 Gorgi street");   // Animal reference and object
   
	//Cat b = new Cat("Cat1", 4, "15/3 Gorgi street");      	// Animal reference but Dog object
    
    Animal.getNam();    // runs the method in Animal class
    
   // System.out.println(b.getNam());
    System.out.println(Animal.getNam());
      
      
   }
}
