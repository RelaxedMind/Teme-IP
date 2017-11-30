/*Creați o aplicație ce preia din două câmpuri text (TextField()) numele vostru și grupa din care faceți parte și 
 * afișează această informație într-o etichetă de culoare RGB(122,123,129).
 */


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame extends Frame implements WindowListener{
  
	Label label1,label2;
	TextField nume, grupa;
	TextField textField1;
	TextField textField2;
	
	MyFrame(String title){
		super(title);
		
		setLayout(new FlowLayout());
		
	
		textField1  = new TextField(15);
		textField1.setBackground(new Color(0, 0, 0));
		textField1.setForeground(new Color(255, 255, 255));
		textField1.addTextListener(new MyTextListener(this));
		
		
	
		textField2  = new TextField(15);
		textField2.setBackground(new Color(0, 0, 0));
		textField2.setForeground(new Color(255, 255, 255));
		textField2.addTextListener(new MyTextListener(this));
		
		label1 = new Label();
		label2 = new Label();
		
		nume=new TextField(15);
		nume.setEditable(false);
		nume.setBackground(new Color(122,123,129));
		nume.setForeground(new Color(255,12,11));
		
		grupa=new TextField(15);
		grupa.setEditable(false);
		grupa.setBackground(new Color(122,123,129));
		grupa.setForeground(new Color(255,12,11));
		
		label1.setText("Nume");
		label2.setText("Grupa");
		
		
		
		this.add(textField1);
		this.add(textField2);
	
		this.add(nume);
		this.add(grupa);
		this.add(label1);
		this.add(label2);
		
		this.addWindowListener(this);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	public void setLabelTextNume(String text){
		//pt. ajustarea dimensiunilor etichetei
		
		nume.setText(text);
			validate();
	}
	
	public void setLabelTextGrupa(String text){
		//pt. ajustarea dimensiunilor etichetei
		
		grupa.setText(text);
			validate();
	}
	

	public String getTextFieldText1(){
		return textField1.getText();
	}
	
	public String getTextFieldText2(){
		return textField2.getText();
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(1);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}

class MyTextListener implements TextListener{

	MyFrame frame;
	
	MyTextListener(MyFrame frame){
		this.frame = frame;
	}
	

	public void textValueChanged(TextEvent te) {
	frame.setLabelTextNume(frame.getTextFieldText1());
	frame.setLabelTextGrupa(frame.getTextFieldText2());
	
		
	}
}
	

class Test{
	public static void main(String...strings){
	
		MyFrame frame = new MyFrame("Text events");
		
	}
}
