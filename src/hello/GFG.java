package hello;
import java.io.*;
import java.util.*;
 
class GFG
{
    public static void main (String[] args)
    {
        // creating an ArrayList
        ArrayList<String> al = new ArrayList<String>();
 
        // adding object to arraylist
        al.add("Practice.GeeksforGeeks.org");
        al.add("quiz.GeeksforGeeks.org");
        al.add("code.GeeksforGeeks.org");
        al.add("contribute.GeeksforGeeks.org");
        System.out.println(al.getClass());  //get Class
        al.add(4, "World");   //add at Index
        al.indexOf(2); 		//indexOf
        al.isEmpty();   //isEmpty
        
        System.out.println(al);
        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());
 
        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");
        v.remove(2);
 
        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
        
        Iterator it1 = v.iterator();
        while (it1.hasNext())
            System.out.println(it1.next());
    }
}