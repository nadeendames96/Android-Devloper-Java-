package thread;

public class mainSoluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedThread synchronizedThread=new SynchronizedThread("T1");
		synchronizedThread.start();
		SynchronizedThread synchronizedThread2=new SynchronizedThread("T2");
		synchronizedThread2.start();
		SynchronizedThread synchronizedThread3=new SynchronizedThread("T3");
       synchronizedThread3.start();
       System.out.println("Running");

	}
	

}
