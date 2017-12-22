
import java.awt.*;
import java.applet.*;


public class AppletReceiver extends Applet{
	private String message = "No message";
	
	public void receive_m(String message){
		this.message=message;
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString("Receiver", 10,20);
		g.drawString(message, 10,50);
		
	}
}//class
