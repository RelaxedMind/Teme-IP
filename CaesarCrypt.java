/*Implementați o aplicație Java bazată pe biblioteca Swing ce criptează în timp real datele 
 * introduse într-un câmp de
timp JTextArea folosind codul lui Cesar (https://en.wikipedia.org/wiki/Caesar_cipher). 
Deplasarea caracterelor va fi
stabilită dintr-un câmp de tip drop-down list (max. 10).
*/


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

 class MyFrame extends JFrame{
	
	 MyFrame(String test){
	 	initUI();
	 }
	 
	 int  alegere;
	 JTextArea ti= new JTextArea(2,25);
	 JTextArea tc= new JTextArea(2,25);
	 String s = "";

	private void initUI() {
		tc.setEditable(false);
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(450, 250));
	        
	        setTitle("Test");
		JLabel shift = new JLabel("How Much Shift?");
		JLabel coded = new JLabel("Text Coded                          ");
		setLayout(new FlowLayout());
		
		
		
		
		JComboBox <Integer>combo1= new JComboBox<Integer>();
		
		//combo1.addItemListener(this);
		for(int i = 0; i<11;i++)
		{
		combo1.addItem(i);
		}

		combo1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
		
			alegere=(int) combo1.getSelectedItem();
			System.out.print("Val Alegere: " +alegere);
			
			}
		});
		
		
		
		
		ti.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				
				s = s+(char)(c+(char)alegere);
			//	s +=Character.toString(c);
				tc.setText(s);
			
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			
				
			}
		});;
	
		
		
		add(ti);
		add(combo1);
		add(shift);
		add(tc);
		add(coded);
		
	}

	
 }




class CaesarCrypt {
	public static void main(String...args){
		MyFrame frame = new MyFrame("Titlu");
		frame.setVisible(true);
		}
}
