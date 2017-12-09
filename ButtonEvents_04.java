import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Label;
import java.applet.Applet;

public class ButtonEvents_04 extends Applet{
	Button b1, b2;

	Label label;									//cea mai utilizata metoda

	public void init(){
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
      
		label = new Label("apasa un buton");

		b1.addActionListener(new ActionListener(){ 	// ActionListener clasa  anonima
			public void actionPerformed(ActionEvent ae){
				setLabelText("Buton 1 apasat");
			}
		});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				setLabelText("Buton 2 apasat");
			}
		});

		add(b1);
		add(b2);
		add(label);
	}

	public void setLabelText(String text){
		label.setText(text);
	}
}
 