
/*Scrieți o aplicație Java ce permite prin intermediul bibliotecii Swing selectarea unui 
 * fișier din sistemul local de fișiere. Se pot selecta mai multe fișiere, iar denumirea lor 
 * alături de calea completă va fi afișată într-o componentă de tip etichetă (JLabel).
 * */


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

 class MyFrame extends JFrame{
	
	 MyFrame(String test){
	 	initUI();
	 }

	private void initUI() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setSize(new Dimension(350, 250));
	        
	        setTitle("Test");
		JLabel cale = new JLabel("Cale");
		JLabel nume = new JLabel("Nume");

		
		
		
		String path = "C:\\Users\\djdjr\\Documents\\AN 3\\IP\\Teme\\Lab9\\ex2";
		JFileChooser jfc = new JFileChooser(path);

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
			System.out.println(selectedFile.getName());
			cale.setText(selectedFile.getAbsolutePath());
			nume.setText(selectedFile.getName());
		}
		
	add(cale);
	add(nume);
		
	}
 }





public class la9ex2 {

	public static void main(String[] args) {
	

		MyFrame frame = new MyFrame("Titlu");
		frame.setVisible(true);

	}

}

