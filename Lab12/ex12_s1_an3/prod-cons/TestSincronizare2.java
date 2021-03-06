
/* 
Un proces Producator genereaza numerele �ntregi de la 1 la 10, fiecare la un interval neregulat cuprins �ntre 0 si 100 de milisecunde. 
Pe masura ce le genereaza �ncearca sa le plaseze �ntr-o zona de memorie (o variabila �ntreaga) de unde sa fie citite de catre consumator. 

Un proces Consumator preia, pe r�nd, numerele generate de catre producator si le afiseaza valoarea lor pe ecran. 

Clasa Buffer incapsuleaza numerele generate; clasa are doua metode put (pentru punerea unui numar �n buffer) si get (pentru obtinerea numarului din buffer). 
*/

//varianta sincronizata

class Buffer {
	private int number = -1;
	private boolean available = false;
	public synchronized int get() {
		while (!available) {
			try {
				wait();
				//asteapta producatorul sa puna o valoare
			} catch (InterruptedException e) { }
  		}
		available = false;
		notifyAll();
		return number;
	}
	public synchronized void put(int number) {
		while (available) {
			try {
				wait();
				//asteapta consumatorul sa preia valoarea
			} catch (InterruptedException e) { }
     		}
		this.number = number;
		available = true;
		notifyAll();
	}
}


class Producator extends Thread {
	private Buffer buffer;
	public Producator(Buffer b) {
		buffer = b;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i);
			System.out.println("Producatorul a pus:\t" + i);
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) { }
		}
	}
}

class Consumator extends Thread {
	private Buffer buffer;
	public Consumator(Buffer b) {
		buffer = b;
	}
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = buffer.get();
			System.out.println("Consumatorul a primit:\t" + value);
		}
	}
}
//Clasa principala
public class TestSincronizare2 {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producator p1 = new Producator(b);
		Consumator c1 = new Consumator(b);
		p1.start();
		c1.start();
	}
}

