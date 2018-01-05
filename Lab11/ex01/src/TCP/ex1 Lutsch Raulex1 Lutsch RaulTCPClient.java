package TCP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class TCPClient {

	//portul folosit pentru conexiune 
    	public int port = 1234;
   
    	//hostul destinatie
    	private String destinatie;
   
    	//socketul client
    	private Socket client;
    
	//stream-uri pentru comunicarea cu serverul
    	private BufferedReader fromServer;
    	private PrintStream toServer;
    
    
    /**
     * Seteaza hostul destinatie.
     * @param destinatie numele hostului.
     */
    	public void setHostName(String destinatie){
        	this.destinatie = destinatie;
    	}
    
    
    /**
     * Initializeaza aplicatia client si se conecteaza la server. 
     */
    	public void conecteaza_te(){
        
        if(destinatie == null){
            	System.out.println("Hostul destinatie nu este specificat !");
            	return;
        }
        
        try {
            
            	System.out.println("Incerc conexiunea la server...");
            
            //initializeaza clientul
            	client = new Socket(destinatie, port);
        
            	System.out.println("M-am conectat la serverul : " + destinatie);
            
            //creez stream-urile pentru scriere/citire mesaje
            	fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            	toServer = new PrintStream(client.getOutputStream());
            
        } catch (UnknownHostException e) {
            	System.out.println("Host necunoscut !");
            	e.printStackTrace();
        } catch (IOException e) {
            	System.out.println("Conectiunea nu poate fi realizata !");
            	e.printStackTrace();
        }
        
    	}
    
    
    /**
     * Trimite un mesaj la Server. 
     * @param mesaj mesajul de trimis la server.
     */
    	public void trimiteMesaj(String mesaj){
        
        if(toServer == null){
            System.out.println("Conexiune cu serverul indisponibila !");
            return;
        }
        
        //scrie mesajul
        toServer.println(mesaj);
        
    	}
    
    /**
     * Asculta, citeste si afiseaza mesajul de la server.
     */
    	public void citesteMesaj(){
        
        if(fromServer == null){
           	System.out.println("Conexiune cu serverul indisponibila !"); 
           	return;
        }
        
        try {
            
            //citeste mesaj
        	String mesaj = fromServer.readLine();
        
            	System.out.println("Serverul a trimis mesajul : " + mesaj);
            
        } catch (IOException e) {
        
            	System.out.println("Nu am putut citi mesajul de la server!");
            	e.printStackTrace();
        }
        
    	}
    
    
    /**
     * Inchide conexiunea cu serverul.
     */
    	public void inchideConexiunea(){
       
        try {
            	client.close();
            	fromServer.close();
            	toServer.close(); 
        } catch (IOException e) {
            	e.printStackTrace();
        }
        
    	}
}
