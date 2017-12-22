import java.applet.Applet;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class Applet_06 extends Applet implements MouseListener{

	Image image, offscreen_image;
	Graphics offscreen_graphics;

	int a, b;
	boolean sens = false;

	boolean first_run = true;

	public void init(){

		a = 10; 
		b = 10;

		offscreen_image = createImage(this.getWidth(), this.getHeight());
		offscreen_graphics = offscreen_image.getGraphics();
		image = getImage(getCodeBase(), "image_01.jpg");

		this.addMouseListener(this);

		doIt();
		
	}

	public void setA(int a){
		this.a = a;
	}

	public void setB(int b){
		this.b = b;
	}

	public int getA(){
		return a;
	}

	public int getB(){
		return b;
	}

	public boolean getSens(){
		return sens;
	}

	public void doIt(){	
		offscreen_graphics.setColor(Color.GREEN);
		offscreen_graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

		if(first_run){
			offscreen_graphics.setColor(Color.BLACK);
			offscreen_graphics.drawString("Click pt. animatie", 10, 10);
			first_run = false;
		}

		offscreen_graphics.drawImage(image, a, b, this);
		repaint();
	}
	
	public void mousePressed(MouseEvent e){
		AnimationThread animation = new AnimationThread(this);
		animation.start();
		sens = !sens;
	}


	public void mouseClicked(MouseEvent e){

	}

	public void mouseEntered(MouseEvent e){

	}

	public void mouseExited(MouseEvent e){

	}	

	public void mouseReleased(MouseEvent e){

	}	

	public void paint(Graphics g) {	
		g.drawImage(offscreen_image, 0, 0, this);
	}
}

class AnimationThread extends Thread{
	
	Applet_06 applet;

	AnimationThread(Applet_06 applet){
		this.applet = applet;
	}

	public void run(){
		for(int i=0; i<15; i++){
			try{
				this.sleep(10);
			}
			catch(InterruptedException iex){}
			int increment = 1;
			if(!applet.getSens())
				increment = -1;

			applet.setA(applet.getA()+(increment)*10);
			applet.setB(applet.getB()+1);
			applet.doIt();
		}
	}
}
