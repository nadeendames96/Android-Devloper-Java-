package thread;

public class Soluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread("T1");
		myThread.start();
		
		
		MyThread myThread2=new MyThread("T2");
		myThread2.start();
		try {
			myThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		MyThread myThread3=new MyThread("T3");
		myThread3.start();
		//myThread.run();
		try {
			myThread2.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Welcome,The Process is running in the same time");
		
		

	}

}
