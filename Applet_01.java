import java.applet.Applet;
import java.awt.Graphics;

public class Applet_01 extends Applet{

	public void init(){
		System.out.println("init...");
	}

	public void start(){
		System.out.println("start...");
	}

	public void paint(Graphics g){
		g.drawString("Applet :D", 10, this.getHeight()/2);
	}

	public void stop(){
		System.out.println("stop...");
	}

	public void destroy(){
		System.out.println("destroy...");
	}	
}