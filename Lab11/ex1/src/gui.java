import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Trimitem un nr generat aleator(number set), cand apas ok trimite la sv(). Acesta il converteste in binar.
//Pt 1 bulina colorata, pt 0 bulina goala.

class MakeGui extends JFrame {
//	Color c = new Color(0,0,0);
//	Graphics g;
//	MakeGui() {
//		this.setBounds(200, 300,  200, 200);
//		//this.setSize(100,100);
//		this.setBackground(c);
	//JLabel numar = new JLabel("Aici apare nr dupa ce apesi 'GENEREAZA' ");
	Random rand = new Random();
	int numberSet =12;
	boolean apasat = false;
	
	MakeGui(){
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(450, 250));
		  setLayout(new FlowLayout());
		  
		  JLabel	numar =new JLabel ("Aici apare numarul dupa ce apesi 'Genereaza'");
		  
	Canvas c1 = new Canvas();
	Canvas c2 = new Canvas();
	Canvas c3 = new Canvas();
	Canvas c4 = new Canvas();
	
	JButton buton = new JButton("Genereaza");
	buton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			numberSet = rand.nextInt(15)  +  1;
			numar.setText(Integer.toString(numberSet));
			 //creez aplicatia client
	        TCPClient client = new TCPClient();
	        
	        //seteaza hostul destinatie
	        client.setHostName("localhost");
	        
	        //realizeaza conexiunea la server
	        client.conecteaza_te();
	        
	        //trimite mesaj la server
	        String mesaj1 = Integer.toString(numberSet);
	        System.out.println("Trimit mesaj : " + mesaj1);
	        client.trimiteMesaj(mesaj1);
	        
	   
	        //ascult raspuns de la server
	        client.citesteMesaj();
	        
	        
	        
	        //trimite mesaj la server
	    
		}
	});

	
	
	
	add(buton);
	add(numar);
	}	
}





class gui {
	public static void main(String...args){
		MakeGui interf = new MakeGui();
		interf.setVisible(true);


		
	}
}






