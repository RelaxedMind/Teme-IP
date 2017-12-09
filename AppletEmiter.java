
import java.awt.*;
import java.applet.*;


public class AppletEmiter extends Applet{
	private String msg = "";
	
	public void start(){
		AppletContext context= getAppletContext();
		int i=0;
		AppletReceiver receiver=null;
		do{
			receiver=(AppletReceiver) context.getApplet("receiver");
			i++;
			System.out.println(i);
			try{
				Thread.sleep(100);
			}catch(InterruptedException e) {}
			
		}while(i<100 && receiver ==null);
		if(receiver==null) 
			msg="No receiver found";
			else {
				receiver.receive_m("Hello");
				msg="The message was sent";
			}	
			repaint();
	}//start

	public void paint(Graphics g){
		g.drawString("Emiter", 10,20);
		g.drawString(msg, 10,50);
	}

}//class