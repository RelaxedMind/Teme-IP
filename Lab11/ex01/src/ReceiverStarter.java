



public class ReceiverStarter {

    public static void main(String[] args) {
        
        //instantiaza datagram receiverul
        DatagramReceiver receiver = new DatagramReceiver();
        
        //initializeaza socketul
        receiver.initSocket();
        
        //citeste mesaj
      String nume=  receiver.stocheazaMesaj();
      String grupa = receiver.stocheazaMesaj();
      
      String mesaj1 = "Salut " + nume +" din grupa " +grupa;
      
      //trimit mesaj la client
      System.out.println("Trimit mesaj : " + mesaj1);
      receiver.trimiteMesaj(mesaj1);
      
      
    }
    
    
}
