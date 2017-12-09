import java.awt.*;
import java.applet.*;

public class Applet_09 extends Applet{

	Font  TimesRoman= new Font("TimesRoman",Font.BOLD,24);
	Font  Courier= new Font("Courier",Font.BOLD,24);
	Font  Helvetica= new Font("Helvetica",Font.BOLD,24);
	Font  Symbol= new Font("Symbol",Font.BOLD,24);

	String []fontFamilies;

	int x = 10, y = 100;

	public void init(){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontFamilies = ge.getAvailableFontFamilyNames();
	}

	public void paint(Graphics g){
    		g.setFont(TimesRoman);
    		g.drawString("Sample text",10,40);
    		g.setFont(Courier);
    		g.drawString("Sample text",10,60);
    		g.setFont(Helvetica);
    		g.drawString("Sample text",10,80);
    		

		for(int i=0; i<5; i++){
			g.setFont(new Font(fontFamilies[i], Font.ITALIC, 20));
			g.drawString(fontFamilies[i], 10, y+40*i);
		}


  	}
}


