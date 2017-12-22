
/* 
Un proces Producator genereaza numerele întregi de la 1 la 10, fiecare la un interval neregulat cuprins între 0 si 100 de milisecunde. 
Pe masura ce le genereaza încearca sa le plaseze într-o zona de memorie (o variabila întreaga) de unde sa fie citite de catre consumator. 

Un proces Consumator preia, pe rând, numerele generate de catre producator si le afiseaza valoarea lor pe ecran. 

Clasa Buffer incapsuleaza numerele generate; clasa are doua metode put (pentru punerea unui numar în buffer) si get (pentru obtinerea numarului din buffer). 
*/

//varianta nesincronizata
class Buffer {
	private int number = -1;
		
	public int get() {
        return number;
	}
			
	public void put(int number) {
		this.number = number;
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
public class TestSincronizare1 {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producator p1 = new Producator(b);
		Consumator c1 = new Consumator(b);
		p1.start();
		c1.start();
	}
}

