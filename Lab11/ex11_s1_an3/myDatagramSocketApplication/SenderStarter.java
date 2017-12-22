

public class SenderStarter {

    public static void main(String[] args) {
        
        //instantiere datagram sender
        DatagramSender sender = new DatagramSender();
        
        //setare host destinatie
        sender.setHostDestinatie("localhost");
        
        //initializare socket
        sender.initSocket();
        
        //trimitere mesaj
        String mesaj = "Salut clientule ! Uite un mesaj, sper ca il primesti pentru ca nu astept confirmare !";
        System.out.println("Mesaj trimis : " + mesaj);
        sender.trimiteMesaj(mesaj);
        
    }
}
