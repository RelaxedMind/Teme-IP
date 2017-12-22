/*
 * Scrieți o aplicație Java ce citește un set de fișiere text ce conțin informațiile studenților din anul curent.
Fișierele sunt stocate pe sistemul local cu denumirea An_y_Grupa_xxxx.txt . Să se agregheze informația din aceste fișiere 
folosind SequenceInputStream și să se genereze un nou fișier ce conține toți studenții din anul curent ordonați alfabetic
 */




import java.awt.List;
import java.io .* ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;


class Studenti implements Comparable<Studenti>{
	
	private String Nume;
	private String Grupa;
	private String An;
	
	
	public void setNume(String name)
	{
		this.Nume =name;
	}
	
	public void setGrupa(String grp)
	{
		this.Grupa =grp;
	}
	
	public void setAN(String an)
	{
		this.An =an;
	}
	
	public String  getAN()
	{
		return An;
	}
	
	public String  getGrupa()
	{
		return Grupa;
	}
	
	public String  getNume()
	{
		return Nume;
	}
	
	public String toString() {
		return Nume;
	}

	@Override
		 public int compareTo(Studenti student) {
		       
		int lastCmp =  Nume.compareTo(student.getNume());
		return lastCmp;
		    }
	}
	


public class lab10ex2{
	
	
	

	
	public static void main (String[] args){
	
		
		String s2=new String ();
		String s1=new String ();
		Vector<InputStream> inputStreams = new Vector<InputStream>();
		
		
		
		
		String nume;
		String grupa,an;
		int nrStud = 0;
		Scanner name = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		String studName;
		
		nume = new String();
		studName = new String();
		grupa = new String();
		an = new String();
		
		System.out.println("Cati studenti doriti sa introduceti? ");
	
		int nr=scan.nextInt();
		
		Studenti []stud = new Studenti[nr];

				
		
		
		FileInputStream []files = new FileInputStream[nr];
		for(int j =0; j<nr;j++)
		{
		
			stud[j] = new Studenti();
			
			System.out.println("Introduceti numele studentului: ");
			studName=name.nextLine();
			stud[j].setNume(studName);;
			
			System.out.println("Introduceti grupa studentului: ");
			grupa=name.nextLine();
			stud[j].setGrupa(grupa);
			
			
			System.out.println("Introduceti anul de studiu al studentului: ");
			an=name.nextLine();
			stud[j].setAN(an);
			
		}
		
	
		Arrays.sort(stud);
		
		
		for(int j =0; j<nr;j++)
		{
			try{
				PrintWriter outF1=new PrintWriter (new BufferedWriter (new FileWriter ("An_"+stud[j].getAN()+"_"+"Grupa_"+stud[j].getGrupa()+".txt")));
				outF1 .println(stud[j].getNume());
				outF1 .println(stud[j].getGrupa());
				outF1 .println(stud[j].getAN());
				outF1.close ();
				
				BufferedReader inF1=new BufferedReader (new FileReader ("An_"+stud[j].getAN()+"_"+"Grupa_"+stud[j].getGrupa()+".txt"));
			
				while((s1=inF1.readLine ())!=null)
					s2 +=s1 + "\n";
				System.out .println("Citire din fisier: "+s2);
			
				inF1.close();
				

			}
			catch(IOException e){System.out .println("Exceptie: "+e);}
		
			
			
			try {
				files[j]=new FileInputStream("An_"+stud[j].getAN()+"_"+"Grupa_"+stud[j].getGrupa()+".txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		
		for(int j = 0; j<nr;j++)
			inputStreams.add(files[j]);
		
		Enumeration<InputStream> enu = inputStreams.elements();
		
		SequenceInputStream sis = new SequenceInputStream(enu);
		FileOutputStream iesire;
		
		try {
			iesire = new FileOutputStream("Studentii ordonati alfabetic.txt");
			int i;    
			   try {
				while((i=sis.read())!=-1)    
				   {    
				     iesire.write(i);        
				   }
			  iesire.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
	    
		   try {
			sis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	
		   for(int j=0; j<nr; j++)
			try {
				files[j].close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		   
//		PrintWriter outF2;
//		try {
//			outF2 = new PrintWriter (new BufferedWriter (new FileWriter ("Studentii ordonati alfabetic.txt")));
//			//outF1.println(sqs);
//		
//			int oneByte;
//			while ((oneByte = sis.read()) != -1) {
//				outF2.println(oneByte);
//				
//			}
//			
//			outF2.close ();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	//}
		
		
	}
}
