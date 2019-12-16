package thread;
//استخدام أكثر من عملية(المعالجة المتوازية)
//يعمل عملية running لعدة بروسس بنفس الوقت

public class MyThread extends Thread {
	String pocessName;
   public MyThread(String processName) {
	   super();
	   this.pocessName=processName;
   }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int count=0;
		while (count<5) {
			System.out.println(this.pocessName+" Count: "
					+ ""+count);
		
			count++;
		}
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
	}
	

}
