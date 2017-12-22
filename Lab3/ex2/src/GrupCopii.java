/* Fie o interfață Grup ce definește următoarele metode: adăugare, eliminare, verificarea prezenței unui persoane în
	grup, listarea tuturor persoanelor prezente în grup la un moment dat și listarea în ordine alfabetică a persoanelor cu
	prenume distinct din grup. Interfața are o variabilă statică ce reține numărul de persoane aflate în grup. Când o
	persoană părăsește grupul, aceasta trebuie să-și ia la revedere de la grup.
	Implementați interfața într-o clasă denumită GrupCopii și folosiți clasa Copil definită anterior.
	*/
import java.lang.String;
import java.util.Scanner;


import java.util.Arrays;

	interface Grup {
		public String add(String pers);
		public String del(String pers);
		public String verif(String pers);
		public String show();
		public String sort();
		//public static int nr_pers = 0;
}

public class GrupCopii implements Grup{
	
	String Persoane="";
		

		@Override
		public String add(String pers) {
			Persoane = Persoane + pers + "-";
			// TODO Auto-generated method stub
			
			return null;
		}

		@Override
		public String del(String pers) {
			String combine = pers +"-";
		Persoane  = 	Persoane.replace(combine,"");
		System.out.println(pers + " A fost dat afara din grup!");
			
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String verif(String pers) {
			boolean este = false;
			
			String tab[]= Persoane.split("-");
			for(int i =0; i <tab.length;i++)
				{
				if(tab[i].equals(pers))
				{
					System.out.println("\nPersoana se afla in grup!");
					este = true;
				}
				}
		
			if (este == false)
				System.out.println("\nPersoana nu se afla in grup!");
			return null;
		}

		@Override
		public String show() {
			System.out.println("\nPersoanele sunt: ");
			String tab[]= Persoane.split("-");

			
			
				for(int i = 0; i<tab.length;i++)
				{
					System.out.println(tab[i]);
					
				}
		
			
			return null;
		}

		@Override
		public String sort() {
			
			String tab[] = Persoane.split("-");
			Arrays.sort(tab);
			System.out.println("\nGrupul sortat dupa prenumele membrilor: ");
			for(int i =0; i <tab.length;i++)
			{
				System.out.println(tab[i]);
				
			}
			return null;
		}
		
		public static void main(String[] args) {
			String persoana;
			
			Scanner person_name = new Scanner(System.in);
			Scanner decizie = new Scanner(System.in);
			System.out.println("Grupul este gol! Doriti sa adaugati membrii?");
			String raspuns=decizie.nextLine();
			
			Grup grup = new GrupCopii();
			
			if(raspuns.equals("nu"))
				System.exit(0);
			
			while(raspuns.equals("da"))
			{
				System.out.println("Cum se numeste persoana?");
				persoana = person_name.nextLine();
				grup.add(persoana);
				System.out.println("Doriti sa adaugati membrii?");
					raspuns = null;
					raspuns = decizie.nextLine();
				
			}
			
			System.out.println("Doriti sa verificati o persona din grup?");
			raspuns = null;
			raspuns = decizie.nextLine();
			
			persoana = null;
			if(raspuns.equals("da"))
			{
				System.out.println("Numele persoanei este?");
				persoana = person_name.nextLine();
				grup.verif(persoana);
				
			}
			
		
			grup.show();
			
			
			System.out.println("\nDoriti sa stergeti o persoana din grup?");
			raspuns = null;
			raspuns = decizie.nextLine();
			
			persoana = null;
			if(raspuns.equals("da"))
			{
				System.out.println("Numele persoanei este?");
				persoana = person_name.nextLine();
				grup.del(persoana);
			}
			grup.show();
			
			grup.sort();
			
	}
		
}


