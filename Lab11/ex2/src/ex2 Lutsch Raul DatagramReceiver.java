


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;



public class DatagramReceiver {

    //portul pe care se face schimbul de mesaje
    public int port = 1112;
    
    //socketul pentru citirea datagramelor
    private DatagramSocket socket;
    
    private BufferedReader fromClient;		//Vine info de la client
    private PrintStream toClient;		//Trimitem info la client
    
    
    /**
     * Initializeaza datagram socketul.
     */
    public void initSocket(){
        
        try {
            socket = new DatagramSocket(port);
            System.out.println("Socket initializat. Astept mesaje ...");
        } catch (SocketException e) {
           
            System.out.println("Socketul nu poate fi creat !");
            e.printStackTrace();
        }
    }
    
    
    /**
     * Citeste un mesaj sub forma de datagrama.
     */
    public void citesteMesaj(){
        
        if(socket == null){
            System.out.println("Socketul nu este initializat !");
            return;
        }
        
        //initializeaza buferul de receptie
        byte buffer[] = new byte[256];
        
        //initializeaza datagram packet-ul
        DatagramPacket pachetReceptionat = new DatagramPacket(buffer, buffer.length);

        
        try {
            
            //citeste mesajul
            while (true) {
             
                //receptioneaza o parte din mesaj (dimensiunea buferului de trimitere-receptie)
                socket.receive(pachetReceptionat);

                //re-compune mesajul si il afiseaza
                String mesaj = new String(buffer, "US-ASCII");
                System.out.println("Mesaj receptionat: " + mesaj);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    

 public void trimiteMesaj(String mesaj){
        
        if(toClient == null){	//verifica daca fluxul de iesire nu e null
            System.out.println("Conexiune cu clientul indisponibila !");
            return;
        }
        
        //scrie mesajul
        toClient.println(mesaj);
        
    }
    
    /**
     * Asculta, citeste si afiseaza mesajul de la client.
     */
    public void citMesaj(){
        
        if(fromClient == null){
           System.out.println("Conexiune cu clientul indisponibila !"); 
           return;
        }
        
        try {
            
            //citeste mesaj
            String mesaj = fromClient.readLine();
        
            System.out.println("Clientul a trimis mesajul : " + mesaj);
            
        } catch (IOException e) {
        
            System.out.println("Nu am putut citi mesajul de la client!");
            e.printStackTrace();
        }
        
    }
    
    public String stocheazaMesaj(){
    	
    	if(socket == null){
    		System.out.println("Socketul nu este initializat !");
    	
    	}
    	
    	//initializeaza buferul de receptie
    	byte buffer[] = new byte[256];
    	
    	//initializeaza datagram packet-ul
    	DatagramPacket pachetReceptionat = new DatagramPacket(buffer, buffer.length);
    	
    	
    	try {
    		
    		//citeste mesajul
    		while (true) {
    			
    			//receptioneaza o parte din mesaj (dimensiunea buferului de trimitere-receptie)
    			socket.receive(pachetReceptionat);
    			
    			//re-compune mesajul si il afiseaza
    			String mesaj = new String(buffer, "US-ASCII");
    			System.out.println("Mesaj receptionat: " + mesaj);
    			return mesaj;
    		}
    		
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
		return "0";
    } 
    
}
