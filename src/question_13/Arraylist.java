package question_13;

import java.io.*; 
import java.util.*; 
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList javaDevelopers = new ArrayList(); 
		 
		// Adding elements to arraylist 
		javaDevelopers.add("Shivanshu"); 
		javaDevelopers.add("Roxy"); 
		javaDevelopers.add("Ganesh"); 
		javaDevelopers.add("Shailender"); 
 
		// Traversing ArrayList elements
		System.out.println("Java Developrs:"); 
		Iterator iterator = javaDevelopers.iterator(); 
		while (iterator.hasNext()) 
			System.out.println(iterator.next()); 

	}

}
