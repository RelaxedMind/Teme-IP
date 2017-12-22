
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadStarter{
	public static void main(String[] args){

		//instantiere fir de executie propriu
		Thread thread1 = new MyThread();
		
		//utilizare clasa proprie care implementeaza Runnable
		Thread thread2 = new Thread(new MyRunnable());
		
		thread1.start();
		
		thread2.start();

		//expresii lambda
		Runnable another_runnable = () -> {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("Mesaj 1 " + name);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Mesaj 2 " + name);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread thread3 = new Thread(another_runnable);
		thread3.start();	

		//executori
		ExecutorService executor = Executors.newFixedThreadPool(8);
		for (int i = 0; i < 10; i++) {
			Runnable thread = new MyRunnable();
			System.out.println("Executor: fir de executie nr. "+i);
			executor.execute(thread);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {}
		System.out.println("Toate firele de executie din executor sunt terminate.");

	}
}
