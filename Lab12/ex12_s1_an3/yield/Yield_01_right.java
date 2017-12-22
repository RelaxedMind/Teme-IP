
class Selfish extends Thread {
	public Selfish(String name) {
		super(name);
	}
	public void run() {
		int i = 0;
		while (i < 100000) {
			//bucla stransa care acapareaza procesorul
			i ++;
			if (i % 100 == 0) 
				System.out.println(getName()+" a ajuns la "+i);
			yield();
		}
	}
}
//clasa principala
class TestSelfishThread {
	public static void main(String args[]) {
		int i;
		Selfish threads[] = new Selfish[10]; 

		for(i=0; i<threads.length; i++){
			threads[i] = new Selfish("Firul "+(i+1));
			threads[i].setPriority (Thread.MAX_PRIORITY);
		}
	    	for(i=0; i<threads.length; i++){
			threads[i].start();
		}
	}
}
