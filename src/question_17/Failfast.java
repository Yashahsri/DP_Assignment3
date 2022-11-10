package question_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Failfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, String> city = new HashMap<String, String>();
	        city.put("Delhi", "India");
	        city.put("Moscow", "Russia");
	        city.put("New York", "USA");
	  
	        Iterator iterator = city.keySet().iterator();
	  
	        while (iterator.hasNext()) {
	            System.out.println(city.get(iterator.next()));
	  
	            // adding an element to Map
	            // exception will be thrown on next call
	            // of next() method.
	            cityCode.put("Istanbul", "Turkey");
	        }
	    }

	}


