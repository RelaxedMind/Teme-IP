/* Scrieți o aplicație care definește o clasă denumită Copil . Definiți metodele și variabilele membre ale 
	 * acestei clase
	pentru următoarele acțiuni/caracteristici.
	- numele copilului
	- data nașterii
	- copilul știe să se prezinte: ”Salut, numele meu este ...”
	- copilul știe să spună câti ani are
	- copilul știe să adune două numere mai mici decât 10 și să returneze rezultatul sub forma: 
	”Suma lui X și Y este Z”
	- copilul poate să spună alfabetul în forma directă, cât și inversă
	- copilul știe să spună “La revedere”
	*- copilul știe să coloreze o tablă de șah de dimensiune dată folosind culori alternative 
	(pentru culori folosiți simbolurile 1
	și 0)
	- copilul știe să joace X-0 singur 😊 (!!! Folosiți aplicația realizată în tema anterioară)
	Precizări: numele copilului și data sa de naștere nu pot fi accesate din afara clasei.
	Toate informațiile despre un Copil vor fi completate cu ajutorul unui obiect de tip Copil și variabilele și
	 metodele
	corespunzătoare acestui obiect. Interacțiunea cu un copil se va face tot prin intermediul unui obiect instanțiat
	 în main.
	=================================================================================
	*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Copil extends TicTacToe{
			
		public  void Name()
		{
			System.out.println("Salut, numele meu este Mircea");
		}
		
		public void BirthDay(int  DATE, int MONTH, int YEAR){
			
		
			
			System.out.println("My Birthday is in: " +DATE +"/"+MONTH +"/"+YEAR);
		}
		
		
		public void Age(int birthyear){
		Calendar	calendar = new GregorianCalendar();
		
		int currentyear = calendar.get(Calendar.YEAR);
		int age;
		
		age = currentyear - birthyear;
		
		System.out.println("I have " + age +" years old.");	
			
		}
		
		public void  Calculate(int x, int y){
			int z = 0;
			
			if (x < 10 && y<10)
			z = x + y;
			
			else
				System.out.println("Numerele sunt mai mari de 10");
			
			System.out.println("Suma lui " + x + " și " +y + " este " +z);
			
		}
		public void sayAlphabet(){
			System.out.println("\nAlphabet in order: ");
			for (int i = 'A'; i<='Z'; i++)
				System.out.print((char)i);
			System.out.println("\nAlphabet in reverse: ");
			for(int i = 'Z'; i>='A';i--)
				System.out.print((char)i);
		}
		
		public void sayGodbye(){
			System.out.println("\nLA Revedere!");
		}
		
		
		public void Chess(){
			int tabla[][] = new int [8][8];
			int culoare = 1; //1 - alb 0 - negru
			for (int i = 0; i <8; i++){
				System.out.println("");
				for (int j = 0; j <8; j++){
					
					
					if (i % 2 == 1 && j % 2 == 0)
					{
						culoare = 0;
						tabla[i][j] = culoare;
					}	
					
					if (i % 2 == 0 && j % 2 == 1)
					{
						culoare = 0;
						tabla[i][j] = culoare;
					}	
					
					if (i % 2 == 0 && j % 2 == 0 )
					{
						culoare = 1;
						tabla[i][j] = culoare;
					}	
					if (i % 2 == 1 && j %2 == 1)	
					{
						culoare = 1;
						tabla[i][j] = culoare;
					}
				
					System.out.print("\t" +tabla[i][j]);
					
					
				}
			}
		}
		
		public static void main(String...args)
		{
			Scanner ziua = new Scanner(System.in);
			Scanner luna = new Scanner(System.in);
			Scanner anul = new Scanner(System.in);
			
			int day;
			int month;
			int year;
			
			System.out.println("Introduceti ziua de nastrere a copilului. ");
			System.out.print("Ziua: ");
			day = ziua.nextInt();
			System.out.print("Luna: ");
			month= luna.nextInt();
			System.out.print("Anul: ");
			year = anul.nextInt();
			
			if(day > 30 || day < 0 || month > 12 || month < 0)
			{
				System.out.println("This date isn't from our century!");
				System.exit(0);
			}
			
			char matrix[][] = new char [3][3];
			Copil ob1  = new Copil();
			ob1.BirthDay(day, month, year);
			ob1.Age(year);
			ob1.Calculate(9, 9);
			ob1.sayAlphabet();
			ob1.sayGodbye();
			System.out.println("\nChess!");
			ob1.Chess();
			
			System.out.println("\n");
			
			
			
			for(int i =0; i<3;i++)
			{
				
				for(int j =0; j<3;j++)
					matrix[i][j] = '*';
			}
			System.out.println("Tic tac toe");
			EditMatrix(matrix);
		}
}
