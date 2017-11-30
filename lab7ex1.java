/*Creați un applet ce preia ca și parametri HTML numele vostru și grupa din care faceți parte.  
 * Applet-ul va afișa apoi va afisa textul: "Salut {nume}! Grupa ta este {grupa}." Textul va fi de culoare
 *  albastră și centrat atât pe orizontală, cât și pe
verticală, ținând cont de dimensiunea implicită a unui applet.

*/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class lab7ex1 extends Applet{

	int grupa;
	String text = new String();
	//Graphics graphics = new Graphics();

	public void init(){

		grupa = Integer.parseInt(getParameter("grp"));
		text = getParameter("nume");
		
	}

	public void paint(Graphics g) {	
		g.setColor(Color.BLUE);
		g.drawString("Salut " +text +" Grupa mea este" +grupa , this.getWidth()/2, this.getHeight()/2);
		
	}
}