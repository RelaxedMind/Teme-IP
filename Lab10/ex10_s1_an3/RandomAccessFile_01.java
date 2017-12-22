import java .io .* ;
public class RandomAccessFile_01{
	
	public static void main (String[] args){
		byte[] bufRead=new byte[10];
		byte[] bufWrite;
		String temp;
		int conv=0;
		
		byte buf[]=new byte[64];
		try{
			System.out.println("Scrie un text: ");
			System.in.read (buf,0,64);
		}
		catch (IOException e) {
			System.out .println("Eroare: "+e.toString ());
		}
		
		System.out .println("S-a citit: ");
		for(int i=0;i<buf.length ;i++)
			System.out .print((char)buf[i]);
		
		try{
			FileOutputStream iesire=new FileOutputStream ("RandomAccessFile_01.txt");
			iesire.write(buf);
			System.out .println("\nDatele au fost scrise in fisier.");
		}
		catch(Exception ex) {
			System.out .println("Eroare: "+ex.toString ());
		}
		
		try{
			RandomAccessFile fisierRandom=new RandomAccessFile("RandomAccessFile_01.txt","rw");
			int lread;
			while((lread=fisierRandom.read(bufRead))!=-1){
				temp=new String (bufRead,0,lread);
				if(conv==0)temp=temp.toUpperCase();
				else temp=temp.toLowerCase();
				bufWrite=temp.getBytes();
				
				fisierRandom.seek(fisierRandom.getFilePointer()-lread);
				fisierRandom.write(bufWrite);
			}
			fisierRandom.close();
		}
		catch(IOException e) {
			System.out .println(e.getMessage());
		}
		
		try{
			FileInputStream intrare=new FileInputStream ("RandomAccessFile_01.txt");
			intrare.read(buf);
		}
		catch(IOException ex) {
			System.out .println("Eroare: "+ex.toString ());
		}
		
		System.out .println("\nContinutul final al fisierului: ");
		for(int i=0;i<buf.length ;i++)
			System.out .print((char)buf[i]);
		
	}
}
