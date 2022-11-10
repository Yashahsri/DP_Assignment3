package question_24;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		for(int i=0;i<=10000;i++) {
		List<Integer> list  = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		}
		System.out.println("Memory before:" + run.freeMemory());
		System.gc();
		System.out.println("Memory after:" + run.freeMemory());
	}

}
