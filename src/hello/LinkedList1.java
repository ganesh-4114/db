package hello;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  //add
		  al.add("Ravi");    
		  System.out.println(al);
		  al.addLast("For");  //addLast
		  al.add(null);
		  System.out.println(al.getLast());  //getLast
		  System.out.println(al.getFirst());  //getFirst
		  System.out.println(al.remove("Ravi")); //remove 
		  System.out.println(al);
		  System.out.println(al.lastIndexOf(al));
		  System.out.println(al.pop());   //pop
		  al.clear();
	}

}
