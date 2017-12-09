
/*Scrieți o aplicație Java ce utilizează componenta JTabbedPane și care permite desenarea 
 * în prima fereastră a unei
figuri geometrice ale cărei caracteristici sunt definite într-o a doua fereastră - 
tipul figurii, dimensiuni, mod de umplere
(butoane radio), culoare (triplet RGB).*/



import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import javafx.scene.shape.Circle;

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
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
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

				cerc.add(comp)
				//panel2.add(g);
				
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
		
		marime.add(mic);
		marime.add(mediu);
		marime.add(mare);
		
		panel2.add(mic);
		panel2.add(mediu);
		panel2.add(mare);
		
		JLabel modumpl = new JLabel("Umplere: ");
		
		margini = new JRadioButton("Umplere pe margini");
		plin = new JRadioButton("Umplere plina");
		
		umplere.add(margini);
		umplere.add(plin);
		
		panel2.add(modumpl);
		panel2.add(margini);
		panel2.add(plin);
		
		
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
