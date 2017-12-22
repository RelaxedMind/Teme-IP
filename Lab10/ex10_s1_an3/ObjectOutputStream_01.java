
import java .io.* ;

public class ObjectOutputStream_01{
	public static void main (String[] args){
		
		String obj1 = "Sir de caractere";
		MyVector obj2 = new MyVector();
		
		try{
			FileOutputStream fisIesire=new FileOutputStream("temp.tmp");
			
			ObjectOutputStream obIesireSerie=new ObjectOutputStream (fisIesire);
			
			obIesireSerie.writeObject(obj1);
			
			System.out .println("Vector initial: tab[0]="+obj2.citesteVector(0)+" tab[1]="+obj2.citesteVector(1)+" tab[2]="+obj2.citesteVector(2));
			
			obIesireSerie.writeObject(obj2);
			
			obIesireSerie.close ();
		}
		catch(IOException e) {
			System.out .println ("Eroare la serializare!");
		}
		
		System.out .println("S-a terminat serializarea si stocarea datelor\n");
		System.out .println("Apasa ENTER pt. deserializarea si reconstituirea datelor");
		
		try{System.in.read ();}catch(IOException e){}
		
		try{
			FileInputStream fisIntrare=new FileInputStream ("temp.tmp");
			
			ObjectInputStream obIntrareSerie=new ObjectInputStream (fisIntrare);
			
			String obInS1=(String)obIntrareSerie.readObject();
			System.out .println(obInS1);
			
			MyVector vctRezultat=(MyVector)obIntrareSerie.readObject ();
			System.out .println("Vector citit serial: tab[0]="+vctRezultat.citesteVector(0)+"tab[1]="+vctRezultat.citesteVector(1)+"tab[2]="+vctRezultat.citesteVector(2));
			
			vctRezultat.scrieVector(1,5);
			int k=vctRezultat.citesteVector(2);
			System.out .println("Vector preluat modificat: tab[0]="+vctRezultat.citesteVector(0)+"tab[1]="+vctRezultat.citesteVector(1)+"tab[2]="+vctRezultat.citesteVector(2));
			
			fisIntrare.close();
		}
		catch(IOException e){System.out .println("Eroare la deserializare");}
		catch(ClassNotFoundException e){System.out .println("ClassNotFoundException!!!");}
	}
}

class MyVector implements Serializable {
	private int[] tab=new int [3];
	public MyVector(){
		tab[0]=0;
		tab[1]=1;
	}
	
	public void scrieVector(int i,int j){
		tab[i]=j;
	}
	public int citesteVector(int i){
		return tab[i];
	}
}
