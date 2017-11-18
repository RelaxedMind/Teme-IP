/*Implementa?i jocul X-0 naiv ca ?i joc automat. Programul va selecta aleator la fiecare pas o pozi?ie pe care o va
completa fie cu X, fie cu 0 în mod alternativ. Pozi?ia selectata nu poate fi una completata deja. Jocul se termina atunci
când nu mai exista casu?e libere sau când unul dintre jucatori a ob?inut o linie, coloana sau diagonala completa. Afi?a?i
pe ecran fiecare pas al algoritmului sub forma unei matrici, caracterul * va reprezenta o casu?a necompletata. De ex:
X * *
* * *
* * *
--
X * *
* 0 *
* * *
--
X * *
* 0 *
X * *
--
X * 0
* 0 *
X * *
--
X * 0
X 0 *
X * *
Joc terminat!
--------
*Extinde?i aplica?ia astfel încât dimensiunile tablei de joc sa poata fi variabile.
=================================================================================
*/
import java.util.Random;
public class TicTacToe {

	public static void ShowMatrix(char matrix[][]){
		
		for(int i =0; i<3;i++)
		{	System.out.println();
			for(int j =0; j<3;j++)		
			{	
				System.out.print("\t" +matrix[i][j]);
			
			}
		}
		
		System.out.println("");
		
	}
	
	
	
	
	public static boolean GameOver(char matrix[][]){
		
		boolean GO = false;
		
		if(matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2] &&  matrix[0][0] != '*' || 
				matrix[0][0] == matrix[0][1] && matrix[0][0] == matrix[0][2] &&  matrix[0][0] != '*'||
				matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0] &&  matrix[0][0] != '*'||
				matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0] &&  matrix[0][2] != '*'||
				matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2] &&  matrix[0][2] != '*'||
				matrix[1][2] == matrix[1][1] && matrix[1][2] == matrix[1][0] &&  matrix[1][2] != '*'||
				matrix[2][2] == matrix[2][1] && matrix[2][2] == matrix[2][0] &&  matrix[2][2] != '*'||
				matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1] &&  matrix[0][1] != '*') 
		{	
			GO = true;

		}
		
		return GO;
	}
	
	public static boolean MatrixHasSpace(char matrix[][])	{ //Verifica daca mai sunt elemente in matrice
		
		boolean verif = false;
		
		for(int i =0; i<3;i++)
		{
			
			for(int j =0; j<3;j++)
				{
					if (matrix[i][j] == '*')
						{
							verif = true;
							break;
						}	
				
				}	
		}
		return verif;
	}
	

	
public static char[][] EditMatrix(char matrix[][]){
		int a;
		int b;
		boolean XorY = true; //X=true | Y = false 
		
		Random rand = new Random();
		a=rand.nextInt(3);
		b=rand.nextInt(3);
		
		
			
			do{	
		
				a=rand.nextInt(3);
				b=rand.nextInt(3);
				
				if (XorY == true && matrix[a][b] != '0' && matrix[a][b] != 'X')
				{
					matrix[a][b] = 'X';
					XorY = false;
				
				}
			
				
				
					
				
				if (XorY == false && matrix[a][b] != 'X' && matrix[a][b] != '0')
				{
					matrix[a][b] = '0';
					XorY = true;
				
				}
				ShowMatrix(matrix);
				if (GameOver(matrix))
					{
					System.out.println("GAME OVER");
					break;
					}
			}while (MatrixHasSpace(matrix) == true);
			
			return matrix;
	
}
	
		public static void main(String[] args) {
		char matrix[][] = new char [3][3];
		
		for(int i =0; i<3;i++)
		{
			
			for(int j =0; j<3;j++)
				matrix[i][j] = '*';
		}
		//Generate matrix
				EditMatrix(matrix);
			//	ShowMatrix(matrix);
	
				if(MatrixHasSpace(matrix) == false)
			System.out.println("Nu mai sunt elemente vide in matrice!!!");
		
		
		

	}
}
