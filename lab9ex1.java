/*Scrieți o aplicație Java folosind biblioteca Swing în cadrul căreia sunt afișate 3 componente de 
 * tip checkbox (JCheckBox), 3 componente de tip radio button (JRadioButton) și 3 componente de tip 
 * drop-down list (JComboBox). Selecțiile făcute de utilizator vor fi afișate într-un câmp de tip 
 * etichetă (JLabel).*/


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

 class MyFrame extends JFrame{
	
	 MyFrame(String test){
	 	initUI();
	 }

	private void initUI() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(400, 250));
	        
	        setTitle("Test");
		JLabel label = new JLabel("Begin");
		setLayout(new FlowLayout());
		
		JCheckBox check1, check2,check3;
		JRadioButton but1,but2,but3;
		JComboBox combo1,combo2,combo3;
		
		
		check1=new JCheckBox("Check1");
		check1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(check1.getLabel());
				
			}
		});
		
		check2=new JCheckBox("Check2");
check2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(check2.getLabel());
				
			}
		});
		
		check3=new JCheckBox("Check3");
		
check3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(check3.getLabel());
				
			}
		});
		
		but1 = new JRadioButton("But1");
but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(but1.getLabel());
				
			}
		});
		
		
		but2 = new JRadioButton("But2");
but2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(but2.getLabel());
				
			}
		});
		
		
		but3 = new JRadioButton("But3");
		
but3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(but3.getLabel());
				
			}
		});
		
		
	combo1 = new JComboBox<String>();
	combo1.addItem("combo1");
	
	combo1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setText((String) combo1.getSelectedItem());
			
		}
	});
	
	
	combo2 = new JComboBox<String>();
	combo2.addItem("combo2");
	
combo2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setText((String) combo2.getSelectedItem());
			
		}
	});
	
	combo3 = new JComboBox<String>();
	combo3.addItem("combo3");
	
combo3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setText((String) combo3.getSelectedItem());
			
		}
	});
		
	add(label);
	add(check1);
	add(check2);
	add(check3);
	
	add(but1);
	add(but2);
	add(but3);
	
	add(combo1);
	add(combo2);
	add(combo3);
	//add(label);
		
	}
 }




public class lab9ex1 {

	public static void main(String...args){
	MyFrame frame = new MyFrame("Titlu");
	frame.setVisible(true);
	}
}
