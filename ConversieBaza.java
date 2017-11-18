import java.util.Scanner;

/*
 Scrieti o aplicatie Java care defineste o valoare intreaga si apoi calculeaza si afiseaza reprezentarea ei binară, octală și
hexazecimală. Scrieți funcții de calcul a valorilor în diferite baze.
*/
public class ConversieBaza {

	public static void ToBinary(int x)
	{
		
		if (x > 0)
		{
			
			ToBinary(x/2);
			System.out.print(x%2);
		}
		
		
	}
	
	public static void ToOctal(int x)
	{
		
		if (x > 0)
		{
			
			ToOctal(x/8);
			System.out.print(x%8);
		}
		
		
	}
	
	public static void ToHexa(int x)
	{
		
		if (x > 0)
		{
			
			ToHexa(x/16);
			
			switch (x%16)
			{
				case 10:  System.out.print("A"); 
				break;
				case 11:  System.out.print("B");  
				break;
				case 12:  System.out.print("C");  
				break;
				case 13:  System.out.print("D");  
				break;
				case 14:  System.out.print("E");  
				break;
				case 15:  System.out.print("F");  
				break;
				
				default: System.out.print(x%16);
				break;
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int intreg;
		Scanner val = new Scanner(System.in);
		
		System.out.println("Introduceti numarul in baza 10: ");
		intreg = val.nextInt();
		
	//	int intreg = 15150;
		System.out.print("Numarul in binar: ");
		ToBinary(intreg);
		
		System.out.println("");
		
		System.out.print("Numarul in octal: ");
		ToOctal(intreg);
		
		
		System.out.println("");
		
		System.out.print("Numarul in hexa: ");
		ToHexa(intreg);
		
		
	}

}
