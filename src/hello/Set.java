package hello;
import java.util.*;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<String> al=new TreeSet<String>();  
//		  al.add("Ravi");  
//		  al.add("Vijay");  
//		  al.add("Ravi");  
//		 // al.add(null);  
//		  //Traversing elements  
//		  Iterator<String> itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  } 
		  
		  HashSet<String> set=new HashSet();  
          set.add("One");    
          set.add("Two");    
          set.add("Three");   
          set.add("Four");  
          set.add(null);  
          Iterator<String> i=set.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
          
          
          HashSet<String> set2 = new HashSet();
          set2.add("One");
          set2.add("Two");
          
          System.out.println(set.containsAll(set2));
          
	}

}
