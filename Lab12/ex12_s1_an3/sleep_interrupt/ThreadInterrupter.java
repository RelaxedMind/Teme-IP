
public class ThreadInterrupter{
	public static void main(String[] args){
		System.out.println("Creating SleepingThread");
		Thread thread1 = new SleepingThread();
		
		System.out.println("Starting SleepingThread");
		thread1.start();
		
		System.out.println("Putting interrupter to sleep for 10 sec.");
		
		try{
			Thread.currentThread().sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println("ThreadInterrupter interrupted!");
		}
		
		System.out.println("Interrupting SleepingThread");
		thread1.interrupt();
	}
}
