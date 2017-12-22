/*
 Scrieți o aplicație Java – Swing ce permite selectarea unei imagini stocate local și
 afișarea acesteia în cadrul interfeței grafice. La apăsarea unui buton, imaginea va fi 
  ștearsă din interfața grafică.
 */

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

 class MyFrame extends JFrame{
	
	 MyFrame(String test){
	 	initUI();
	 }

	private void initUI() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		// JLabel label = new JLabel(Icon image);
		 File selectedFile;
		 JButton buton = new JButton("Dispare");
		 
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(700, 700));
	        
		  
		  String path = "C:\\Users\\djdjr\\Documents\\AN 3\\IP\\Teme\\Lab9\\ex3\\";
			JFileChooser jfc = new JFileChooser(path);

			int returnValue = jfc.showOpenDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				 selectedFile = jfc.getSelectedFile();
				 try {
			         BufferedImage img = ImageIO.read(selectedFile);
			         ImageIcon icon = new ImageIcon(img);
			        JLabel label = new JLabel(icon);
			     
			         buton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							label.setVisible(false);
								
							}
						});
			      
			         add(label);
			         add(buton);
			       
			      } catch (IOException e) {
			         e.printStackTrace();
			      }
			   
				
				 
			}
//		  final String IMG_PATH = "christmas.jpg";
//		      try {
//		         BufferedImage img = ImageIO.read(selectedFile);
//		         ImageIcon icon = new ImageIcon(img);
//		         label = new JLabel(icon);
//		         add(label);
//		         JOptionPane.showMessageDialog(null, label);
//		      } catch (IOException e) {
//		         e.printStackTrace();
//		      }
//		   
	  
		
		      
		
	}
 }








public class lab9ex3 {

	
	public static void main(String[] args) {
		

		MyFrame frame = new MyFrame("Titlu");
		frame.setVisible(true);

	}

	
}
