
class SynchronizedThread extends Thread{
	//lock object
	public Object lock;
		
	public void run(){
		doSomething();
	}
	
	public void doSomething(){
		
		synchronized(lock){
			for(int i = 0; i < 100; i++){
				System.out.println("Thread " + this.getName() + " is running ");
			}
		}
	
	}
}


public class SynchronizedThreadExample{
	public static void main(String[] args){
		//create a lock object
		SynchronizedThreadExample ex = new SynchronizedThreadExample();
		
		//create first thread
		SynchronizedThread thread1 = new SynchronizedThread();
		thread1.lock = ex;
		
		//create second thread
		SynchronizedThread thread2 = new SynchronizedThread();
		thread2.lock = ex;
		
		//start both threads
		thread1.start();
		thread2.start();
	
	}
}


