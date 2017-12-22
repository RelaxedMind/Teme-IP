package TCP;


public class ServerStarter {

    public static void main(String[] args) {
        
        //intializez serverul
        TCPServer server = new TCPServer();
        
        //pornesc serverul
        server.startServer();
        
        //citesc mesaj de la clientul conectat
      String nume = server.stocheazaMesaj();
      String grupa = server.stocheazaMesaj();  
      
        String mesaj1 = "Salut " + nume +" din grupa " +grupa;
        
        //trimit mesaj la client
        System.out.println("Trimit mesaj : " + mesaj1);
        server.trimiteMesaj(mesaj1);
        
        //citesc mesaj
//     server.citesteMesaj();
        
     
        
        //inchid conexiunea cu clientul
        server.inchideConexiunea();
    }
}
