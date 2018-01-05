

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;



public class TCPServer {

	String mesaj = new String();
    //portul folosit pentru conexiune 
    public int port = 1234;
    
    //socketul server
    private ServerSocket server;  //obiect server socket
    //socketul client
    private Socket client; // obiect socket
        
    //stream-uri pentru comunicarea cu clientul
    private BufferedReader fromClient;		//Vine info de la client
    private PrintStream toClient;		//Trimitem info la client
    
   
    /**
     * Creeaza serverul si asculta cererile pentru conexiune ale clientilor.
    */
    public void startServer(){
        
        System.out.println("Initializez aplicatia server ...");
        try {
            
            //initializeaza serverul
            server = new ServerSocket(port);
        
            System.out.println("\n\nAscult pentru conexiunea clientului ...");
            
            //asculta pentru conexiunile clientilor
            client = server.accept();
            
            System.out.println("Clientul " + client.getInetAddress().getHostName() + " conectat !");
            
            //creez stream-urile pentru scriere/citire mesaje
            fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            toClient = new PrintStream(client.getOutputStream());

        } catch (IOException e) {
            
            System.out.println("Serverul nu a putut fi creat !");
            e.printStackTrace();
        
        }
    }
    
    
	
	public void trimiteIP(){
        
        if(toClient == null){
            System.out.println("Conexiune cu clientul indisponibila !");
            return;
        }
        
        //scrie mesajul
        System.out.println("Trimit ip-ul catre client");
        toClient.println("Ip-ul dumneavoastra este: " +client.getInetAddress());
        
    	}
    
    
    /**
     * Trimite un mesaj la client. 
     * @param mesaj mesajul de trimis la client.
     */
    public void trimiteMesaj(String mesaj){
        
        if(toClient == null){	//verifica daca fluxul de iesire nu e null
            System.out.println("Conexiune cu clientul indisponibila !");
            return;
        }
        
        //scrie mesajul
        toClient.println(mesaj);
        
    }
    
  
    
    public String stocheazaMesaj(){
    	
    	if(fromClient == null){
    		System.out.println("Conexiune cu clientul indisponibila !"); 
    	}
    	
    	try {
    		
    		System.out.println("A intrat in stocheaza mesaj");
    		//citeste mesaj
    		mesaj = fromClient.readLine();   		
    		System.out.println("Clientul a trimis mesajul : " + mesaj);
    		return mesaj;
    		
    		
    	} catch (IOException e) {
    		
    		System.out.println("Nu am putut citi mesajul de la client!");
    		e.printStackTrace();
    	}
    	
    	return "0";
    	
    }
    
    
    /**
     * Inchide conexiunea cu clientul.
     */
    public void inchideConexiunea(){
       
        try {
            client.close();
            server.close();
            fromClient.close();
            toClient.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
