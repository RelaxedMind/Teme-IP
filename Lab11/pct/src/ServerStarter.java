

public class ServerStarter {

    public static void main(String[] args) {
        
        //intializez serverul
        TCPServer server = new TCPServer();
        String mesaj = new String();
        //pornesc serverul
     
        while(true)
        {
        
        server.startServer();
        
      
        //citesc mesaj de la clientul conectat
       // String mesaj = server.citesteMesaj();
       mesaj = server.stocheazaMesaj();
        //String mesaj = "2";
        
    
        int MesajClient = Integer.parseInt(mesaj);
        
      
        mesaj = Integer.toBinaryString(MesajClient);
        
        //trimit mesaj la client
        System.out.println("Trimit mesaj : " + mesaj);
        server.trimiteMesaj(mesaj);
        
        //citesc mesaj
      
        
        
        
        
        //inchid conexiunea cu clientul
        server.inchideConexiunea();
        }
   
        
    }
}
