
public class SleepingThread extends Thread{
	public void run(){
		boolean canRun = true;
		
		while (canRun){
			System.out.println("SleepingThread is awake");
			try{
				System.out.println("SleepingThread is going to sleep for 1 sec.");
				this.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println("SleepingThread interrupted");
				canRun = false;
			}
		}
	}
	
	public static void main(String[] args){
		Thread sleepingThread = new SleepingThread();
		
		sleepingThread.start();
	}
}
