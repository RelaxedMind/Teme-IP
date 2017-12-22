

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;



public class DatagramReceiver {

    //portul pe care se face schimbul de mesaje
    public int port = 1112;
    
    //socketul pentru citirea datagramelor
    private DatagramSocket socket;
    
    
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
    
}
