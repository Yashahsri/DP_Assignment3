package question_15;

import java.util.HashMap;
import java.util.Hashtable;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------hashtable -------------------------
        Hashtable<Integer,String> htab=new Hashtable<Integer,String>();
        htab.put(101," ajay");
        htab.put(101,"Vijay");
        htab.put(102,"Ravi");
        htab.put(103,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:htab.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
	}
	//----------------hashmap--------------------------------
    HashMap<Integer,String> hmap=new HashMap<Integer,String>();
    hmap.put(100,"Amit");
    hmap.put(104,"Amit"); 
    hmap.put(101,"Vijay");
    hmap.put(102,"Rahul");
    System.out.println("-----------Hash map-----------");
    for (Map.Entry m:hmap.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());
    }
}


