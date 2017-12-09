import java.lang.Exception;
/*Creați o clasă derivată din Exception, numită SuperExceptie. O a doua clasă ExceptieMaiMica este derivată din
SuperExceptie. În constructorii claselor afisați un mesaj ce indică excepția generată.
 În cadrul unei alte clase creați o
metodă a() ce semnalizeaza (aruncă) o excepție de tip ExceptieMaiMica și o metodă b() ce aruncă o exxcepție de
 tip
SuperExceptie.
În cadrul metodei main() apelați aceste metode și încercați să determinați tipul de excepție aruncată, 
precum și dacă
blocul catch aferent tipului de exceptie ExceptieMaiMica poate prinde o SuperExcepție.*/


class SuperExceptie extends Exception{

	
	SuperExceptie(String msj){
		super(msj);
	}
}

class ExceptieMaiMica extends SuperExceptie{
	
	ExceptieMaiMica(String msj){
		super(msj);
	}
	
}

class X{
	public void a() throws ExceptieMaiMica{
		
		throw new ExceptieMaiMica("Exceptie mai mica");
		
	}
	
public void b() throws SuperExceptie{
		
	throw new SuperExceptie("Super Exceptie");
	
	}
}


class lab6ex2{
	
	public static void main(String... args){
	
		X ob = new X();
		try {
			ob.a();
		} catch (ExceptieMaiMica e1) {
			// TODO Auto-generated catch block
			System.out.println("e.getMessage(): "+e1.getMessage());
			System.out.println("e.getStackTrace(): "+e1.getStackTrace());
			
			//e1.printStackTrace();
		}
		try {
			ob.b();
		} catch (SuperExceptie e) {
			System.out.println();
			System.out.println("e.getMessage(): "+e.getMessage());
			System.out.println("e.getStackTrace(): "+e.getStackTrace());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		try {
			ob.a();
		} catch (SuperExceptie e) {
			System.out.println();
			System.out.println("e.getMessage(): "+e.getMessage());
			System.out.println("e.getStackTrace(): "+e.getStackTrace()); //Nu poate prinde exceptie mai mare
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
}