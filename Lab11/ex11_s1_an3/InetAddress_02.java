import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InetAddress_02 extends JFrame{
	InetAddress host;
	String str;
	JTextArea ta;

	InetAddress_02(){
		super("...");
		ta = new JTextArea(10, 50);
		add(ta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public void getLocalhostInfo(){
		try{
			host=InetAddress.getLocalHost();
			ta.append("\nLocal host " + host);

			str=host.getHostName();
			ta.append("\nHost name: " + str);

			str=host.getHostAddress();
			ta.append("\nHost address: " + str);

		}
		catch (Exception e){
			System.out.println("Error :" + e);
		}
	}
}

class Test{
	public static void main(String... args){
		InetAddress_02 frame = new InetAddress_02();
		frame.getLocalhostInfo();
	}
}
