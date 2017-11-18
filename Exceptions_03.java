
public class Exceptions_03{
	public static void f() throws Exception {
		System.out.println("exceptie in metoda f()");
		throw new Exception ("exceptie aruncata din metoda f()");
	}
	public static void g() throws Throwable { //Throwable O ARUNCA MAI DEPARTE
		try {
			f();
		}catch(Exception e) {
			System.out .println("Exceptie prinsa in metoda g(): "+e.getMessage());
			throw e;
		}
	}
			
	
	public static void main (String[] args) throws Throwable{
		try {
			g();
		}
		catch(Exception e) {
			System.out .println("Exceptie prinsa in metoda main(): "+ e.getMessage ());
		}
	
		System.out .print("\nApasati ENTER pentru terminare...");
		try{
			char a=(char) System.in.read ();
		}
		catch(java.io.IOException ex){}
	}
}
