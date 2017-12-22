import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;



/*Creați un applet ce desenează o mașină schematică și afișează textul ”Vruuummm!”. 
 * Culoarea liniilor ce delimitează mașina, precum și culorile roților și a textului vor fi preluate 
 * ca și parametri HTML individuali, dați sub forma unei secvențe de 3 întregi separați prin virgulă. 
 * De ex. Parametru=”culoare_masina”, Valoare=”123, 123, 123”.
* Folosind principiul de double buffering, creați o imagine de dimensiune 200x200 care să conțină mașina 
* desenată anterior și care să se deplaseze spre dreapta cu câte 5px până ce iese din applet complet. */

public class lab7ex6 extends Applet{
	Image imagine;
	
	Color cul_roti;
	Color cul_linii;
	Color cul_text;
	
	
	public void init(){
		
		
		//cul_roti=new Color(Integer.parseInt(getParameter("roti")));
		//cul_linii=new Color(Integer.parseInt(getParameter("linii")));
		
		
		cul_text= new Color (Integer.parseInt(getParameter("text")));
		
	//	masina.setColor(Color.blue);
	//	masina.drawString("imagine creata prin cod", 10, 150);
		
//		imagine = createImage(200, 200);
//		Graphics graphics = imagine.getGraphics();
//		graphics.setColor(Color.green);
//		graphics.drawRect(10, 10, 100, 100);
//		graphics.setColor(Color.blue);
//		graphics.drawString("imagine creata prin cod", 10, 150);
	}

	public void paint(Graphics masina){
	//	g.drawImage(imagine, 20, 20, this);
		
		masina.setColor(Color.RED);
		masina.drawRect(10, 10, 100, 100);
		masina.setColor(cul_text);
		masina.drawRect(110, 20, 100, 100);
	}
}

