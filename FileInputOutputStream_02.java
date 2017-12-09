
import java.io .* ;
public class FileInputOutputStream_02{
	
	
	public static void main (String[] args){
	
		File inputFile = new File("FileInputOutputStream_02.jpg");
		File outputFile = new File("FileInputOutputStream_02_copy.jpg");


		byte buf[]=new byte[1024];

		try{

			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);

			int bytes_read = 0;

			while(fis.read(buf) != -1)
				fos.write(buf);

			fis.close();
			fos.close();
			
		}
		catch(IOException e){
			System.out .println("Eroare: "+e.toString    ());
		}
		
		
		System.out .println("Copiere terminata...");
		
	}
}
