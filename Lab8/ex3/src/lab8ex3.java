import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/*Scrieți o aplicație Java ce include un formular de înregistrare ca și student la un curs online. 
 * Formularul include informații referitoare la nume, prenume, an de studii, facultatea, finanțare taxă/buget și cursul dorit. 
 * Anul de studii, facultatea și cursul sunt disponibile ca și listă de opțiuni, iar finanțarea este de tip checkbox. 
 * Într-un câmp de tip TextArea afișați informația completată de student ca urmare a apăsării butonului de înregistrare.
 * 
 */

class MyFrame extends Frame implements WindowListener{

	Label label;
	String name,surname,group;
	Label num, pren, grp;
	TextField nume, prenume, grupa;
	Checkbox taxa, buget;
	CheckboxGroup cbg;
	Choice an,facultate,curs;
	TextArea ta; 
	Button buton = new Button("Inregistrare");
	
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
		
		an = new Choice();
		facultate = new Choice();
		curs = new Choice();

		for(int i = 2000;i<2018;i++)
		{
			an.addItem(Integer.toString(i));
			
			
		}
			facultate.addItem("ETTI");
			facultate.addItem("Calculatoare");
			facultate.addItem("Inginerie");
			facultate.addItem("Scoala de lunetisti");
		
			curs.addItem("Metode numerice");
			curs.addItem("Analiza matematica");
			curs.addItem("Ingineria Programarii");
			curs.addItem("Cum sa iti gasesti rostul in viata.");
		
		an.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				ta.append(an.getSelectedItem());
				
			}
		});
		
		facultate.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				ta.append(facultate.getSelectedItem());
				
			}
		});
		curs.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				ta.append(curs.getSelectedItem());
				
			}
		});
		
		
		buton.setSize(100, 100);
		buton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(name+"\n");
				ta.append(surname+"\n");
				ta.append(group+"\n");
				ta.append(an.getSelectedItem()+"\n");
				ta.append(facultate.getSelectedItem()+"\n");
				ta.append(curs.getSelectedItem()+"\n");
				ta.append(cbg.getSelectedCheckbox().getLabel()+"\n");
				
				
			}
		});
		
		ta = new TextArea(20, 30);
		//ta.setText("aaa\nbbb\nccc");
		ta.append(name);
		ta.append(surname);
		ta.append(group);
		
		label = new Label("");
		label.setBackground(new Color(255, 125, 0));
		cbg = new CheckboxGroup();
		taxa  = new Checkbox("Taxa", cbg, true);
		buget  = new Checkbox("Buget", cbg, false);
	
		
		taxa.addItemListener(e -> {
			if (taxa.getState()) {
				label.setText(taxa.getLabel());
			}	
		});
		
		buget.addItemListener(e -> {
			if (buget.getState()) {
				label.setText(buget.getLabel());
			}	
		});
		
		
		add(num);
		add(nume);
		add(pren);
		add(prenume);
		add(grp);
		add(grupa);
		add(an);
		add(facultate);
		add(curs);
		add(taxa);
		add(buget);
		add(ta);
		add(buton);
	
	
	
	
	
	
	
	this.addWindowListener(this);
	
	setSize(600, 600);
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


