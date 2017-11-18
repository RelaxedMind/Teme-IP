import java.applet.Applet;
import java.awt.Graphics;

public class Applet_07 extends Applet{

	int external_val;

	public void init(){

		external_val = Integer.parseInt(getParameter("v1"));
		
	}

	public void paint(Graphics g) {	
		g.drawString("valoarea citita din fisierul HTML: "+external_val, 10, 50);
	}
}