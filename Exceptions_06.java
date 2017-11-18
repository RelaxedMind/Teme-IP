
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Exceptions_06 {

	public static void main(String... args){
		String input = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Scrie un text: ");
		
		try {
			input = br.readLine();	//https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html#readLine--
		} 
		catch (IOException e) {
			System.out.println("...");
		}

		System.out.println("Ai scris: "+input);
		
        }
}
