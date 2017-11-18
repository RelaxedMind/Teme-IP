
public class Exceptions_01{
	public float metodaPericuloasa(int x,int j) throws ArithmeticException{

		//float rez = (float)x/j; //Infinity
		float rez = x/j;
		
		return rez;
	}
		
	public static void main (String[] args){
		int y = 3;
		float rez;

		Exceptions_01 ob = new Exceptions_01();
		
		System.out .println("Inceput program");
		
		for(int i=-2;i<3;i++){
			rez = 0;
			boolean ok = true;
			try{
				rez = ob.metodaPericuloasa (y,i);
			}
			catch(ArithmeticException e){
				ok = false;
				System.out .println("Impartire cu zero");
			}
			if(ok)
				System.out .println(y + " : " + i + " = "+rez);
		}						  
	}
}
