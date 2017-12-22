

public class ServerStarter {

    public static void main(String[] args) {
        
        //intializez serverul
        TCPServer server = new TCPServer();
        
        //pornesc serverul
        server.startServer();
        
        //citesc mesaj de la clientul conectat
        server.citesteMesaj();
        
        String mesaj1 = "Confirm receptionarea primului mesaj.";
        
        //trimit mesaj la client
        System.out.println("Trimit mesaj : " + mesaj1);
        server.trimiteMesaj(mesaj1);
        
        //citesc mesaj
        server.citesteMesaj();
        
        
        String mesaj2 = "Acesta este al doilea si ultimul mesaj.";
        
        //trimit mesaj
        System.out.println("Trimit mesaj : " + mesaj2);
        server.trimiteMesaj(mesaj2);
        
        //inchid conexiunea cu clientul
        server.inchideConexiunea();
    }
}
