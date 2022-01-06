package hello;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> languages = new ArrayList<>();

		    // add() method without the index parameter
		    languages.add("Java");
		    languages.add("C");
		    languages.add(null);
		    System.out.println("ArrayList: " + languages);
		    
		    //addAll()
		    ArrayList<String> languages1 = new ArrayList<>();
		    languages1.add("hello");
		    languages.addAll(languages1);
		    System.out.println(languages);
		    
		    //set
		    languages.set(2, "world");
		    //get
		    System.out.println(languages.get(2));
		    
		    //remove
		    System.out.println(languages.remove(1));
		    //indexOf
		    System.out.println(languages.indexOf("world"));
		    //removeAll
		    System.out.println(languages.removeAll(languages1));
		    //contains
		    System.out.println(languages.contains("Java"));
		    
		    
		    
		    
	}

}
