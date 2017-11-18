import java.util.Scanner;

/*Creati o aplicație ce verifică numerele de înmatriculare ale mașinilor din România. 
 * Formatul acestora este următorul: [L{L}][NN{N}][LLL], unde L reprezintă o literă, N o cifră, iar acoladele 
 * semnifică faptul că pentru București numărul e format dintr-o singură literă în primul grup, iar grupul de 
 * cifre poate să aibă 3 cifre. Implementați metoda de verificare a numerelor de mașină și aruncați excepții 
 * (instante ale unei clase proprii de tip exceptie) specifice fiecărei erori ce poate să apară la verificare 
 * (mesaje particularizate). De exemplu, dacă județul e compus din 2 litere, setul de cifre nu poate să aibă 
 * dimensiunea 3. Ultimele litere nu pot să conțină ”I” și ”O” pe prima și ultima poziție.
 * 
 */
public class NR_Inmatriculare extends Exception {

	NR_Inmatriculare(String msg){
		super(msg);
	}
	
	NR_Inmatriculare(){
		super();
	}
	
	public void afis(String judet, int cifre, String _3litere)
	{
		System.out.println("\nNumar inmatriculare: " +judet +" " +cifre + " " + _3litere);
	}
	
	public void verifica(String judet, int cifre, String _3litere) throws NR_Inmatriculare
	{

		if(_3litere.length() > 3 || _3litere.length() < 3)
			throw new NR_Inmatriculare("Trebuie sa fie fix 3 in campul *: L{L} NN{N} *LLL*");
		
		if(judet.length() > 2 || judet.length() < 1)
			throw new NR_Inmatriculare("Judetul are  maxim 2 litere, minim 1 litera!");
	
		int i = 0;
		while(cifre !=0)
		{
			cifre=cifre/10;
			i++;
		}
		
		if(i > 3 || i <2)
		{
			throw new NR_Inmatriculare("Nu se poate ca cifrele sa fie mai mici de 2 si mai mari ca 3");
		}
		
		if(judet.length() == 2 && i ==3)
		{	
			throw new NR_Inmatriculare("Nu exista judet din 2 litere si 3 cifre. Acelea sunt doar pentru bucuressti!!");
			
		}
		
		// Ultimele litere nu pot să conțină ”I” și ”O” pe prima și ultima poziție.
		if(_3litere.charAt(0) == 'I' || _3litere.charAt(0) == 'O' || _3litere.charAt(2) == 'I'  || _3litere.charAt(2) == 'O' )
		{
			throw new NR_Inmatriculare("Ultimele litere nu pot sa contina ”I” si ”O” pe prima si ultima pozitie.");
		}
		
		
		
	}
	
	
}

class ex3{
	public static void main(String ... args)
	{ 
		NR_Inmatriculare ob = new NR_Inmatriculare();
		
		Scanner text =new Scanner (System.in);
		Scanner nr =new Scanner (System.in);
		
		String judet = new String();
		String _3litere = new String();
		int cifre;
		
		System.out.println("Introduceti numarul de la masina de forma[L{L}][NN{N}][LLL]: ");
		
		System.out.println("Introduceti JUDETUL: ");
		judet=text.nextLine();
		
		System.out.println("Introduceti CIFRELE: ");
		cifre=nr.nextInt();
		
		System.out.println("Introduceti ULTIMELE 3 LITERE: ");
		_3litere=text.nextLine();
		
		
		try{
		ob.verifica(judet, cifre, _3litere);
		}
		
		catch(NR_Inmatriculare e){
			System.out.println("Exceptie prinsa.");
			System.out.println(e.getMessage());
			
		}
		
		ob.afis(judet, cifre, _3litere);
		
	}
}