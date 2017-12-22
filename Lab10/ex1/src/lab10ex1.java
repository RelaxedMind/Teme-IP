/*Se citesc de la tastatură date formatate sub forma DD/MM/YYYY. Să se afișeze sub forma DD luna YYYY,
 *  unde luna este forma expandată a MM și de asemenea să se afișeze și dacă anul este bisect. 
 *  Programul se oprește prin apăsarea tastei X
 *  */

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;


class Calendar extends JFrame{
	
	 Calendar(String test){
	 	initUI();
	 }

	private void initUI() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		
		JLabel zi = new JLabel("day");
		JLabel luna = new JLabel("month");
		JLabel an = new JLabel("year");

		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(350, 250));
	     
		  JTextField day = new JTextField(2);
		  JTextField month = new JTextField(2);
		  JTextField year = new JTextField(4);
		  
		  
		  
		  day.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				//zi.setText((zi.getText())+arg0.getKeyChar());
				zi.setText(day.getText()+arg0.getKeyChar());
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
			}
		});
		  
		 month.addKeyListener(new KeyListener() {
			  
			  @Override
			  public void keyTyped(KeyEvent arg0) {
				  
				  String display = new String();
				  display = month.getText() +arg0.getKeyChar();
				  //zi.setText((zi.getText())+arg0.getKeyChar());
				 //luna.setText(month.getText()+arg0.getKeyChar());
				 
				 switch (display) {
				case "01":
					luna.setText("Ianuarie");
					break;
				case "02":
					luna.setText("Februarie");
					break;
				case "03":
					luna.setText("Martie");
					break;
				case "04":
					luna.setText("Aprilie");
					break;
				case "05":
					luna.setText("Mai");
					break;
				case "06":
					luna.setText("Iunie");
					break;
				case "07":
					luna.setText("Iulie");
					break;
				case "08":
					luna.setText("August");
					break;
				case "09":
					luna.setText("Septembrie");
					break;
				case "10":
					luna.setText("Octombrie");
					break;
				case "11":
					luna.setText("Noiembrie");
					break;
				case "12":
					luna.setText("Decembie");
					break;

				default:
					luna.setText("Nu exista luna specificata");
					break;
				}
				  
				 
			  }
			  
			  @Override
			  public void keyReleased(KeyEvent arg0) {
				  // TODO Auto-generated method stub
				  
			  }
			  
			  @Override
			  public void keyPressed(KeyEvent arg0) {
				  
				  
			  }
		  });
		  
		  year.addKeyListener(new KeyListener() {
			  
			  @Override
			  public void keyTyped(KeyEvent arg0) {
				  
				  //zi.setText((zi.getText())+arg0.getKeyChar());
			//	  an.setText(year.getText()+arg0.getKeyChar());
				  
				 String bisectString = new String();
				 
				 bisectString = year.getText()+arg0.getKeyChar();
				  
				 int bisectInt = Integer.parseInt(bisectString);
				 
				 if(bisectInt %4 ==0 || bisectInt %400 ==0)
					 an.setText("Bisect");
				 else   
					 an.setText("Normal");
			  }
			  
			  @Override
			  public void keyReleased(KeyEvent arg0) {
				  // TODO Auto-generated method stub
				  
			  }
			  
			  @Override
			  public void keyPressed(KeyEvent arg0) {
				  
				  
			  }
		  });
	
		
	add(day);	
	
	add(month);
	add(year);
	
	add(zi);
	add(luna);

	add(an);
		
	}
 }





public class lab10ex1 {

	public static void main(String[] args) {
	

		Calendar frame = new Calendar("Calendar");
		frame.setVisible(true);

	}

}


