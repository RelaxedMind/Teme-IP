/*Creați o aplicație Java ce folosește accesul sincronizat la metode pentru excludere mutuală.
 *  Creați 3 fire de execuție ce apelează simultan metode de incrementare și decrementare a unei variabile
 *   dintr-o altă clasă. Verificați dacă rezultatele sunt cele așteptate. Eliminați blocurile sincronizate 
 *   și re-evaluați rezultatele.*/


class Sync extends Thread{
	int var = 0;
	int nr;
	
	public  void run(){
		Increment();
		Decrement();
	}
	
	Sync(int numar){
		nr = numar;
	}
	
	public synchronized  void Increment(){
		
		
		var++;	
		System.out.println("Val var dupa increment a  firului de executie nr: " +nr + " este: " +var);
		
		
	
		
	}
	
	public synchronized void Decrement(){
		var--;
		System.out.println("Val var dupa decrement a  firului de executie nr: " +nr + " este: " +var);
		
	}
	
}




public class lab12ex2 {

	public static void main(String[] args) {
		Sync sync1 = new Sync(1);
		Sync sync2 = new Sync(2);
		Sync sync3 = new Sync(3);

		
		sync1.start();
		sync2.start();
	    sync3.start();
	  //  sync1.Increment();
		
	//	sync1.Increment();
	//	sync2.Increment();
//		sync3.Increment();
//		
//		sync1.Decrement();
//		sync2.Decrement();
//		sync3.Decrement();
		
	}

}
