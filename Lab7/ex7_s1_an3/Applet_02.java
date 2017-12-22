import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Applet_02 extends Applet{
	Image image;

	public void init(){
		image = getImage(getCodeBase(), "image_01.jpg");
	}

	public void paint(Graphics g){
		g.drawImage(image, 10, 10, this);
	}
}