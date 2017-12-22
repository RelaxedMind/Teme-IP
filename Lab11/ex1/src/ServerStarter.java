

public class ServerStarter {

    public static void main(String[] args) {
        
        //intializez serverul
        TCPServer server = new TCPServer();
        
        //pornesc serverul
     
        while(true)
        { 
        server.startServer();
        
      
        //citesc mesaj de la clientul conectat
       // String mesaj = server.citesteMesaj();
        String mesaj = server.stocheazaMesaj();
        //String mesaj = "2";
        
        int MesajClient = Integer.parseInt(mesaj);
        
        mesaj=null;
        mesaj = Integer.toBinaryString(MesajClient);
        
        //trimit mesaj la client
        System.out.println("Trimit mesaj : " + MesajClient);
        server.trimiteMesaj(mesaj);
        
        //citesc mesaj
        server.citesteMesaj();
        
        
        
        
        //inchid conexiunea cu clientul
        server.inchideConexiunea();
        }
    }
}
