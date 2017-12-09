
/*
 * Sa avem intr-un frame 25 capuri selectie care au valorile intre 1-5
 * (5 randuri 5 coloane)
 * La inceput este selectata o val aleatoare din intervalul 1-5 apoi 
 * putem intra pe ele sa sa le edditam.
 * Buton = proceaseaza.
 * Pentru fiecare valoare apare de cate ori apare val respectiva
 */


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


 public class tema_punct {
	public static void main(String[] args) {
	Window win= new Window();
	}
}
	
class Window extends JFrame implements ItemListener {
		
	JTextArea ta= new JTextArea(10,20);
	JComboBox <String>combo1= new JComboBox<String>();
	Random rand = new Random();
	
	int cont1=0;
	int cont2=0;
	int cont3=0;
	int cont4=0;
	int cont5=0;

	
	public Window(){
		super ("ComboBox test");
		
		setSize(250,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container ca= getContentPane();
		ca.setBackground(Color.lightGray);
		FlowLayout flm= new FlowLayout();
		ca.setLayout(flm);
	
		
		JComboBox []combo;
		combo = new JComboBox[25];
		//String name = new String();
		//String real_name= new String();
		//name ="combo";
	
		String val;
		for(int i = 0; i<25; i++)
		{
			
			combo[i]=new JComboBox();
			combo[i].addItemListener(this);
			combo[i].addItem(Integer.toString(rand.nextInt(5) + 1));
			combo[i].addItem(Integer.toString(rand.nextInt(5) + 1));
			combo[i].addItem(Integer.toString(rand.nextInt(5) + 1));
			combo[i].addItem(Integer.toString(rand.nextInt(5) + 1));
	        combo[i].addItem(Integer.toString(rand.nextInt(5) + 1));
			
			if(Integer.parseInt((String) combo[i].getSelectedItem() )==1)
			{	
				cont1++;
			}
			if(Integer.parseInt((String) combo[i].getSelectedItem() ) ==2)
			{	
			cont2++;
			}
			if(Integer.parseInt((String) combo[i].getSelectedItem() ) ==3)
			{	
			cont3++;
			}
			if(Integer.parseInt((String) combo[i].getSelectedItem() )==4)
			{	
			cont4++;
			}
			if(Integer.parseInt((String) combo[i].getSelectedItem() ) ==5)
			{	
			cont5++;
			}
		
			ca.add(combo[i]);
		}
		//combo1.addItem("JTest 1");
		//combo1.addItem("JTest 2");
		
		JButton jButton1 = new JButton("Proceseaza");
		
	      //   jButton1.setPreferredSize(new java.awt.Dimension(50,50));
        
         jButton1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 button1Apasat(evt); }

			private void button1Apasat(ActionEvent evt) {
				
				cont1 = 0;
				cont2 = 0;
				cont3 = 0;
				cont4 = 0;
				cont5 = 0;
				for(int i = 0; i<25; i++)
				{
				
				if(Integer.parseInt((String) combo[i].getSelectedItem() )==1)
				{	
					cont1++;
				}
				if(Integer.parseInt((String) combo[i].getSelectedItem() ) ==2)
				{	
				cont2++;
				}
				if(Integer.parseInt((String) combo[i].getSelectedItem() ) ==3)
				{	
				cont3++;
				}
				if(Integer.parseInt((String) combo[i].getSelectedItem() )==4)
				{	
				cont4++;
				}
				if(Integer.parseInt((String) combo[i].getSelectedItem() ) ==5)
				{	
				cont5++;
				}
				
				}
				ta.setText("");
				ta.append("Nr de 1 este: "+cont1+"\n");
				ta.append("Nr de 2 este: "+cont2 + "\n");
				ta.append("Nr de 3 este: "+cont3 + "\n");
				ta.append("Nr de 4 este: "+cont4+"\n");
				ta.append("Nr de 5 este: "+cont5);
				
			}
        });
         
 
		
		
		ca.add(ta);
		ca.add(jButton1);
		setContentPane(ca);
	}
	public void itemStateChanged(ItemEvent ev){
		String str = ev.getItem().toString();
		ta.setText(str);
	}
}//Window
