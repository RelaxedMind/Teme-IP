import java.io.*;
public class ByteArrayIOStream_01 {

	public static void main(String args[])throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(27);

		while( baos.size()!= 27 ) {
			// Gets the inputs from the user
			baos.write("sir de caractere de intrare".getBytes()); 
		}

		byte b [] = baos.toByteArray();
		System.out.println("Afisam continutul");
      
		for(int i=0 ; i < b.length; i++) {	
			System.out.print((char)b[i]  + "   "); 
		}
		System.out.println("\t\t");
      
		int c;
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		System.out.println("Conversia in majuscule " );
      
		for(int y = 0 ; y < 1; y++) {
			while(( c = bais.read())!= -1) {
				System.out.print(Character.toUpperCase((char)c));
			}
			bais.reset(); 
		}
	}
}