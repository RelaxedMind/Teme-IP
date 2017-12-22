


public class ClientStarter {

    public static void main(String[] args) {
        
        //creez aplicatia client
        TCPClient client = new TCPClient();
        
        //seteaza hostul destinatie
        client.setHostName("localhost");
        
        //realizeaza conexiunea la server
        client.conecteaza_te();
        
        //trimite mesaj la server
        String mesaj1 = "Primul mesaj de la client catre server.";
        System.out.println("Trimit mesaj : " + mesaj1);
        client.trimiteMesaj(mesaj1);
        
        //ascult raspuns de la server
        client.citesteMesaj();
        
        
        //trimite mesaj la server
        String mesaj2 = "Al doilea mesaj din partea clientului catre server.";
        System.out.println("Trimit mesaj : " + mesaj2);
        client.trimiteMesaj(mesaj2);
        
        //citeste mesaj
        client.citesteMesaj();
        
        //inchid conexiunea cu serverul
        client.inchideConexiunea();
    }
}
