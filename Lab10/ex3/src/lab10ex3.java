/*Se dă un fișier *.csv ce conține următoarele câmpuri separate prin simbolul /: nume, prenume, 
 * număr de telefon, data nașterii, link la profilul de Facebook. Să se citească informația din fișier și
 *  să se genereze noi fișiere (individuale) ce conțin doar persoanele cu următoarele caracteristici:
 *   persoanele născute în luna decembrie, persoane ale căror numere de telefon sunt externe României 
 *   sau au număr de telefon fix, persoane cu numele Andrei sau Nicolae și persoane ale căror link-uri de 
 *   la profilul de Facebook nu au fost customizate (conțin un șir aleator de numere la finalul acestuia).*/
import java.io .* ;	

	public class lab10ex3{

		public static void main (String[] args){
			String s1,s2=new String();
			String str=new String();
			String str2=new String();

			String nume[] = new String [100];
			String prenume[] = new String [100];
			String []tel = new String [100];
			String[] nastere = new String[100];
			String[] fb = new String[100];
			String[]fb_name = new String[100];
			String tab[];
			

			try{
			
				BufferedReader inF1=new BufferedReader (new FileReader ("date.csv"));
				s2=new String ();
				while((s1=inF1.readLine ())!=null)
					s2 +=s1;
				System.out .println("Citire din fisier: "+s2);
				inF1.close();
			 
		
				tab=s2.split("/");
				
//				for(int i = 0; i< tab.length;i++)
//				System.out.println(tab[i]);
				
			
				int j = 0;
				for(int i =0; i <(tab.length)/6;i++) //split, string tokenizer
				{
					nume[i]=new String();
					nume[i]=tab[(j)];
				
					j++;
					prenume[i]=new String();
					prenume[i]=tab[(j)];
					j++;
					//tel[i] = Integer.parseInt((tab[(4+i)%6]));
					tel[i]= new String();
					tel[i] = tab[(j)];
					j++;
					nastere[i]=new String();
					nastere[i]=tab[(j)];
					j++;
					
					fb[i]=new String();
					fb[i]=tab[(j)];
					
					j++;
					
					fb_name[i]=new String();
					fb_name[i]=tab[(j)];
					
					j++;
					
					
				}
				
					
				for(int i =0; i<tab.length;i++)
				{
				
				System.out.println("Nume: "+nume[i]);
				System.out.println("Preume: "+prenume[i]);
				System.out.println("Tel: "+tel[i]);
				System.out.println("Nastere: "+nastere[i]);
				System.out.println("Fb: "+fb[i]);
				System.out.println("Fb/Name: "+fb_name[i]);

				}
		}
			catch(IOException e){System.out .println("Exceptie: "+e);}

		
			
			/*  să se genereze noi fișiere (individuale) ce conțin doar persoanele cu următoarele caracteristici:
 *   persoanele născute în luna decembrie, persoane ale căror numere de telefon sunt externe României 
 *   sau au număr de telefon fix, persoane cu numele Andrei sau Nicolae și persoane ale căror link-uri de 
 *   la profilul de Facebook nu au fost customizate (conțin un șir aleator de numere la finalul acestuia)
 *   */
			
	String luna[];
			
		
			for(int i =0; i<tab.length;i++)
				
				if(nastere[i]!=null)
				luna=nastere[i].split(".");
			
			for(int i =0; i<luna.length;i++)
			try {
				DataOutputStream iesire=new DataOutputStream (new BufferedOutputStream (new FileOutputStream("DataInputOutputStream_01.dat")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
		
	
