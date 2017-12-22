



public class SenderStarter {

    public static void main(String[] args) {
        
        //instantiere datagram sender
        DatagramSender sender = new DatagramSender();
        
        //setare host destinatie
        sender.setHostDestinatie("localhost");
        
        //initializare socket
        sender.initSocket();
        
        //trimitere mesaj
        String mesaj = "Lutsch Raul";
        System.out.println("Mesaj trimis : " + mesaj);
        sender.trimiteMesaj(mesaj);
        
        String mesaj1 = "2233";
        System.out.println("Mesaj trimis : " + mesaj1);
        sender.trimiteMesaj(mesaj1);
        
        
        
    }
}
