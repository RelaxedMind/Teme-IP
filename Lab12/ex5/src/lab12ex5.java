import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.time.*;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/*Desenați o grilă de dimensiune 3x3 ce conține 9 numere distincte așezate aleator în cele 9 căsuțe. Utilizatorul trebuie
să apese pe aceste numere în ordine crescătoare după ce a dat click pe un buton de start. Afișati pe ecran un contor de
timp de la momentul în care utilizatorul început jocul. Apăsarea unui număr greșit duce la restartarea jocului. În caz de
câștig, afișati un mesaj corespunzător și timpul necesar câștigării jocului
*/


class MyFrame extends JFrame{
	
	 ArrayList numbers = new ArrayList();
	 boolean running = false;
	 JLabel timerlabel = new JLabel("Aici se va afisa timpul");
	 int counter = 0;
	 int minutes = 0;
	 int seconds = 0;
	 int milliseconds = 0;
	 Timer timer;
	 int ordine[] = new int[9];
	// Thread tred[] = new Thread[9];
	// Thread t = new Thread(this);
	 boolean In_ordine = true;
	 int nr_but_apasat;
	 
	 MyFrame(String text){
		setTitle(text);
		setVisible(true);
		RandomUnique();
		initUI();
	}
	
	 
//	 @Override
//		public void run() {
//
//		 
//		 ordine[nr_but_apasat-1] =nr_but_apasat;
//		 
//
//			
//		}
	 
	 public void Stocare() {
		 
		 
		 ordine[nr_but_apasat-1] =nr_but_apasat;
		 
		 
		 
	 }

	 public boolean Verif_ordinea(){
		 
		 for(int i =0;i<9;i++)
			 if(ordine[i] != i+1)
				return false;
		 return true;
		 
	 }
	 
	public void GetButtonPressed(int no){
		
		nr_but_apasat = no;
		
	}
	 
	 public  void timerStart()
	{
		
		 timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				timerlabel.setText(timeTransfer());
			}
		});
		  timer.start();
	
	}
	
	private String timeTransfer(){

	     minutes = counter/6000;
	     seconds = (counter % 6000) /100 ;
	     milliseconds = counter % 100 ;
	     return minutes + " : " + seconds + " : " + milliseconds;
	 }
	
	
	public void RandomUnique(){
		
	     for(int i = 0; i < 9; i++)
	     {
	       numbers.add(i+1);
	     }
	 
	     Collections.shuffle(numbers);
	     System.out.println(numbers);
	   
	}
	
	public void initUI(){
		
		setLayout(new GridLayout(0,3));
		
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(500, 500));
	      
		  
		 
		
		     
		  
		  JButton butoane[] = new JButton[9];
//		  JButton buton1 = new JButton();
//		  JButton buton2 = new JButton();
//		  JButton buton3 = new JButton();
//		  JButton buton4 = new JButton();
//		  JButton buton5 = new JButton();
//		  JButton buton6 = new JButton();
//		  JButton buton7 = new JButton();
//		  JButton buton8 = new JButton();
//		  JButton buton9 = new JButton();
		  JButton start = new JButton("START");
		
		  //start.setPreferredSize(new Dimension (500,500));
		
		 
//		  
//		  buton1.setText(String.valueOf(numbers.get(0)));
//		  buton2.setText(String.valueOf(numbers.get(1)));
//		  buton3 = new JButton(String.valueOf(numbers.get(2))); 
//		  buton4 = new JButton(String.valueOf(numbers.get(3)));
//		  buton5 = new JButton(String.valueOf(numbers.get(4)));
//		  buton6 = new JButton(String.valueOf(numbers.get(5)));
//		  buton7 = new JButton(String.valueOf(numbers.get(6)));
//		  buton8 = new JButton(String.valueOf(numbers.get(7)));
//		  buton9 = new JButton(String.valueOf(numbers.get(8)));
		  
		  
		  start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		  
		  for(int i = 0; i<9;i++)
		  {
			  butoane[i] = new JButton();
			  butoane[i].setText(String.valueOf(numbers.get(i)));
			  add(butoane[i]);
		  }
		  
//		  start.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				timerStart();
//			
//				
//			}
//		});
//		for(int i = 0; i<9;i++)
//		{
//			tred[i] = new Thread();
//		}
		
		  for(int i = 0; i<9;i++)
		  {
			  if(butoane[i].getText().equals("1"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						timerStart();
						GetButtonPressed(1);
					//	tred[0].start();
					//	t.start();
						  System.out.println("Apelare din buton 1 dupa thread:") ;
						
					}
				});
			  }
			  
			   if(butoane[i].getText().equals("2"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						GetButtonPressed(2);
						//tred[1] = new Thread();
					//	tred[1].start();
						Stocare();
						  System.out.println("Apelare din buton 2 dupa thread:") ;
					}
				});
			  }
			  if(butoane[i].getText().equals("3"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  
						  GetButtonPressed(3);
					//		tred[2] = new Thread();
					//	  tred[2].start();
							Stocare();
						  System.out.println("Apelare din buton 3 dupa thread:") ;
						  
					  }
				  });
			  }
			
			  if(butoane[i].getText().equals("4"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  
						  GetButtonPressed(4);
							//tred[3] = new Thread();
						//  tred[3].start();
							Stocare();
						  System.out.println("Apelare din buton 4 dupa thread:") ;
					  }
				  });
			  }
			  
			  if(butoane[i].getText().equals("5"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  
						  GetButtonPressed(5);
						//	tred[4] = new Thread();
						//  tred[4].start();
							Stocare();
						  System.out.println("Apelare din buton 5 dupa thread:") ;
					  }
				  });
			  }
			  
			  if(butoane[i].getText().equals("6"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  GetButtonPressed(6);
						//	tred[5] = new Thread();
						 // tred[5].start();
							Stocare();
						  System.out.println("Apelare din buton 6 dupa thread:") ;
					  }
				  });
			  }
			 if(butoane[i].getText().equals("7"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  GetButtonPressed(7);
						//	tred[6] = new Thread();
						//  tred[6].start();
							Stocare();
						  System.out.println("Apelare din buton 7 dupa thread:") ;
					  }
				  });
			  }
			 if(butoane[i].getText().equals("8"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  GetButtonPressed(8);
						//	tred[7] = new Thread();
						//  tred[7].start();
							Stocare();
						  System.out.println("Apelare din buton 8 dupa thread:") ;
						  
					  }
				  });
			  }
			   if(butoane[i].getText().equals("9"))
			  {
				  butoane[i].addActionListener(new ActionListener() {
					  
					  @Override
					  public void actionPerformed(ActionEvent e) {
						  GetButtonPressed(9);  
							//tred[8] = new Thread();
						 // tred[8].start();
							Stocare();
						  System.out.println("Apelare din buton 9 dupa thread:") ;
						  if(Verif_ordinea() ==true)
						  {
							  System.out.println("Verif ordinea a fost apelata:") ;
							  timer.stop();
						  }
						  
					  }
				  });
			  }
			  
		  }
		
//		  add(buton1);
//		  add(buton2);
//		  add(buton3);
//		  add(buton4);
//		  add(buton5);
//		  add(buton6);
//		  add(buton7);
//		  add(buton8);
//		  add(buton9);
		  add(timerlabel);
		  add(start);
		  
	}


	


	
	
	
	
	
}


public class lab12ex5 {

	public static void main(String[] args) {

		MyFrame frame = new MyFrame("Titlu");
		frame.setVisible(true);

	}

}
