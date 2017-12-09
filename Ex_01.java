
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Sample1Frame extends JFrame {
    
    private JButton button1;
    private JButton button2;
    private JLabel label;
   
    private int value;
    
   
    public Sample1Frame(){
        initUI();
    }

   
    private void initUI() {
       
        setSize(new Dimension(400, 250));
        
        setTitle("Sample1");
        
        setLayout(null);
       
        button1 = new JButton("+");
        button2 = new JButton("-");
       
        button1.setBounds(50, 50, 100, 30);
        button2.setBounds(50, 100, 100, 30);
       
        add(button1);
        add(button2);
        
        label = new JLabel("apasa pe un buton !");
        
        label.setBounds(200, 70, 150, 30);
       
        add(label);
        
        
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                button1Apasat(evt);}
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                button2Apasat(evt); }
         });

	this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
    
   
    private void button1Apasat(ActionEvent evt){
        System.out.println("button1 apasat !");
      
        value+=5;
       
        label.setText("" + value);
    }
        
    private void button2Apasat(ActionEvent evt){
        System.out.println("button2 apasat !");
      
        value-=5;
       
        label.setText("" + value);
    }    
}


 class Test {
    public static void main(String[] args) {
       
        Sample1Frame app = new Sample1Frame();
       
        app.setVisible(true);
    }
}
