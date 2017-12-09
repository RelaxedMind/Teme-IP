import java.util.Scanner;

/*Se dă o interfață a unui calculator simplu cu funcțiile: adunare, scădere, înmulțire, împărțire, 
 * radical 
 * și ridicare la
putere. Implementați interfața astfel încât operațiile să fie amestecate, de exemplu adunarea să 
returneze împărțirea
numerelor, etc.*/

public interface Calculator {
	public double adunare(double a , double b);
	public double scadere(double a , double b);
	public double inmultire(double a , double b);
	public double impartire(double a , double b);
	public double radical(double a);
	public double patrat(double a);

}

class C1 implements Calculator{

	@Override
	public double adunare(double a, double b) {
		
		
		return a/b;
		
	}

	@Override
	public double scadere(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
		
	}

	@Override
	public double inmultire(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
		
	}

	@Override
	public double impartire(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
		
	}

	@Override
	public double radical(double a) {
		// TODO Auto-generated method stub
		return Math.sqrt(a);
		
	}

	@Override
	public double patrat(double a) {
		return a*a;
		// TODO Auto-generated method stub
		
	}
	
	
}

class Test{
	
	public static void main(String... args){
		Calculator calc = new C1();
		Scanner decizie = new Scanner (System.in);
		
		System.out.println("a si b sunt: ");
		double a = decizie.nextDouble();
		double b = decizie.nextDouble();
		
		System.out.println("Adunare " +calc.adunare(a, b));
		System.out.println("Impartire " +calc.impartire(a, b));
		System.out.println("Inmultire " +calc.inmultire(a, b));
		System.out.println("Patrat " +calc.patrat(a));
		System.out.println("Radical " +calc.radical(a));
		System.out.println("Scadere " +calc.scadere(a, b));
		
	}
}
