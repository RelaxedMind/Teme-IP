import java.applet.Applet;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;

public class Applet_05 extends Applet {

	Image image;

	public void init(){
		image = getImage(getCodeBase(), "image_01.jpg");

	}

	public void paint(Graphics g) {
		int a=10,b=10;
	
		for(int i=0;i<15;i++){
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException ex){}
         		g.setColor(new Color(0, 255, 0));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.drawImage(image, a, b, this);
			b+=10;
			a+=1;
		}
	}
}