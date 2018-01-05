import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import javax.swing.JTextArea;

/* Creați o aplicație Java de tip Frame ce conține un câmp de tip TextArea și unul de tip Label. Aplicația va prelua textul din
 *  cadrul câmpului de text și-l va trimite unui server. Serverul va răspunde cu un mesaj ce specifică numărul de caractere alfabetice și
 *   numerice conținute în mesajul primit. Răspunsul serverului va fi afișat în câmpul etichetă. Puteți folosi oricare din tehnlogiile
 *    AWT sau Swing.
 * */
class MakeGui extends JFrame {

	String text = new String();
	String mesaj = new String();	 
	
	
	MakeGui(){
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(450, 250));
		  setLayout(new FlowLayout());

		  JLabel raspuns = new JLabel("Raspunsul serverului ");
			JTextArea key = new JTextArea(0,10);
		
			 
	
  key.addKeyListener(new KeyListener() {
	
	@Override 
	public void keyTyped(KeyEvent e) {

		text = text +e.getKeyChar();
		// TODO Auto-generated method stub
		
		 //creez aplicatia client

		TCPClient client = new TCPClient();
       
       //seteaza hostul destinatie
		  client.setHostName("localhost");
       
       //realizeaza conexiunea la server
       client.conecteaza_te();
       
       //trimite mesaj la server
       System.out.println("Trimit mesaj : " + text);
       client.trimiteMesaj(text);
       
 
       //ascult raspuns de la server
      // client.citesteMesaj();
      
       mesaj = client.stocheazaMesaj();
       
       raspuns.setText(mesaj);

		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
});
	
	

	
	
	
	add(key);
	add(raspuns);
	}	
}





class gui {
	public static void main(String...args){
		MakeGui interf = new MakeGui();
		interf.setVisible(true);


		
	}
}






