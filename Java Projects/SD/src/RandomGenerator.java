
public class RandomGenerator {
	
	private int dice1,dice2 = 0;

	void Play(int x , int y){
		
		dice1 = (int)(Math.random()*x) + y;
	    dice2 = (int)(Math.random()*x) + y;
			 
		System.out.println("Dices .. " + dice1 + "  " + dice2);
			
		//return RandomNumber;		
	}
	
	public static void  main(String args[]){
		
		RandomGenerator Obj1 = new RandomGenerator();
		Obj1.Play(6, 1);
	}

}