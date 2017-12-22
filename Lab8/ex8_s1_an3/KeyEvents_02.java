
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class MyFrame extends Frame implements WindowListener{
  
	Label label;
	MyCanvas canvas;
	
	MyFrame(String title){
		super(title);
		
		setLayout(new FlowLayout());
		
		label = new Label("Click si apoi WASD ;)");
		canvas = new MyCanvas();

		add(label);
		add(canvas);
		
		this.addWindowListener(this);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(1);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}

class MyCanvas extends Canvas implements KeyListener{
	
	int x, y, radius;
	
	MyCanvas(){
		this.setSize(new Dimension(200, 200));
		this.setBackground(new Color(255, 125, 0));
		
		x = 100;
		y = 100;
		radius = 20;
		
		this.addKeyListener(this);
	}
	
	public void paint(Graphics g){
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		switch(e.getKeyChar()){
		case 'w': y -= 5; break;
		case 'a': x -= 5; break;
		case 's': y += 5; break;
		case 'd': x += 5; break;
			
		}
		
		repaint();
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

class Test{
	public static void main(String...strings){
	
		MyFrame frame = new MyFrame("Key events");
		
	}
}
