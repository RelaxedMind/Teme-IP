/*Să se creeze o aplicație Java în cadrul căreia există o clasă ce implementează interfața Runnable. Constructorul clasei
permite definirea unui nume asociat fiecărui obiect instanțiat din clasa respectivă și de asemenea clasa are un atribut
static ce contorizează numărul de obiecte instanțiate. Metoda run() a clasei va afișa numele obiectului de un număr de
ori egal cu valoarea contorului și cu o întârziere de 1000msec între afișări.
Dintr-o clasă separată, creați mai multe fire de execuție cu obiecte diferite din clasa descrisă anterior și analizați
rezultatele afișate.
*/

class FireEX{
	
	
}

class MyRunnable implements Runnable{

	
	String nume_ob = new String();
	static int nr_ob = 0;
	Thread tred=null;
	
	MyRunnable(String nume){
		
		this.nume_ob = nume;
		nr_ob++;
		tred=new Thread(this);
		tred.start();
		
	}
	
	@Override
	public void run() {
		System.out.println("Numele obiectului este: " + nume_ob);
		System.out.println("Val contor este: " + nr_ob);
		try {
			tred.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
}


public class lab12ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
