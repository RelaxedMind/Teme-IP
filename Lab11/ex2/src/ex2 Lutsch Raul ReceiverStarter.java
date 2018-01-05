import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReceiverStarter {

    public static void main(String[] args) {
       
    	
    	String file = new String();
        //instantiaza datagram receiverul
        DatagramReceiver receiver = new DatagramReceiver();
        
        //initializeaza socketul
        receiver.initSocket();
        
        //citeste mesaj
    
        file = receiver.stocheazaMesaj();
     
        //file_cut =file.replaceAll("\\s+",""); //scoate spatile albe
        int j = 0;
        
        for(int i =0 ; i<file.length();i++)
        {
        	if(file.charAt(i) != '\0')				//Scap de spatiul nealocat
        		j++;
        }
        
        String file_cut = file.substring(0, j);
        
        
        System.out.println("file_cut cut:"+file_cut);
        
        try{
        
        
    	
    		BufferedReader inF1=new BufferedReader (new FileReader (file_cut));
			System.out.println("Fisierul " +file_cut +" exista pe server");
			
			inF1.close();
			
		
        }
    
	catch(FileNotFoundException e){
		System.out .println("Fisierul " +file_cut +" nu exista pe server!");
	}
        catch (IOException e) {
			// TODO Auto-generated catch block
        	System.out .println("IO " +file_cut +" nu exista pe server!");
        }

      
    }
    
    
    
}
