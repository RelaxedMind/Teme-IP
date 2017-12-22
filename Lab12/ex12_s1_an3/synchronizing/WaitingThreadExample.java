
class WaitingThread extends Thread{
	public Object lock;
		
	public WaitingThread(String name){
		super(name);
	}
	
	public void run(){
		doSomething();
	}
	
	public void doSomething(){
		//thread obtains a lock
		synchronized(lock){
			try{
				lock.wait();
			}
			catch(InterruptedException e){
				System.out.println("WaitingThread interrupted");
			}
			
			for(int i = 0; i < 100; i++){
				System.out.println("Thread " + this.getName() + " is running ");
			}
		}
	}
}


class FirstThread extends Thread{
	public Object lock;
	
	public FirstThread(String name){
		super(name);
	}
		
	public void run(){
		doSomething();
	}
	
	public void doSomething(){
		//obtains a lock
		synchronized(lock){
			for(int i = 0; i < 100; i++){
				System.out.println("Thread " + this.getName() + " is running ");
			}
			
			//notifies waiting thread that it is finished
			lock.notifyAll();
		}
	
	}
}


public class WaitingThreadExample{
	public static void main(String[] args){
		WaitingThreadExample ex = new WaitingThreadExample();
		
		WaitingThread thread1 = new WaitingThread("Waiting");
		thread1.lock = ex;
		
		FirstThread thread2 = new FirstThread("First");
		thread2.lock = ex;
		
		thread1.start();
		thread2.start();
	
	}
}
