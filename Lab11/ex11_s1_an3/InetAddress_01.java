import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InetAddress_01 extends JFrame{
	InetAddress[] addresses;
	int i;

	JTextArea ta;

	InetAddress_01(){
		super("...");
		ta = new JTextArea(10, 50);
		add(ta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public void getAddresses(){
		try{
			addresses=InetAddress.getAllByName("www.utcluj.ro");

			for (i=0;i<addresses.length;i++){
				ta.append("\n"+addresses[i].toString());
			}
		}
		catch (Exception e){
			System.out.println("Error :" + e);
		}
	}
}

class Test{
	public static void main(String... args){
		InetAddress_01 frame = new InetAddress_01();
		frame.getAddresses();
	}
}
