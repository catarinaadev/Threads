package threads;

public class Colleague extends Thread {

	public Colleague(String threadName) {
		super(threadName);
	}

	public Colleague() {}
	@Override
	public void run() {
		super.run();
		for(int i=0;i < 5 ;i++) {
			try {
				Thread.sleep(300);
				//System.out.println(i);
				System.out.println(Thread.currentThread().getName()+ i);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
