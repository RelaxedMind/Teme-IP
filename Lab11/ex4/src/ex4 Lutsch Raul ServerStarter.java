
import java.util.Date;






public class ServerStarter {

	
	
	public  static void getProperties(String prop,TCPServer serv)
	{
		String properties = new String();
		if(prop.equals("/getProperties"))
		{
			properties=	System.getProperties().toString();
		serv.trimiteMesaj("Proprietetile serverului sunt: " +properties);
		}
		
	}
	
	
	public  static void getTime(String timp,TCPServer serv)
	{
		Date date = new Date();
		String time = new String();
		if(timp.equals("/getTime"))
		{	time=	date.toString();
		
		serv.trimiteMesaj("Timpul serverului este: " +time);
		}
	}
	
	public  static void getConnection(String con, TCPServer serv)
	{
		if(con.equals("/getConnection"))
		{
		
			serv.trimiteIP();
		}
		
	
		
	}
	
	
	
	
	
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
       
 
       
       getProperties(mesaj, server);
       getTime(mesaj, server);
       getConnection(mesaj, server);
       
       
        
        
        //inchid conexiunea cu clientul
        server.inchideConexiunea();
        }
   
        
    }
}
