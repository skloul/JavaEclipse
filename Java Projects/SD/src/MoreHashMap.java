import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MoreHashMap {
	// one dimensional array; you can't insert add and delete cells from an array once created
	// int[] array={1,2,3,4,4,5,5,6};  // declaration and initialisation 
	   int[] array;  // Declaration only

	// two dimensional array, also you can't insert add and delete cells from an array once created
	//   int[][] array1= new int[][]{{1,2,3,4,5,6},{1,3,4,5,6}};  // declaration and initialisation
	     int[][] array1; // Declaration only
	     
	     
	// Arraylist, takes only one type: you can use add insert and delete form arrayList
	// ArrayList<String> ArrayList1 = new ArrayList<String>(); // declaration and initialisation 
	ArrayList<String> ArrayList= new ArrayList<String>(); // declaration only
	
	//HashMap takes two values <key,value>, use add and get to deal with HasMap
	// HashMap<Integer, String> HashMap1 = new HashMap<Integer, String>(); // declaration and initialisation
	// HashMap<String, String> HashMap2 = new HashMap<String, String>();   // declaration and initialisation
	 HashMap<Integer, String> HashMap1; // declaration Only 
	 HashMap<String, String> HashMap2;  // declaration Only
	
		
	
	// Constructor, to initialise Array, ArrayList, HashMap1 and HasMap2 
	public MoreHashMap (){
        OneDimArrayInitialisation(array);
       
        TwoDimArrayInitialisation();
    	
        FillArrayList();
			 
		HashMap1=FillHashMap(HashMap1);  
		 
		int x=0;
		HashMap2=FillHashMap(HashMap2, x);      // x=0 just for overloading the method, I want
		                                // to make the signature different
	}
	
	private void OneDimArrayInitialisation(int[] array){
		// one dimensional array; you can't insert add and delete cells from an array once created
		this.array=new int[]{1,2,3,4,5,6,5};
		//System.out.println(this.array[4]);
		
		//return array;
	}
	
   private void TwoDimArrayInitialisation(){
	  // two dimensional array, also you can't insert add and delete cells from an array once created
	   array1= new int[][]{{1,2,3,4,5,6},
		                        {1,3,4,5,6}};  // declaration and initialisation    
       //return array;
	}
   
   private /*ArrayList<String>*/ void FillArrayList(){ 
	   this.ArrayList.add("Hellow") ;
	   this.ArrayList.add("World") ;
	   this.ArrayList.add(",") ;
	   this.ArrayList.add("This") ;
	   this.ArrayList.add("is") ;
	   this.ArrayList.add("me Idris") ;
		//return ArrayList;
	}
	
   private HashMap<Integer, String> FillHashMap (HashMap<Integer, String> Hashmapx) { 
	   Hashmapx = new HashMap<Integer, String>() ;
	   Hashmapx.put(1,"Hellow") ;
	   Hashmapx.put(2,"World") ;
	   Hashmapx.put(3,",") ;
	   Hashmapx.put(4,"This") ;
	   Hashmapx.put(5,"is") ;
	   Hashmapx.put(6,"me Idris") ;
		return Hashmapx;
	}
   
   private HashMap<String, String> FillHashMap (HashMap<String, String> Hashmapx, int x) { 
	   Hashmapx = new HashMap<String, String>() ;
	   Hashmapx.put("1","Hi") ;
	   Hashmapx.put("2","Macs") ;
	   Hashmapx.put("3",",") ;
	   Hashmapx.put("4","This") ;
	   Hashmapx.put("5","is") ;
	   Hashmapx.put("6","me Idris") ;
		return Hashmapx;
		} 
  
   private void Printarray(){
	   System.out.println("The array length " + array.length);
	   for(int i=0;i<array.length;i++){
		   System.out.print(array[i]); 
		   if (i< array.length-1)
			   System.out.print(",");
	   }
	   System.out.println(); 
   }
   
   private void PrintTwoDimArray(){
		System.out.println ("here is two dimentional array's size [" + 
	      array1[0].length +"]["+ array1[1].length+"]");
		
	    System.out.println (); 
	       for (int j=0; j<2; j++){
		    for (int i=0; i<array1[j].length;i++)
			   System.out.print(array1[j][i]+ " ");
		    System.out.println();
	       }
		}
   
   private void PrintArrayList(){
	  System.out.println("");
	  Iterator it = ArrayList.iterator();
	   System.out.println("The arrayList size " + ArrayList.size());
	   //for(int i=0;i<ArrayList.size();i++)
		//   System.out.print(ArrayList.get(i)+ " ");
	  while(it.hasNext())
	   System.out.print(it.next()+ " ");
  
	  System.out.println("");
   }
   
   private void PrintHashMap(){	
	    System.out.println("");
		  System.out.println("The HashMap size " + HashMap1.size());
		   for(int i=1; i< HashMap1.size(); i++)
		    System.out.println(HashMap1.get(i));
	   }
   
 
   private void PrintHashMap(int X){	
	    System.out.println("");
		  System.out.println("The HashMap size " + HashMap2.size());
		   for(int i=1; i< HashMap2.size(); i++)
		    System.out.println(HashMap2.get(String.valueOf(i)));
	   }

   
   public static void main(String args[]) throws Exception{
	 MoreHashMap obj1 = new MoreHashMap();
	 obj1.Printarray();
	 obj1.PrintArrayList();
	 obj1.PrintHashMap();
	 obj1.PrintHashMap(0);
	 obj1.PrintTwoDimArray();
 }

}
