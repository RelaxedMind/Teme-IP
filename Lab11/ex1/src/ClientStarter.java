


public class ClientStarter extends MakeGui {

    public static void main(String[] args) {
        
    	MakeGui x = new MakeGui();
    	x.setVisible(true);
       	
    	
        //creez aplicatia client
        TCPClient client = new TCPClient();
        
        //seteaza hostul destinatie
        client.setHostName("localhost");
        
        //realizeaza conexiunea la server
        client.conecteaza_te();
        
        //trimite mesaj la server
        String mesaj1 = Integer.toString(x.numberSet);
        System.out.println("Trimit mesaj : " + mesaj1);
        client.trimiteMesaj(mesaj1);
        
        //ascult raspuns de la server
        client.citesteMesaj();
        
      
        
        //inchid conexiunea cu serverul
        client.inchideConexiunea();
    }
}
