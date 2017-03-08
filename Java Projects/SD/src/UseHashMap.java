import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UseHashMap {
	
	// this is to declare Hashmap
	
	// to use hasMap, which takes more than different value, not like array or ArrayList
	// you need 3 steps
	// Step 1 .. define HasMap
	// Step 2 .. initialise or fill HashMap
	// Step 3 .. iterate over Hashmap 
	             // to iterate over Hasmap you need the following 3 steps
	             // Step A:  Create a set entry
	             // Step B:  Create an Iterator for set entry
	             // Step C:  Create loop over iterator
	             // Step D:  Inside loop you need to create  //Map.Entry x = (Map.Entry)it1.next();
	             //          now you can get both key and value for each entry
	
	
	
	//Step 1..
	HashMap<Integer,String> hashmap1 = new HashMap<Integer, String>();
	Scanner keyboard = new Scanner(System.in);
	
	
	//Step 2 .. method to initialise (Fill) HasMap
	private HashMap<Integer,String> fillHashMap(int value, String month){
		//Step 2 ..
		this.hashmap1.put(value, month);
		
		return hashmap1;
	}
	
	
	//Method overloading ... method to initialise (Fill) HasMap
	//Step 2 ..
	private HashMap<Integer,String> fillHashMap(){
		hashmap1.put(1, "Jan");
		hashmap1.put(2, "Feb");
		hashmap1.put(3, "March");
		hashmap1.put(4, "April");
		hashmap1.put(5, "May");
		hashmap1.put(6, "June");
		hashmap1.put(7, "July");
		hashmap1.put(8, "August");
		hashmap1.put(9, "Sept");
		hashmap1.put(10,"Oct");
		hashmap1.put(11, "November");
		hashmap1.put(12, "Decmber");
		
		return hashmap1;
	}
	public static void main(String args[]){
	
		UseHashMap obj1 = new UseHashMap();
		
//		for(int i=1; i<=12 ;i++){
//		   System.out.println(" Enter Month ("+i+")  name  ?");
//		   String month= obj1.keyboard.next();
//		   obj1.fillHashMap(i, month);  
//		}
		
		 obj1.fillHashMap();
		
		boolean True=true;
		System.out.print(obj1.hashmap1);
		System.out.println();
//		do{
//		 
//		  System.out.println(" Enter Month value  ... ? ");
//		  int monthValue = obj1.keyboard.nextInt();
//		  if (monthValue==99)
//			  True=false;
//		  
//		 // Set set = obj1.hashmap1.entrySet();
//		 // Iterator month = set.iterator();
//		  if(obj1.hashmap1.containsKey(monthValue))
//			  System.out.println(" Month name is ...to Exit (99)" + obj1.hashmap1.get(monthValue));
//		 	  		  
//		}while(True);
		
		
		 
		
//		/* Display content using Iterator*/
//	      Set set = obj1.hashmap1.entrySet();
//	      Iterator iterator = set.iterator();
//	      while(iterator.hasNext()) {
//	         Map.Entry mentry = (Map.Entry)iterator.next();
//	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//	         System.out.println(mentry.getValue());
//	         
//	          
//	      }
		
		//Step 3 ..
        // to iterate over hashmap you need to create a set of entries
		//Step A:
		Set set = obj1.hashmap1.entrySet();
		//Step B:
		Iterator it1 = set.iterator();
		
		
		System.out.println(" Enter Month name   ... ? ");
		String monthIndex = obj1.keyboard.next();
	
		//Step C:
		while(it1.hasNext()){
			 //Step D:
			 Map.Entry me = (Map.Entry)it1.next();
			 if(me.getValue().equals( (String) monthIndex)) // caste integer to Object
				  System.out.println(me.getKey()+":" + me.getValue() );	
		}
		
		
		// to iterate over hashmap you need to create a set of entries
		Set set1 = obj1.hashmap1.entrySet();
		Iterator it2 = set1.iterator();
		System.out.println(" Enter Month number  ... ? ");
		int monthindex= obj1.keyboard.nextInt();
			
		while(it2.hasNext()){
			  Map.Entry me = (Map.Entry)it2.next();
			  if(me.getKey() == (Integer) monthindex ) // caste integer to Object
				  System.out.println(me.getKey()+":" + me.getValue() );	
		   }	
	}
	
}
