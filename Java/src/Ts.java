import java.util.TreeSet;  

public class Ts {  

	public static void main(String args[]){  
  
		TreeSet<String> set= new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         
 }  
}  

