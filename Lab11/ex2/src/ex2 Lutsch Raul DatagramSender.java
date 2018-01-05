
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;



public class DatagramSender {

    //portul pe care se face schimbul de mesaje
    public int port = 1112;
    
    //hostul destinatie al mesajului
    private String destinatie;
    
    //socketul pentru trimiterea datagramelor
    private DatagramSocket socket;
    
    /**
     * Seteaza hostul destinatie al mesajului.
     * @param destinatie hostul destinatie.
     */
    public void setHostDestinatie(String destinatie){
        this.destinatie = destinatie;
        
    }
    
    /**
     * Initializeaza socketul.
     */
    public void initSocket(){
        
        try {
            socket = new DatagramSocket();
            System.out.println("Socket initializat !");
        } catch (SocketException e) {
           
            System.out.println("Socketul nu poate fi creat !");
            e.printStackTrace();
        }
    }
    
    
    
    /**
     * Trimite mesaj sub forma de datagrama. 
     * @param mesaj mesajul de trimis.
     */
    public void trimiteMesaj(String mesaj){
        
        if(socket == null){
            System.out.println("Socketul nu este initializat !");
            return;
        }
        
        //citeste mesajul string sub forma de tablou de byte
        byte buffer[] = mesaj.getBytes(); 
        
        try {

            //citeste destinatia sub forma de obiect InetAddress 
            InetAddress adresa = InetAddress.getByName(destinatie);

            //creeaza datagrama de transmis
            DatagramPacket pachetDeTrimis = new DatagramPacket(buffer, buffer.length, adresa, port);

            //trimite pachetul
            socket.send(pachetDeTrimis);
      
        } catch (UnknownHostException e) {
        
            System.out.println("Hostul destinatie este necunoscut !");
            e.printStackTrace();
            
        }catch(IOException e) {
            
            System.out.println(" Mesajul nu poate fi transmis !");
            e.printStackTrace();
        }
        
    }
    
    
    
}
