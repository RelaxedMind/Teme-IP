/*Fie un algoritm de criptare în cadrul căruia se ia un text de intrare ‘A’ format din litere mici
 și mari. 
 * Separat se definește un șir de caractere ”B” cărora li se asociază aleator câte un număr întreg
 *  de la 1 la 100.
 *  Algoritmul verifică dacă literele din șirul B există în șirul A și face suma numerelor asociate 
 *  acestora. 
 *  La suma finală se adaugă pozițiile din șirul A la care au fost găsite caracterele din șirul B.
 *   Dacă suma finală este mai mare de 100, criptarea a fost validă. Afișați un mesaj corespunzător.
Exemplu:
Șirul A = ”aTmPpDsst”
Șirul B =”ams”
Valorile asociate elementelor din șirul B: 11 33 7
Suma: (11+33+7+7)+(1+3+7+8)=77 -> CRIPTARE NEVALIDĂ
 		OutSum		InnerSUm*/

import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class criptare {
	
	public static boolean validate (int x)
	{
		boolean OK = false;
		
		if(x > 100)
			OK = true;
		
		return OK;
	}
	
	public static int RandomAndOutSum(String A,String B)
	{
		Random rand = new Random();
		int n[] = new int [B.length()];
		for (int i = 0; i< B.length(); i++)
		{
		 
		n[i]= rand.nextInt(100) + 1; 
		}
		for (int i =0; i<B.length();i++)
			System.out.println("n[" +i +"]= " + n[i]);
		
		
		//CALCULEAZA PRIMA SUMA
		int sum = 0;
		for(int i = 1; i <= A.length();i++)
		{
			for(int j=1; j<= B.length();j++)
			{		
				if(B.charAt(j-1) == A.charAt(i-1)) 
					sum += n[j-1];
			}
		}
		return sum;
	}
		
	
	//CALCULEAZA A DOAU SUMA
	public static int InnerSum(String A, String B){
		int sum = 0;
		for(int i = 1; i <= A.length();i++)
		{
			for(int j=1; j<= B.length();j++)
			{		
				if(B.charAt(j-1) == A.charAt(i-1)) //char (j-1) pt  am inceput iteratia de la 1 iar prima pozitie a stringului e 0
													//alta metoda mai evidenta nu am gasit
					sum += i; 
			}
		}
		return sum;
	}
	
	public static void main (String []args)
	{
	//String A = "aTmPpDsst";
	//String B = "ams";
	int OutSum = 0;
	int BigSum = 0;
	String A = null;
	String B = null;
	
	System.out.println("Introduceti primul sir: ");
	Scanner varA = new Scanner(System.in);
	A = varA.nextLine();
	
	System.out.println("Introduceti al doilea sir: ");
	Scanner varB = new Scanner(System.in);
	B = varB.nextLine();
	
	System.out.println("InnerSum = " +InnerSum(A,B));
	OutSum = RandomAndOutSum(A, B);
	System.out.println("OutSum = " +OutSum);
	BigSum = InnerSum(A,B) + OutSum;
	System.out.println("Suma mare= " + BigSum);
	System.out.println("Validare criuptare: " +validate(BigSum));
	}
	
}
