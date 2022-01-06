package week4;

import java.util.*;

public class KeyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {11, -10, 25, 18, 45, 55, 30, 87, -28, 18};
        //Print all elements of array
        System.out.println("The contents of the Array are : ");
        for (int i = 0; i < array.length; i++)
            System.out.println("Array[" + i + "] = " + array[i]);

        //Search Element
        int search_element;
        
        Scanner obj = new Scanner(System.in);
        System.out.print("The search element is : " );
        search_element = obj.nextInt();
        int find_index = -1;

        //Linear Search
        for (int j = 0; j < (array.length - 1); j++) {
            if (array[j] == search_element) {
                find_index = j;
                break;
            }
        }

        if (find_index != -1) {
            
            System.out.println("It is found in the array at position : " + find_index);
        } else
            System.out.println("\nThe search element is not found in the array.");
    }
	

}

