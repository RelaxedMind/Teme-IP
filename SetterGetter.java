import java.util.*;
import java.lang.Comparable;


/*Implementați o aplicație în cadrul căreia să aveți o clasă SetterGetter generică ce permite setarea și returnarea
valorilor atributelor pentru mai multe tipuri de obiecte. De exemplu, având clasele Copil, Adult și Pensionar, să se poată
seta și returna numele și vârsta acestora. Creați colecții cu intrări unice de obiecte de tip Copil, Adult, Pensionar pe care
să le populați cu date citite din consolă. Afișați datele preluate în diverite moduri.
*/

public class SetterGetter<T> {
	
	protected T name;
	protected T age;


	public String toString() {
		return name + " " + age;    //Suprascrisa
	}
	
//	
//	public void Set(Object o, String nume){
//		
//		if(o instanceof Copil)
//		{
//			
//			this.name = (T) nume;
//			//this.age = (T) varsta;
//		//	this.age=varsta;
//			
//		}
	
	public void Set(T nume, T varsta){
		
	
		
		this.name =nume;
		this.age = varsta;
		
			//this.age = (T) varsta;
		//	this.age=varsta;
			
		
			
//		if(nume instanceof Adult && varsta instanceof Adult)
//		{
//			
//			this.name = nume;
//			this.age=varsta;
//			
//		}
//		
//		if(nume instanceof Pensionar && varsta instanceof Pensionar)
//		{
//			
//			this.name = nume;
//			this.age=varsta;
//			
//		}
	}

	
public T GetName(){
		
		
		{
			return (T) this.name;
		}
			
}

public T GetAge(){
	
	
		return (T) this.age;

}

 }

class Copil<T> extends SetterGetter<T>{
	
//	String nume;
//	int varsta;
	
	Copil(T nume, T varsta)
	{
		this.name= nume;
		this.age=varsta;
	}
	
	Copil()
	{
	}
	
}
class Adult<T> extends SetterGetter<T>{
	
	
	
	Adult(T nume, T varsta)
	{
		this.name= nume;
		this.age=varsta;
	}
	
	Adult(){
		
	}
}
	

class Pensionar<T> extends SetterGetter<T>{
	
	
	
	Pensionar(T nume, T varsta)
	{
		this.name=nume;
		this.age=varsta;
	}
	
	Pensionar()
	{
		
	}
}




class ex3{
	public static void main(String[] args) {
		//Copil copil = new Copil("Andrei", 10);
		Copil copil = new Copil();
		Adult adult = new Adult();
	
//	/////////////Copil/////////////////////////////////	
		copil.Set("Mircea", 10);
		System.out.println("Test metode: " + copil.GetName());
		System.out.println("Test metode: " + copil.GetAge());
		
		copil.Set("Flaviu", 13);
		System.out.println("Test metode: " + copil.GetName());
		System.out.println("Test metode: " + copil.GetAge());
		
		System.out.println("Test metode: " + adult.GetName()); //null deoarece nu a fost facuta nici o instanta
		
		
		Scanner nmr = new Scanner(System.in);
		Scanner nume = new Scanner(System.in);
		int nr;
		
		
		System.out.println("Cati copii sunt in clasa?");
		nr = nmr.nextInt();
		
		String name[] = new String[nr];
		int[] age= new int[nr];
		
		List<Copil> list_copii = new ArrayList<Copil>();
		for(int i = 0; i <nr;i++)
		{
			System.out.print("Numele " +(i+1)+ " copil: ");
			name[i] = nume.nextLine();
			
			System.out.print("Varsta lui " + name[i]+": ");
			age[i] = nmr.nextInt();
			
			Copil cop = new Copil(name[i], age[i]);
			
			//copil.Set(name[i], age[i]);
			list_copii.add(cop);
		}
		
		System.out.println(list_copii);
	///////////////////Adult//////////////////////
		
		System.out.println("Cati adulti sunt in clasa?");
		nr = nmr.nextInt();
		
		name = null;
		name = new String[nr];
		
		age = null;
		age= new int[nr];
		
		List<Adult> list_adult= new ArrayList<Adult>();
		for(int i = 0; i <nr;i++)
		{
			System.out.print("Numele " +(i+1)+ " Adult: ");
			name[i] = nume.nextLine();
			
			System.out.print("Varsta lui " + name[i]+": ");
			age[i] = nmr.nextInt();
			
			Adult adult1 = new Adult(name[i], age[i]);
			
			//Adult.Set(name[i], age[i]);
			list_adult.add(adult1);
		}
		
		System.out.println(list_adult);
		/////////Pensionar////////////////
		
		System.out.println("Cati pensionari sunt in clasa?");
		nr = nmr.nextInt();
		
		name = null;
		name = new String[nr];
		
		age = null;
		age= new int[nr];
		
		List<Pensionar> list_Pensionar= new ArrayList<Pensionar>();
		for(int i = 0; i <nr;i++)
		{
			System.out.print("Numele " +(i+1)+ " Pensionar: ");
			name[i] = nume.nextLine();
			
			System.out.print("Varsta lui " + name[i]+": ");
			age[i] = nmr.nextInt();
			
			Pensionar Pensionar1 = new Pensionar(name[i], age[i]);
			
			//Pensionar.Set(name[i], age[i]);
			list_Pensionar.add(Pensionar1);
		}
		
		System.out.println(list_Pensionar);
		
		adult.Set("Mircea", 22);
		System.out.println("Test metode: " + adult.GetName()); 

		
	}
}
