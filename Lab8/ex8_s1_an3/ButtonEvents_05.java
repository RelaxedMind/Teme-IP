//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Label;
import java.applet.Applet;

public class ButtonEvents_05 extends Applet{
	Button b1, b2;

	Label label;

	public void init(){
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
      
		label = new Label("apasa un buton");

		b1.addActionListener(e -> {          	//e la fel ca 4 doar ca e facut cu lambda
			setLabelText("Buton 1 apasat");
		});

		b2.addActionListener(e -> {
			setLabelText("Buton 2 apasat");
		});

		add(b1);
		add(b2);
		add(label);
	}

	public void setLabelText(String text){
		label.setText(text);
	}
}
 