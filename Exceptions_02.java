
public class Exceptions_02{
	public double metodaPericuloasa(double x,int j) throws ArithmeticException, Exception{
		if(j==0) 
			throw new Exception ("nu se imparte la 0");  //FLOAT, DOUBLE AVEM INFINIT, -INFINIT LA IMPARTIREA CU 0
		x=x/j;
		
		return x;
	}
		
	public static void main (String[] args){
		double y = 3.3, rez;
		Exceptions_02 ob = new Exceptions_02();
		
		System.out .println("Inceput program");
		
		for(int i=-2;i<3;i++){
			rez = 0.0;
			boolean ok = true;
			try{
				rez = ob.metodaPericuloasa (y,i);
			}
			catch(ArithmeticException e){
				ok = false;
				System.out .println("Impartire cu zero");
			}
			catch(Exception e2){
				ok = false;
				System.out .println("Eroare: "+e2.getMessage());
			}
			if(ok)
				System.out .println(y + " : " + i + " = "+rez);
		}						  
	}
}
