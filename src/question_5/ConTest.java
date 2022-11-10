package question_5;

public class ConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i= 0;i<10000;i++){
		sb.append("Tpoint");
		}
		System.out.println("Time taken:" +(System.currentTimeMillis()-startTime)+ "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("java");
		for (int i=0;i<10000;i++){
		sb2.append("Tpoint");
		}
		System.out.println("Time taken:" +(System.currentTimeMillis()-startTime)+ "ms");


	}

}
