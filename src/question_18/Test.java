package question_18;

public class Test extends Thread {
	 public void run(){  
		   System.out.println("running..");  
		 }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test p1 = newTest();  
		  p1.start();  
		  p1.start();  
		 


	}

}
