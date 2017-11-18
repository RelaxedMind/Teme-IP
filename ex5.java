/*Scrieți un applet Java care desenează un cerc colorat în toate culorile posibile.
 *  Se va începe cu culoarea roșie, tranzițiile dintre culori trebuie să fie line, iar cercul este 
 *  redesenat pe măsură ce culorile sunt generate.*/


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ex5 extends Applet {
	
 
	public void paint(Graphics g) {
		int a=150,b=150,c=10,d=10;
		
		int rosu = 0;
		int galben = 0;
		int albastru = 0;
		
		 Color customColor = new Color(rosu,galben, albastru);
		
		 g.setColor(customColor);
		
		 for(int i = 0; i<255; i++)
		 {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
				
			 g.setColor(customColor);
			 rosu+=rosu;
			 g.drawOval(a, b, c, d);
				a-=10;
				b-=10;
				c+=8;
				d+=8;
		 }
		 
//		for(int i=0;i<15;i++){
//			try{
//				Thread.sleep(1000);
//				
//			}
//			catch(InterruptedException ex){}
//         
//			g.drawOval(a, b, c, d);
//			a-=10;
//			b-=10;
//			c+=8;
//			d+=8;
//		}
	}
}