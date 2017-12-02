import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/*Scrieți o aplicație Java ce include un formular de înregistrare ca și student la un curs online. 
 * Formularul include informații referitoare la nume, prenume, an de studii, facultatea, finanțare taxă/buget și cursul dorit. 
 * Anul de studii, facultatea și cursul sunt disponibile ca și listă de opțiuni, iar finanțarea este de tip checkbox. 
 * Într-un câmp de tip TextArea afișați informația completată de student ca urmare a apăsării butonului de înregistrare.
 * 
 */

class MyFrame extends Frame implements WindowListener{

	String name,surname,group;
	Label num, pren, grp;
	TextField nume, prenume, grupa;
	Checkbox finantare;
	Choice an,faculatare,curs;
	TextArea ta; 
	Button buton = new Button();
	
	MyFrame(String title){
		super(title);
	
		setLayout(new FlowLayout());
		
		nume=new TextField(15);
		prenume=new TextField(15);
		grupa=new TextField(15);
		
		name =new String();
		surname =new String();
		group =new String();

		num = new Label("Nume");
		pren = new Label("Prenume");
		grp = new Label("Grupa");
		
		nume.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
			
				name = nume.getText();
				
			}
		});
		
		prenume.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				surname = prenume.getText();
				
			}
		});
		
		grupa.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				group = grupa.getText();
				
			}
		});
		
		buton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(name);
				ta.append(surname);
				ta.append(group);
				
			}
		});
		
		ta = new TextArea(10, 20);
		//ta.setText("aaa\nbbb\nccc");
		ta.append(name);
		ta.append(surname);
		ta.append(group);
		
		
		add(num);
		add(nume);
		add(pren);
		add(prenume);
		add(grp);
		add(grupa);
		add(ta);
	
	
	
	
	
	
	
	this.addWindowListener(this);
	
	setSize(300, 300);
	setVisible(true);
	
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
			System.exit(1);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
class Launch {
	public static void main(String...args)
	{
		MyFrame frame = new MyFrame("Titlu");
	}
}


