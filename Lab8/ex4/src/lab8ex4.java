/*
 * Implementați un applet Java care desenează un labirint din pătrate. Unul din pătrate (intrarea în labirint) este colorat distinct.
 *  Folosiți cursorul pentru a deplasa pătratul înspre ieșire. Orice apăsare necorespunzătoare de tastă resetează poziția pătratului 
 *  colorat și îl aduce în poziția inițială. Să se afișeze un mesaj corespunzător atunci când labirintul a fost rezolvat.
* În loc de cursor folosiți poziția mouse-ului pentru a parcurge labirintul. Atingerea marginilor labirintului sau ieșirea din acesta, 
* resetează jocul.
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class lab8ex4 extends Applet{

	int x =100;
	int y =10;
	int width =100;
	int height =100;

	public void paint(Graphics g) {	
		super.paint(g);
		
		int harta[][]={
				{0, 0, 0, 0 ,0, 0 ,0 ,0 ,0 ,0},
				{ 0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
	            { 2, 1, 1, 1, 0, 0, 0, 0, 0, 1},
	            { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
	            { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0},			//0 - perete
	            { 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},			//1-drum accesibil
	            { 0, 0, 0, 1, 1, 1, 1, 1, 0, 0},			//2-intrare
	            { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},			//3-iesire
	            { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
	            { 0, 0, 1, 0, 0, 1, 1, 1, 1, 3}};
	          
		
		
		   for (int i = 0; i <10; i++) 
		   {
		        for (int j = 0; j <10; j++) 
		        {
				        int movex = i*50;
						int movey = j*50;
				
				switch (harta[i][j])
				{
					case 0: 
					{
						g.setColor(Color.GRAY);
						g.fillRect(movex, movey, width, height);
					}	
						break;
					case 1:
					{
						g.setColor(Color.BLUE);
						g.fillRect(movex, movey, width, height);
					}	
						break;
						
					case 2:
					{
						g.setColor(Color.GREEN);
						g.fillRect(movex, movey, width, height);
					}	
						break;
						
					case 3:
					{
						g.setColor(Color.RED);
						g.fillRect(movex, movey, width, height);
					}	
						break;
						
					}
				
			}
		
		}
	}
}
