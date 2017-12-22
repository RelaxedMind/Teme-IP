import java.applet.*;
import java.awt.*;

public class Applet_03 extends Applet{
	Image imagine;
	
	public void init(){
		imagine = createImage(300, 200);
		Graphics graphics = imagine.getGraphics();
		graphics.setColor(Color.green);
		graphics.drawRect(10, 10, 100, 100);
		graphics.setColor(Color.blue);
		graphics.drawString("imagine creata prin cod", 10, 150);
	}

	public void paint(Graphics g){
		g.drawImage(imagine, 20, 20, this);
	}
}