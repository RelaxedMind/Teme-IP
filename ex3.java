/*Creați un applet ce afișează o imagine stocată local, cu dimensiunea de 100x100 și sub care 
 * este afișat și numele fișierului din care provine.
 * 
 */
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class ex3 extends Applet{
	Image image;

	public void init(){
		image = getImage(getCodeBase(), "image_01.jpg");
	
	}

	public void paint(Graphics g){
		g.drawImage(image, 10, 10, this);
		g.drawString("image_01.jpg", 115, 160);
		g.drawString("C:/Users/djdjr/Documents/AN 3/IP/Teme/Lab7/ex3src", 115, 180);
	}
}