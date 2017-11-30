import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Label;
import java.applet.Applet;

public class ButtonEvents_03 extends Applet{
	MyButton b1, b2;

	Label label;

	public void init(){
		b1 = new MyButton("Button 1", this);
		b2 = new MyButton("Button 2", this);
      
		label = new Label("apasa un buton");

		add(b1);
		add(b2);
		add(label);
	}

	public void setLabelText(String text){
		label.setText(text);
	}
}

class MyButton extends Button{
	
	ButtonEvents_03 applet;

	public MyButton(String eticheta, ButtonEvents_03 applet){
		super(eticheta);		
		this.applet = applet;
		enableEvents(AWTEvent.ACTION_EVENT_MASK);
	}
	public void processActionEvent(ActionEvent ae){
		applet.setLabelText(this.getLabel()+" apasat...");
		super.processActionEvent(ae);
	}
}
 