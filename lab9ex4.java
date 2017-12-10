
/*Scrieți o aplicație Java ce utilizează componenta JTabbedPane și care permite desenarea 
 * în prima fereastră a unei
figuri geometrice ale cărei caracteristici sunt definite într-o a doua fereastră - 
tipul figurii, dimensiuni, mod de umplere
(butoane radio), culoare (triplet RGB).*/



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;



class  CustomPanel  extends  JPanel{
   
	String forma = new String();
	String fill = new String();
	
	int r,gr,b;
	
	int x,y;
	
	   public  void  setForm(String  form)  {
           this.forma  =  form;
   }

	   public  void  setDim(int x, int y)  {
           this.x = x;
           this.y = y;
   }
	   
	   public  void  setFill(String fill)  {
		   this.fill= fill;
		 
	   }
	   
	   public  void  setColor(int r, int g, int b)  {
		   this.r= r;
		   this.gr= g;
		   this.b= b;
		   
	   }
	   
	   
	   
    public  void  paintComponent(Graphics  g)  {
            super.paintComponent(g);
            
            Color col = new Color(r,gr,b);
            g.setColor(col);
            switch (forma) {
			case "cerc":
				
				
				if(fill == "margini")
			
				g.drawOval(150, 50, x, y);
				
				else
				g.fillOval(150, 50, x, y);				
				break;

			case "dreptunghi":
				if(fill == "margini")
					g.drawRect(150, 50, x+20, y);
					
					else
					g.fillRect(150, 50, x+20, y);				
					break;
					
			case "patrat":
				if(fill == "margini")
					g.drawRect(150, 50, x, y);
				
				else
					g.fillRect(150, 50, x, y);				
				break;
				
			case "triunghi":
				if(fill == "margini")
					g.drawPolygon(new int[] {x, 20, 30}, new int[] {y, 20, 100}, 3);
				
				else
					g.fillPolygon(new int[] {x, 20, 30}, new int[] {y, 20, 100}, 3);		
				break;

			
				
			default:
				break;
			}
            
            
          
    }
}


 class MyFrame extends JFrame{
	
	 
	 MyFrame(String test){
	 	initUI();
	 }

	
	 
	private void initUI() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(400, 400));
	      
	
		
	        setTitle("Test");
		JLabel tip = new JLabel("Tipul Figurii: ");
		//setLayout(new FlowLayout());
		
		JRadioButton cerc, patrat, dreptunghi, triunghi, mic ,mare, mediu, plin, margini;
		JTabbedPane tabbedPane = new JTabbedPane();
		
		ImageIcon img1 = new ImageIcon("kali-linux.png");
		ImageIcon img2 = new ImageIcon("ok.png");
		
		CustomPanel panel1 = new CustomPanel();
		JPanel panel2 = new CustomPanel();
		

		
		ButtonGroup fig = new ButtonGroup();
		ButtonGroup marime = new ButtonGroup();
		ButtonGroup umplere = new ButtonGroup();
	
		
		
		panel2.setLayout(new FlowLayout());
		panel2.add(tip);
		
		cerc = new JRadioButton("Cerc");
		patrat = new JRadioButton("Patrat");
		triunghi = new JRadioButton("Triunghi");
		dreptunghi = new JRadioButton("Dreptunghi");
		
		cerc.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panel1.setForm("cerc");
				repaint();
				
				
			}
		});
		
		dreptunghi.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panel1.setForm("dreptunghi");
				repaint();
				
				
			}
		});
		
		triunghi.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panel1.setForm("triunghi");
				repaint();
				
				
			}
		});
		
		patrat.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				panel1.setForm("patrat");
				repaint();
				
				
			}
		});
		
		fig.add(cerc);
		fig.add(patrat);
		fig.add(dreptunghi);
		fig.add(triunghi);
		

	
		panel2.add(cerc);
		panel2.add(patrat);
		panel2.add(triunghi);
		panel2.add(dreptunghi);
		
		JLabel dimensiune = new JLabel("Dimensiune: ");
		panel2.add(dimensiune);
		
		mic = new JRadioButton("Mic");
		mediu = new JRadioButton("Mediu");
		mare = new JRadioButton("Mare                        ");
		
		
		mic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				panel1.setDim(40, 40);
				repaint();
				
			}
		});
		
		mediu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				panel1.setDim(100, 100);
				repaint();
				
			}
		});
		
		mare.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				panel1.setDim(150, 150);
				repaint();
				
			}
		});
		
		
		
		marime.add(mic);
		marime.add(mediu);
		marime.add(mare);
		
		panel2.add(mic);
		panel2.add(mediu);
		panel2.add(mare);
		
		JLabel modumpl = new JLabel("Umplere: ");
		
		margini = new JRadioButton("Umplere pe margini");
		plin = new JRadioButton("Umplere plina                       ");
		
		margini.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setFill("margini");
				repaint();
				
			}
		});
		
		plin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setFill("plin");
				repaint();
				
			}
		});
		
		umplere.add(margini);
		umplere.add(plin);
		
		panel2.add(modumpl);
		panel2.add(margini);
		panel2.add(plin);
		
		JTextField r = new JTextField("RED");
		JTextField g = new JTextField("GREEN");
		JTextField b = new JTextField("BLUE");
		
		panel2.add(r);
		panel2.add(g);
		panel2.add(b);
		

		
		JButton but = new JButton("Schimba culoarea!");
		panel2.add(but);
		
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				panel1.setColor(Integer.parseInt(r.getText()), Integer.parseInt(g.getText()), Integer.parseInt(b.getText()));
				repaint();
			}
		});

		tabbedPane.addTab("Tab 1", img1, panel1, "Does nothing");
		tabbedPane.addTab("Tab 2", img2, panel2, "Does nothing");
		
		add(tabbedPane);
		
		
	}
 }







public class lab9ex4 {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Titlu");
		frame.setVisible(true);


	}

}
