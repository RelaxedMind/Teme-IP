package dbInteractiont;
/*
 * Fie un pachet de clase și interfețe Java denumit dbInteraction ce permite interacțiunea cu o
 *  bază de date pe baza autentificării unui utilizator.
 *  Pachetul conține următoarele componente:
- o clasă ce definește obiecte de tip Person și care au atributele private nume, prenume, 
adresă de e-mail, userID și parolă, alături de metodele 
accesor și mutator corespunzătoare.
- o interfață pentru autentificare cu metodele createUser(), deleteUser() și login().
 Metodele au ca parametru de intrare un obiect de tip Person 
si returnează un șir de variabile de tip Person. Pentru login() se definește în interfață o
 listă de utilizatori default: admin, dbAdmin și superUser.
- o clasă abstractă VerifyPerson ce extinde clasa Person și implementează metode de verificare
 a formatelor pentru nume, prenume, adresă de e-mail, 
userID și parolă după următoarele specificații:
* numele și prenumele nu pot să conțină alte simboluri decât cele alfabetice
* lungimea numelui și a prenumelui nu poate să fie mai mare de 50 de caractere
* adresa de e-mail trebuie să fie de forma: [a-zA-Z._]@[a-zA-Z.].[a-zA-Z]{2-5}
- clasa abstractă definește, dar nu implementează metodele de verificare a userID și a parolei
*/

interface Auth{
	  String[] createUser(Person ob1);
	  String[] deleteUser(Person ob1);
	default void login(Person ob1){
		  
		String admin;
		String dbAdmin;
		String superUser;
		
	  }
}

class Person{

	private String user[];
	private String nume;
	private String prenume;
	private String mail;
	private String userid;
	private String password;
	
	
//setter
	public void  SetNume(String name)
	{
		nume = name;
	
	}
	
	public void  SetPrenume(String prenume)
	{
		this.prenume = prenume;
	
	}
	
	public void  SetMail(String mail)
	{
		this.mail = mail;
	
	}
	
	public void  SetUser(String user)
	{
		userid = user;	
	}

	
	public void  SetPassWord(String pass)
	{
		password = pass;	
	}
	
	
	//getter
	
	public String  GetNume(String name)
	{
		return name;
	
	}
	
	public String  GetPrenume(String prenume)
	{
		return  prenume;
	
	}
	
	public String  GetMail(String mail)
	{
		return  mail;
	
	}
	
	public String  GetUser(String user)
	{
		return  user;	
	}
	
	public String [] GetUsers(String[] user)
	{
		return  user;	
	}

	
	public String  GetPassWord(String pass)
	{
		return  pass;	
	}

	
	//Metodele au ca parametru de intrare un obiect de tip Person si returnează un șir de variabile de tip Person.
	
	
	

}
/*implementează metode de verificare a formatelor pentru nume, prenume, adresă de e-mail, 
userID și parolă după următoarele specificații:
* numele și prenumele nu pot să conțină alte simboluri decât cele alfabetice
* lungimea numelui și a prenumelui nu poate să fie mai mare de 50 de caractere
* adresa de e-mail trebuie să fie de forma: [a-z A-Z._]@[a-zA-Z.].[a-zA-Z]{2-5}
- clasa abstractă definește, dar nu implementează metodele de verificare a userID și a parolei
*/

abstract class VerifyPerson extends Person{
	
	public void VerifNume(String nume)
	{
		nume = nume.toUpperCase();
		for(int i = 0;i <nume.length();i++)
		{
			if(nume.charAt(i) <'A' || nume.charAt(i)>'Z')
			{
			System.out.println("Numele poate contine doar caractere alfabetice");	
			System.out.println(nume.charAt(i)+"nu este o litera");	
			
			}
			
			if(nume.length() >50)
			System.out.println("Lungimea numelui și a prenumelui nu poate să fie mai mare de 50 de caractere");
				
		}
	}
	
	public void VerifPrenume(String prenume)
	{
		prenume = prenume.toUpperCase();
		for(int i = 0;i <prenume.length();i++)
		{
			if(prenume.charAt(i) <'A' || prenume.charAt(i)>'Z')
			{
			System.out.println("prenumele poate contine doar caractere alfabetice");	
			System.out.println(prenume.charAt(i)+"nu este o litera");	
			
			}
			
			if(prenume.length() >50)
				System.out.println("Lungimea numelui și a prenumelui nu poate să fie mai mare de 50 de caractere");
		}
	}
	
	public void VerifAdresa(String adresa)
	{
		adresa = adresa.toUpperCase();
		
		if(adresa.charAt(0) == '@');
		System.out.println("Adresa Invalida, nu poate incepe cu @");
		for(int i = 0;i <adresa.length();i++)
		{
					
			if(adresa.charAt(i) == '.');
			{	
				int cont = 0;
				for(int k = i; k<adresa.length();k++)
					cont++;
				if(cont <2 || cont >5)
					System.out.println("Adresa Invalida, Nu poti avea mai putin de 2 caractere dupa [.] sau mai mult de 5");
				
				
			}
			
			if(adresa.charAt(i) <'A' || adresa.charAt(i)>'Z')
			{
			System.out.println("adresale poate contine doar caractere alfabetice");	
			System.out.println(adresa.charAt(i)+"nu este o litera");	
			
			}
			
			if(adresa.length() >50)
			System.out.println("Lungimea adresalui și a preadresalui nu poate să fie mai mare de 50 de caractere");
				
		}
	}
	
	
	public abstract void VerifPass(String pass);
	public abstract void VerifUserId(String user);
	
	
	
	
	
}




//class Launch {
//
//	public static void main(String[] args) {
//		
//		String tab[] = new String[1];
//		
//		Auth pers = new Person();
//		Person persoana = new Person();
//		persoana.SetNume("Mircea");
//		persoana.SetPrenume("Flaviu");
//		persoana.SetMail("aaa@aaa.com");
//		tab = pers.createUser(persoana);
//		persoana.GetUsers(pers.createUser(tab));
//	
	

//	}
//
//}
