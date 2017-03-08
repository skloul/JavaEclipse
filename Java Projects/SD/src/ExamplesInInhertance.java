class A {
	
	Boolean A = true;
	
	void printA(){
		
		System.out.println("Hi, I'm Class A");
	}
	
}

interface B {
   Boolean B = true;
   void printB();	
}

class C extends A implements B {
	Boolean C = true;
	
	void printC(){
		System.out.println("Hi, I'm Class C");
	}

	@Override
	public void printB() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ExamplesInInhertance {
		
	public static void main (String args[]){
		
		ExamplesInInhertance obj = new ExamplesInInhertance();
		C obj_C = new C();
//		B obj_B = new B();
//		obj_B.printA();
//		obj_B.printB();
		
		 
		
		
	}
	
}
