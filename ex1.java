/*Scrieți o aplicație Java care, în cadrul metodei main(), conține o secvență de cod care poate să arunce 
 * excepții de tip
ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException și altele 
pe care
considerați că e util să le testați. Afișați în cadrul blocurilor catch mesajul generat de aceste excepții. 
În blocul finally,
afișați mesajul ”Am prins sau nu excepții”.
*/
public class ex1 {
	
	

	public static void main(String[] args){
		int x=3;
		int y=0;
		int imp;
		
		char a[]= new char[2];
		
		
		
		String sir = null;
		
		try{
			
			//imp = x/y;
			//a[3]='x';
			//sir.toString();
		 int i = Integer.parseInt(sir);

			
		}
		catch(ArithmeticException e){
			System.out.println("e.getMessage(): "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("e.getMessage(): "+e.getMessage());
		}
		
		catch(NullPointerException e)
		{
			System.out.println("e.getMessage(): "+e.getMessage());
		}
		

		catch(NumberFormatException e)
		{
			System.out.println("e.getMessage(): "+e.getMessage());
		}
		
	}

}
