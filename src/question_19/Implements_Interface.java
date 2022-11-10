package question_19;

public class Implements_Interface implements Runnable {

		public void run(){
		System.out.println("Thread started running..");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 x2 = new MyThread1();
		Thread t = new Thread(x2);
		t.start();
	}


	}


