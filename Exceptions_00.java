
public class Exceptions_00{
	
	public static void main (String[] args){

		try{
			throw new Exception ("Aceasta este o exceptie");
		}
		catch(Exception e){
			System.out.println("Caught Exception");
			System.out.println("e.getMessage(): "+e.getMessage());
			System.out.println("e.toString(): "+e.toString ());
			System.out.println("e.printStackTrace():"); 	//Afiseaza stiva programului la aparitia problemei
			e.printStackTrace();
		}
		
		System.out .print("\nSi totusi continuam...");
		
		try{
			char a=(char) System.in.read(); //asteptarea apasarii unei taste
		}
		catch(java.io.IOException ex){}   //
	}
}
