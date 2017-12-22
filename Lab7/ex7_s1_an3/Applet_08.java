import java.applet.Applet;
import java.awt.Graphics;

public class Applet_08 extends Applet{

	public void paint(Graphics g) {	
		g.drawString("Programul a fost rulat ca applet.", 10, 50);
	}

	public static void main(String... args){
		System.out.println("Programul a fost rulat ca aplicatie.");
	}
}