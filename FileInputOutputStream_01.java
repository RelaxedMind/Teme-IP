
import java.io .* ;
public class FileInputOutputStream_01{
	
	
	public static void main (String[] args){
		byte buf[]=new byte[64];
		try{
			System.out .println ("Scrie ce sa se puna in fisier");
			System.in.read (buf,0,64);
			System.out .println("\nS-a citit in buf:");
			for(int i=0;i<64;i++)System.out .print((char)buf[i]);
		}
		catch(Exception e){
			System.out .println("Eroare: "+e.toString    ());
		}
		
		try{
			FileOutputStream iesire=new FileOutputStream ("FileInputOutputStream_01.txt");
			iesire.write (buf);
		}
		catch(Exception e){
			System.out .println("Eror: "+e.toString ());
		}
		
		try{
			System.out .println("\nUmple cu altceva bufferul:");
			System.in.read (buf,0,64);
			System.out .println("\nS-a citit in buffer a doua oara:");
			for(int i=0;i<buf.length ;i++)
				System.out .print((char)buf[i]);
				System.out .println();
		}
		catch(Exception e){
			System.out .println("Eroare: "+e.toString ());
		}
		
		try {
			FileInputStream intrare=new FileInputStream("FileInputOutputStream_01.txt");
			intrare.read(buf);
			System.out .println("\nDin fisier s-a pus in buf");
		}
		catch(Exception e){
			System.out .println("Eroare: "+e.toString ());
		}
		
		for(int i=0;i<64;i++)
			System.out .print((char)buf[i]);
	}
}
