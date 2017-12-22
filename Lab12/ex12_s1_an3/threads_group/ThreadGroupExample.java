
class GroupMemberThread extends Thread{
	public GroupMemberThread(ThreadGroup group, String threadName){
		super(group, threadName);
	}
	
	public void run(){
		boolean can_run = true;
		
		while (can_run){
			System.out.println(this.getName() + " running");
			
			try{
				System.out.println("Putting " + this.getName() + " to sleep");
				this.sleep(1000);
				
			}
			catch(InterruptedException e){
				System.out.println(this.getName() + " interrupted");
				can_run = false;
			}
		}
	}
}


public class ThreadGroupExample{
	public static void main(String args[]){
		
		System.out.println("creating a thread group");
		ThreadGroup group = new ThreadGroup("My Group");
		
		Thread thread1 = new GroupMemberThread(group, "thread1");
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		Thread thread2 = new GroupMemberThread(group, "thread2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		Thread thread3 = new GroupMemberThread(group, "thread3");
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		group.list();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		Thread[] threads = new Thread[group.activeCount()];
		
		group.enumerate(threads);
	
		
		for(int i = 0; i < threads.length; i++)
		{
			System.out.println("Interrupting thread " + threads[i].getName());
			threads[i].interrupt();
		}
	}
}


