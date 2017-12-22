
import java.awt.*;
import javax.swing.*;

public class Animation_02 extends JFrame{

	MyCanvas canvas;
	JLabel label;
	MyThread thread;

	Animation_02(){
		super("...");
		canvas = new MyCanvas();

		setLayout(new FlowLayout());
		add(canvas);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);

		thread = new MyThread(this);
		thread.start();
	}
    
	public void doIt(){   	
		canvas.reposition();
		canvas.repaint();
	}
}

class MyThread extends Thread{

	Animation_02 frame;

	MyThread(Animation_02 frame){
		this.frame = frame;
	}

	public void run(){
		while(true){
			try{
				this.sleep(10);
			}
			catch(InterruptedException int_ex){}
			frame.doIt();
		}
	}
}

class MyCanvas extends Canvas{
	int x; 
	int y;
	int radius;
	MyCanvas(){
		setSize(300, 200);
		setBackground(new Color(0, 150, 0));
		x = 0;
		y = 0;
		radius = 20;
	}

	public void reposition(){
		if(y<this.getHeight()-radius){
			y++;
		}

		if(x<this.getWidth()-radius){
			x++;
		}
	}

	public void paint(Graphics g){
		System.out.println("paint");
		g.drawOval(x, y, radius, radius);
	}
}

class Test{
	public static void main(String... args){
		Animation_02 frame = new Animation_02();
	}
}

	
