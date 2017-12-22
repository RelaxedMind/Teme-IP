import java .io .* ;
import java .util .* ;
public class DataInputOutputStream_01{
	
	public static void main (String[] args){
		try {
			DataOutputStream iesire=new DataOutputStream (new BufferedOutputStream (new FileOutputStream("DataInputOutputStream_01.dat")));
			
			boolean vb1=true;
			boolean vb2=false;
			System.out .println ("vb1 = "+vb1+" si vb2 = "+vb2);
			iesire.writeBoolean(vb1);
			iesire.writeBoolean(vb2);
			
			int i1=2;
			System.out .println("i1= "+i1);
			iesire.writeInt(i1);
			
			float f1=3.1f;
			System.out .println("f1= "+f1);
			iesire.writeFloat(f1);
			
			double db=1.3;
			System.out .println("db= "+db);
			iesire.writeDouble(db);
			
			char ch='a';
			System.out .println("ch= "+ch);
			iesire.writeChar(ch);
			
			String sir= "sir de caractere";
			System.out .println("sir= "+sir);
			iesire.writeUTF(sir);
			
			iesire.close ();
			
			DataInputStream intrare=new DataInputStream (new BufferedInputStream (new FileInputStream ("DataInputOutputStream_01.dat")));
			
			System.out .println("\nTest vb1= "+intrare.readBoolean()+" si vb2= "+intrare.readBoolean());
			System.out .println("Test: i1= "+intrare.readInt());
			System.out .println("Test: f1= "+intrare.readFloat());
			System.out .println("Test: db= "+intrare.readDouble());
			System.out .println("Test: ch= "+intrare.readChar());
			System.out .println("Test: sir= "+intrare.readUTF());
			
			intrare.close ();
		}
		catch(IOException e){
			System.err.println(e.getMessage ());}
		
		
	}
}
