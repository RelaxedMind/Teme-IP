import java.awt.Event;
import java.awt.Button;
import java.applet.Applet;

public class ButtonEvents_01 extends Applet{
	Button b1, b2;

	public void init(){
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
      
		add(b1);
		add(b2);
	}

	public boolean action(Event evt, Object arg){ //deprecated https://docs.oracle.com/javase/8/docs/api/java/awt/Component.html#action-java.awt.Event-java.lang.Object-
		if (evt.target == b1){
			showStatus("Button 1 apasat");
			return (true);
		}
		if (evt.target == b2){
			showStatus("Button 2 apasat");
			return (true);
		}

		return (false);
	}

}
