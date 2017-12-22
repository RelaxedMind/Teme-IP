import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SenderStarter {

    public static void main(String[] args) {
        
    	String fisier = new String();
    	Scanner scan = new Scanner(System.in);
        //instantiere datagram sender
        DatagramSender sender = new DatagramSender();
        
        //setare host destinatie
        sender.setHostDestinatie("localhost");
        
        //initializare socket
        sender.initSocket();
        
        System.out.println("Introduceti numele fisierului: ");
        fisier=scan.nextLine();
        
   

    	
        
        //trimitere mesaj
       
        System.out.println("Mesaj trimis : " + fisier);
        sender.trimiteMesaj(fisier);
        
        
        
        
        
    }
}
