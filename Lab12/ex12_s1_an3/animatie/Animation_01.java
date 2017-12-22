
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Animation_01 extends JFrame implements Runnable{
	int indimg=0;
	int iterations = 1;
	boolean should_run = true;
	Thread anim=null;
	String image_names[]= {"picture_01.jpg","picture_02.jpg","picture_03.jpg"};

	Image images[]=new Image[image_names.length];

	MyCanvas canvas;
	JLabel label;

	Animation_01(){
		super("...");
		canvas = new MyCanvas();
		label = new JLabel("Iteration: "+iterations+" / 3");
		setLayout(new FlowLayout());
		add(label);
		add(canvas);
		

		for(int i=0; i<images.length; i++){
			try {
				images[i] = ImageIO.read(new File(image_names[i]));
			} catch (IOException ex) {}
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);

		anim=new Thread(this);
		anim.start();
	}
    
	public void run(){   
		while (should_run){
					
		canvas.setImage(images[indimg]);
		canvas.repaint();
		
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {}

		indimg++;
		if (indimg==images.length){
		 	indimg=0;
			iterations++;
			label.setText("Iteration: "+iterations+" / 3");
		}
		

		if(iterations>3){
			should_run = false;
			label.setText("Iteration: "+iterations+" / 3"+" TOO MUCH!");
		}		
		
		} //while
	}
}

class MyCanvas extends Canvas{
	Image image;
	MyCanvas(){
		setSize(300, 200);
	}

	public void setImage(Image image){
		this.image = image;
	}

	public void paint(Graphics g){
		g.drawImage(image,0,0,this);
	}
}

class Test{
	public static void main(String... args){
		Animation_01 frame = new Animation_01();
	}
}

	
