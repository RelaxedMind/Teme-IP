/*Se dă un fișier *.csv ce conține următoarele câmpuri separate prin simbolul /: nume, prenume, 
 * număr de telefon, data nașterii, link la profilul de Facebook. Să se citească informația din fișier și
 *  să se genereze noi fișiere (individuale) ce conțin doar persoanele cu următoarele caracteristici:
 *   persoanele născute în luna decembrie, persoane ale căror numere de telefon sunt externe României 
 *   sau au număr de telefon fix, persoane cu numele Andrei sau Nicolae și persoane ale căror link-uri de 
 *   la profilul de Facebook nu au fost customizate (conțin un șir aleator de numere la finalul acestuia).*/
import java.io .* ;	

	public class lab10ex1{

		public static void main (String[] args){
			String s1,s2=new String();
			String str=new String();
			String str2=new String();
			
			try{
				BufferedReader bufRead=new BufferedReader (new InputStreamReader (System.in));
				System.out .println ("Datele din fisier? in format:  nume/prenume/ număr de telefon/ data nașterii/ link la profilul de Facebook");
				str=bufRead.readLine ();
				System.out .println("Linia scrisa este: "+str);
		
				bufRead.close ();
			}
			catch(IOException e){System.out .println("Eroare citire" +e);}
			
			try{
				PrintWriter outF1=new PrintWriter (new BufferedWriter (new FileWriter ("date.csv")));
				outF1 .println(str);
				outF1.close ();
				
				BufferedReader inF1=new BufferedReader (new FileReader ("date.csv"));
				s2=new String ();
				while((s1=inF1.readLine ())!=null)
					s2 +=s1 + "\n";
				System.out .println("Citire din fisier: "+s2);
				inF1.close();
				
				BufferedReader inF2=new BufferedReader (new FileReader ("date.csv"));
				s2=new String ();
				while((s1=inF2.readLine()) != null)
				{
					if(inF2.read)
				 PrintWriter nume = new PrintWriter (new BufferedWriter (new FileWriter ("nume.csv")));
					s2 +=s1 + "\n";
					nume.println(s2);
					nume.close();
					
				//System.out .println("Citire din fisier: "+s2);
				inF2.close();
				
				}
				
				
//				PrintWriter outF2=new PrintWriter (new FileWriter ("test.dat"));
//				outF2.println("Asta este altceva");
//				outF2.close();
//				
//				BufferedReader inF2=new BufferedReader (new FileReader ("test.dat"));
//				while((s1=inF2.readLine ())!=null)
//					s2 +=s1 + "\n";
//				System.out .println("Citire din fisier: "+s2);
//				inF2.close();
//				
//				System.out .println("Citire BufferedReader-StringReader");
//				BufferedReader inBS=new BufferedReader (new StringReader (str2));
//				System.out .println(inBS.readLine());
		}
			catch(IOException e){System.out .println("Exceptie: "+e);}

				
	}
	}
