package thread;

public class SynchronizedThread extends Thread {
	static String p;
	public  SynchronizedThread(String p) {
		// TODO Auto-generated constructor stub
     super();
	this.p=p;
	}
    @Override
    public void run() {
    	// TODO Auto-generated method stub
//    	super.run();
    	Display();
    }
    synchronized static void Display() {
    	int count=0;
    	while (count<5) {
			System.out.println(SynchronizedThread.p+" Count: "+count);
    		count++;
			
		}
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
