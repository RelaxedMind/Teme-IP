import java.net.URL;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class URL_01 extends JFrame{
	JTextArea ta;

	URL_01(){
		super("...");
		ta = new JTextArea(10, 50);
		add(ta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public void openSocket(){
		try{
			URL url = new URL("http://helios.utcluj.ro/cosmin/WEB/responders/simple_responder.php");
			InputStream istream = url.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(istream));

			ta.append("\nlocation accessed...\n");

			String s;

			for(int i=0; i<5; i++){
				s = reader.readLine();
				if (s!=null)  
					ta.append(s+"\n");
			}
			ta.append("\n\nClosing the stream...");
			reader.close();
		}
		catch (Exception err) { 
			System.out.println("Error" + err);
		}
	}
}

class Test{
	public static void main(String... args){
		URL_01 frame = new URL_01();
		frame.openSocket();
	}
}
