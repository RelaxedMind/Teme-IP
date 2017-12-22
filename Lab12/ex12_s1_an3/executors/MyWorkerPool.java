import java.util.concurrent.*;

public class MyWorkerPool {

	public static void main(String... args) throws InterruptedException{
        
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        
	int core_pool_size = 2;
	int max_pool_size = 4;
	
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(core_pool_size, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);

	int delay = 3;
	//fir de executie obisnuit
	MyMonitorThread monitor = new MyMonitorThread(executorPool, delay);
	Thread monitorThread = new Thread(monitor);
	monitorThread.start();

	//fire de executie rulate de ThreadPoolExecutor
	for(int i=0; i<10; i++){
		executorPool.execute(new MyWorkerThread("comanda nr. "+i));
	}
        
	Thread.sleep(5000);
	//inchidere executor
	executorPool.shutdown();

	//terminare fir obisnuit
	Thread.sleep(3000);
	monitor.shutdown();
        
	}
}