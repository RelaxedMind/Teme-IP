import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.applet.Applet;

public class ButtonEvents_02 extends Applet implements ActionListener{
	Button b1, b2;

	public void init(){
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b2.setActionCommand("#Edfg%");
      
		b1.addActionListener(this);   //this e listenerul
		b2.addActionListener(this);

		add(b1);
		add(b2);
	}

	public void actionPerformed(ActionEvent ae){
		showStatus(ae.getActionCommand());	
	}

}
