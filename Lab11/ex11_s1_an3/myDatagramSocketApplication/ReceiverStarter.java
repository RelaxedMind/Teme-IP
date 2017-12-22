

public class ReceiverStarter {

    public static void main(String[] args) {
        
        //instantiaza datagram receiverul
        DatagramReceiver receiver = new DatagramReceiver();
        
        //initializeaza socketul
        receiver.initSocket();
        
        //citeste mesaj
        receiver.citesteMesaj();
    }
    
    
}
