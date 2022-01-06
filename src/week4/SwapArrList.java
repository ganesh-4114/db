package week4;
import java.util.*;


public class SwapArrList {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ramesh");
		arr.add("Ganesh");
		arr.add("Ravi");
		arr.add("Raghav");
		arr.add("Vijay");
		arr.add("Sheshank");
		
		System.out.println(arr);
		
		Collections.swap(arr, 1, 2);
		
		System.out.println(arr);
		
		arr.clear();
		System.out.println(arr);

	}

}
