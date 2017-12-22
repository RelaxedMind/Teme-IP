/* Creați o aplicație Java ce include 3 elemente de tip slider, prin intermediul cărora se poate seta culoarea unui pătrat 
 * de dimensiunea 100x100.
 */
import java.awt.*;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javafx.scene.control.Slider;



class MyCanvas extends Canvas{
	Color c = new Color(0,0,0);
	Graphics g;
	MyCanvas() {
		this.setBounds(200, 300,  200, 200);
		//this.setSize(100,100);
		this.setBackground(c);
	}
}
class MyFrame extends Frame implements WindowListener {
	
	MyCanvas can = new MyCanvas();
	int red = 0;
	int green = 0;
	int blue =0;

	MyFrame(String title){
		super(title);
		
		setLayout(new FlowLayout());
		
		Label R, G, B;
		
	
		R= new Label();
		G= new Label();
		B= new Label();
		
	R.setText("R");
	G.setText("G");
	B.setText("B");
		
	JSlider r = new JSlider();
	JSlider g = new JSlider();
	JSlider b = new JSlider();
	
	r.setMaximum(255);
	r.setMinimum(0);
	r.addChangeListener(new ChangeListener()
			{

				@Override
				public void stateChanged(ChangeEvent e) {
					  red = (int)r.getValue();  
					  Color col = new Color (red, green, blue);
					  can.setBackground(col);
					  System.out.println("RGB: " + red+" "+ green+" "+ blue+" ");
					
				}
		
			});
	
	//red = (int) r.getValue();

	
	g.setMaximum(255);
	g.setMinimum(0);
	g.addChangeListener(new ChangeListener()
	{

		@Override
		public void stateChanged(ChangeEvent e) {
			  green = (int)g.getValue();  
			  Color col = new Color (red, green, blue);
			  can.setBackground(col);
			  System.out.println("RGB: " + red+" "+ green+" "+ blue+" ");
			
		}

	});
	
	b.setMaximum(255);
	b.setMinimum(0);
	b.addChangeListener(new ChangeListener()
	{

		@Override
		public void stateChanged(ChangeEvent e) {
			  blue = (int)b.getValue();    
			  Color col = new Color (red, green, blue);
			  can.setBackground(col);
			  System.out.println("RGB: " + red+" "+ green+" "+ blue+" ");
			
		}

	});
	
	Color col = new Color (red, green, blue);
	can.setBackground(col);

	
	this.add(r);
	this.add(R);	
	
	this.add(g);
	this.add(G);
	
	this.add(b);
	this.add(B);
	this.add(can);
	this.addWindowListener(this); //pt windows listener
	
	setSize(400, 400);
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
		// TODO Auto-generated method stub
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
	
//	public class MySlideListener implements ChangeListener {
//
//		MyFrame frame;
//		
//		Color col = new Color (red, green, blue);
//		
//		public MySlideListener(MyFrame Frame) {
//			this.frame=Frame;
//		}
//
//		@Override
//		public void stateChanged(ChangeEvent e) {
//		
//			JSlider r = (JSlider)e.getSource();
//			JSlider g = (JSlider)e.getSource();
//			JSlider b = (JSlider)e.getSource();
//	      
//	            red = (int)r.getValue();     
//	        	green = (int)g.getValue();	    
//	        	blue = (int)b.getValue();
//	      
//	        
//	        Color col = new Color(r.getValue(), g.getValue(),b.getValue());
//	        can.setBackground(Color.BLUE);
//	        
//	        System.out.println("RGB: " + red+" "+ green+" "+ blue+" ");
//	        
//		}
//	}
}

class Launch{
	public static void main(String...args){
		MyFrame frame = new MyFrame("Titlu");
	}
}

