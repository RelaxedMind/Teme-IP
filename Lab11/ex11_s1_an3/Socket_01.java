import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Socket_01 extends JFrame{
	JTextArea ta;

	Socket_01(){
		super("...");
		ta = new JTextArea(10, 50);
		add(ta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public void openSocket(){
		try{
			Socket sock = new Socket("www.utcluj.ro", 80);

			ta.append("\naddress : " + sock.getInetAddress());
			ta.append("\nport : " + sock.getPort());
			ta.append("\nLocal address : " + sock.getLocalAddress());
			ta.append("\nLocalport : " + sock.getLocalPort());

			sock.close();

		}
		catch (Exception e){
			System.out.println("Error :" + e);
		}
	}
}

class Test{
	public static void main(String... args){
		Socket_01 frame = new Socket_01();
		frame.openSocket();
	}
}
