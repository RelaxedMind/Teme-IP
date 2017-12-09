/*Creați un applet ce afișează o miră de televiziune. Mira va conține minim 10 nivele de gri și culorile de bază: 
 * roșu, verde, albastru, galben, cyan și magenta. Mira va acoperi întreaga dimensiune a applet-ului, dimensiune 
 * definită de utilizator ca și parametri HTML.
 * */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class lab7ex4 extends Applet {

	int x,y;
	
	int r, g ,b;
	int j;
	
	
	Color gry = new Color(r, g, b);
	

	public void init(){

		
		r= 91;
		g= 91;
		b= 91;
		j = 0;
		x = Integer.parseInt(getParameter("x"));
		y = Integer.parseInt(getParameter("y"));
		
	}

	public void paint(Graphics graf) {	
		
		graf.setColor(Color.RED);
		graf.fillRect(0,0, 100, 500);
		
		graf.setColor(Color.GREEN);
		graf.fillRect(100,0, 100, 500);
		
		graf.setColor(Color.BLUE);
		graf.fillRect(200,0, 100, 500);
		
		graf.setColor(Color.YELLOW);
		graf.fillRect(300,0, 100, 500);
		
		graf.setColor(Color.CYAN);
		graf.fillRect(400,0, 100, 500);
		
		graf.setColor(Color.MAGENTA);
		graf.fillRect(500,0, 100, 500);
		
		for (int i =92; i <239;i++)
		{
			j=93-i;
			r =i;
			g = i;
			b=i;
			
			
			Color gry = new Color(r, g, b);
			
			graf.setColor(gry);
			graf.fillRect(j,500, 600, 100);
		}
		
		
	}
}
