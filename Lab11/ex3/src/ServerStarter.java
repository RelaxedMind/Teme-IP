



public class ServerStarter {

	public  static int isLetter(String mesaj)
	{
			int j = 0;
		  for(int i=0; i<mesaj.length();i++)
		   {
			   if (mesaj.charAt(i)>=65 && mesaj.charAt(i)<=90 || mesaj.charAt(i)>=97 && mesaj.charAt(i)<=122)
				   j++;
		   }
		
		return j;
		
	}
	
	public static int isDigit(String mesaj)
	{
		int j = 0;
		for(int i=0; i<mesaj.length();i++)
		{
			if (mesaj.charAt(i)>=48 && mesaj.charAt(i)<=57)
				j++;
		}
		
		return j;
		
	}
	
    public static void main(String[] args) {
        
        //intializez serverul
        TCPServer server = new TCPServer();
        String mesaj = new String();
        String toClient = new String ();
        //pornesc serverul
     
        while(true)
        {
        
        server.startServer();
        
      
        //citesc mesaj de la clientul conectat
       // String mesaj = server.citesteMesaj();
       mesaj = server.stocheazaMesaj();
        //String mesaj = "2";
       
 
       toClient ="Numarul de litere este: " +isLetter(mesaj) + "Numarul de cifre: " +isDigit(mesaj);
       
       System.out.println(toClient);
       
       	
        //trimit mesaj la client
        System.out.println("Trimit mesaj : " + toClient);
        server.trimiteMesaj(toClient);
        
        //citesc mesaj
      
        
        
        
        
        //inchid conexiunea cu clientul
        server.inchideConexiunea();
        }
   
        
    }
}
