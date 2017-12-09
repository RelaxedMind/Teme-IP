import java.io.*;

public class SequenceInputStream_01 {

	public static void main(String[] args) {
      
	// create two  new strings with 5 characters each
	String s1 = "Hello";
	String s2 = "World";

	// create 2 input streams
	byte[] b1 = s1.getBytes();
	byte[] b2 = s2.getBytes();
	ByteArrayInputStream is1 = new ByteArrayInputStream(b1);
	ByteArrayInputStream is2 = new ByteArrayInputStream(b2);

	// create a new Sequence Input Stream
	SequenceInputStream sis = new SequenceInputStream(is1, is2);
      
	try {
      
		// read 10 characters, 5 from each stream
		for (int i = 0; i < 10; i++) {
			char c = (char) sis.read();
			System.out.print("" + c);
		}

		// change line
		System.out.println();

		// close the streams
		sis.close();

	} catch (IOException ex) {
		ex.printStackTrace();
	}
	}
}