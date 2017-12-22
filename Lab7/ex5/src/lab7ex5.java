/*Scrieți un applet Java care desenează un cerc colorat în toate culorile posibile.
 *  Se va începe cu culoarea roșie, tranzițiile dintre culori trebuie să fie line, iar cercul este 
 *  redesenat pe măsură ce culorile sunt generate.*/


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class lab7ex5 extends Applet {
	
	int rosu;
	int green;
	int albastru;
	
	
	
 
	
public void init(){

	rosu = 0;
	green = 0;
	albastru = 0;
	
	}
	public void paint(Graphics g) {
		int a=600,b=600,c=2,d=2;
		
	
		
		
//		 g.setColor(custom);		
		 for(int i = 0; i<=51; i++)
		 {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
				
			 
			 	rosu = 255;
			 	green=5*i;
			 	
			 
			 	
				Color custom = new Color(rosu, green, albastru);
			 
			 g.setColor(custom);
			
			 g.drawOval(a, b, c, d);
				a-=4;
				b-=4;
				c+=8;
				d+=8;
		 }
		 
		
		 
		 for(int i = 0; i<=17; i++)
		 {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
				
			 
			 	green = 255;
			 	 rosu -=5;
			 	
			 
			 	
				Color custom = new Color(rosu, green, albastru);
			 
			 g.setColor(custom);
			
			 g.drawOval(a, b, c, d);
				a-=4;
				b-=4;
				c+=8;
				d+=8;
		 }	
		 
		 for(int i = 0; i<=17; i++)
		 {
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException e) {}
			 
			 
			 green = 255;
			 albastru=i*5;
			 
			 
			 
			 Color custom = new Color(rosu, green, albastru);
			 
			 g.setColor(custom);
			 
			 g.drawOval(a, b, c, d);
			 a-=4;
			 b-=4;
			 c+=8;
			 d+=8;
		 }	
		 
		 for(int i = 0; i<=17; i++)
		 {
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException e) {}
			 
			 
			 albastru = 255;
			 green-=5;
			 
			 
			 
			 Color custom = new Color(rosu, green, albastru);
			 
			 g.setColor(custom);
			 
			 g.drawOval(a, b, c, d);
			 a-=4;
			 b-=4;
			 c+=8;
			 d+=8;
		 }	
		 
		 for(int i = 0; i<=17; i++)
		 {
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException e) {}
			 
			 
			 albastru = 255;
			 rosu=5*i;
			 
			 
			 
			 Color custom = new Color(rosu, green, albastru);
			 
			 g.setColor(custom);
			 
			 g.drawOval(a, b, c, d);
			 a-=4;
			 b-=4;
			 c+=8;
			 d+=8;
		 }	
		 
		 for(int i = 0; i<=17; i++)
		 {
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException e) {}
			 
			 
			rosu = 255;
			albastru-=5;
			 
			 
			 
			 Color custom = new Color(rosu, green, albastru);
			 
			 g.setColor(custom);
			 
			 g.drawOval(a, b, c, d);
			 a-=4;
			 b-=4;
			 c+=8;
			 d+=8;
		 }	
		 

	}
}