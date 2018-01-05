import java.util.Scanner;

public class ClientStarter {

    public static void main(String[] args) {
      
    	Scanner scan = new Scanner(System.in);
    	String decizie = new String();
    	
        //creez aplicatia client
        TCPClient client = new TCPClient();
        
        //seteaza hostul destinatie
        client.setHostName("localhost");
        
        
        System.out.println("Introduceti ce vreti sa obtineti de la server!");
        System.out.println("/getProperties -- returnează proprietețile sistemului server");
        System.out.println("/getTime - returnează ora locală a serverului");
        System.out.println("/getConnection - returnează adresa clientului");
        
        decizie=scan.nextLine();
        
        //realizeaza conexiunea la server
        client.conecteaza_te();
        
        //trimite mesaj la server
        
        
        
       
        System.out.println("Trimit mesaj : " + decizie);
        client.trimiteMesaj(decizie);
   
       
             
        //citeste mesaj
        client.citesteMesaj();
        
        //inchid conexiunea cu serverul
        client.inchideConexiunea();
    }
}
