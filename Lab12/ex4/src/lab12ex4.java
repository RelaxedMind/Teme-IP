import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*Se dă o urnă ce conține un singur tichet câștigător și alte 1000 de tichete necâștigătoare. 
 * În jurul urnei se află un
număr de N persoane, N – citit de la tastatură, care extrag bilete din această urnă în mod concomitent,
 iar biletele nu
sunt introduse înapoi în urnă. În momentul în care una dintre persoane extrage biletul câștigător, 
jocul se oprește.
Alternative: 1) persoanele extrag bilete secvențial; 2) biletele sunt introduse înapoi în urnă.*/


class Loto extends Thread{
	

	static int nr_castig;
	 int nr_extras;
	 int nr_pers;
	 
	 
	 
	 
	 public static void Verfif_Castig(){
		 System.out.println("Nr_castig este: " + nr_castig);
	 }
	 
	 
	 Loto(int numar){
			nr_pers = numar+1;
		}
	 
	
	public static void SetCastig(int nr){
		nr_castig = nr;
	}
	
	public void SetNumar(int extras){
		
		nr_extras = extras;
		
	}
	
	
	
	
public	void run(){
	
	
	
	System.out.print("\nNumarul extras de persoana " + nr_pers + " este: " +nr_extras );
	
	
}





}

public class lab12ex4 {

	public static void main(String[] args) {
	
		 ArrayList numbers = new ArrayList();
		   for(int i = 0; i < 1000; i++)
		   {
		     numbers.add(i+1);
		   }
		   Collections.shuffle(numbers);
		
		 
		
		
		Scanner scan = new Scanner(System.in);
		int pers;
		int nr;
		
		System.out.println("Cate persoane se afla la masa?: ");
		pers=scan.nextInt();
		
		Loto[] trd = new Loto[pers];
		
		System.out.println("Care este numarul norocos?");
		nr = scan.nextInt();
		
		Loto.SetCastig(nr);
		Loto.Verfif_Castig();
	
	
	//	int i=0;
	
//		do {
//			trd[i] = new Loto(i);
//			trd[i].SetNumar((int) numbers.get(i));		
//			trd[i].start();
//			if(nr == (int) numbers.get(i))
//				break;
//			i++;
//		} while (nr != (int) numbers.get(i));
		
		
		int j = 0;
		for(int i = 0;i<pers;i++)
		{
			
			trd[i] = new Loto(i);
			trd[i].SetNumar((int) numbers.get(j));		
			trd[i].start();
			if(i == pers-1)
				i=0;
			if(nr == (int) numbers.get(j))
				break;
		
			j++;
			
		}
	}

}
