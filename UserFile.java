import java.util.Enumeration;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.lang.Comparable;
/*Implementati o clasa numita UserFile (denumire, extensie, tip, marime in bytes, constructori, mutatori si accesori).
 *  Tipurile de fisiere sunt predefinite si stocate intr-un obiect Hashtable (de ex. „imagine” =>0, „text” =>1, 
 *  „aplicatie” =>2, etc.). Creați un șir de obiecte instanțiate din această clasă și citiți de la tastatură datele
 *   aferente. Afișați toate extensiile specifice tipurilor de fișiere predefinite. Ordonați lista de fișiere în funcție
 *    de mărime si afișați rezultatul
 * */
 
public class UserFile implements Comparable<UserFile> {

	String denumire;
	String extensie;
	String tip;
	int marime_bytes;
	
	UserFile(String denumire, String expresie, String tip, int marime_bytes){
	
		this.denumire = denumire;
		this.extensie=expresie;
		this.tip=tip;
		this.marime_bytes = marime_bytes;
		
	}
	
	UserFile(){
		
	
		
	}
	
//	 public int compareTo(Book o) {
//	       
//	        return toString().compareTo(o.toString());
//	    }
	
	//////SETERS//////////
	public void SetDenumire(String den){
		denumire = den;
	}
	public void SetExtensie(String ext){
		extensie = ext;
	}
	public void SetTip(String tip){
		this.tip=tip;
	}
	public void SetMarime(int size){
		marime_bytes=size;
	}
	
	//////////GETERS//////////
	public String GetDenumire(){
		return denumire;
	}
	public String GetExtensie(){
		return extensie;
	}
	public String GetTip(){
		return tip;
	}
	public int GetMarime(){
		return marime_bytes;
	}

	@Override
	public int compareTo(UserFile obiect) {
		
		int lastCmp = Integer.compare((marime_bytes), obiect.GetMarime());
		return lastCmp;
	}
	
	
	//Hashtable<String, String> hashtable = new Hashtable<String, String>();
	
}


class ex4{
	public static void main(String[] args) {
		
		
		int nr_fis;
		int marime;
		String name;
		Scanner pe_name = new Scanner(System.in);
		Scanner nr = new Scanner(System.in);
		Scanner size = new Scanner(System.in);
		
		System.out.println("Cate fisiere doriti sa introduceti? ");
		nr_fis = nr.nextInt();
		UserFile[] files = new UserFile[nr_fis];
		for(int i = 0; i<nr_fis;i++)
		{	
			files[i] = new UserFile();
			System.out.print("Denumire: ");
			
			name =pe_name.nextLine();
			files[i].SetDenumire(name);
			name = null;
			
			System.out.print("Extensie: ");
			
			name =pe_name.nextLine();
			files[i].SetExtensie(name);
			name =null;
			
			System.out.print("Tip: ");
			
			name =pe_name.nextLine();
			files[i].SetTip(name);
			name=null;
			
			System.out.print("Marime in bytes: ");
			marime = size.nextInt();
			files[i].SetMarime(marime);
			
			name = null;
		}
		
		/////Acelasi lucru am facut cu hastable///////
//		for(int i = 0; i<nr_fis;i++)
//		{
//			int j=0;
//			System.out.println();
//			
//			while(j<nr_fis)
//			{
//			if(files[j].GetTip().equals("imagine"))
//				System.out.println("IMAGINE| Extensie: " +files[j].GetExtensie());
//			j++;
//			}
//			
//			j = 0;
//			System.out.println();
//			while(j<nr_fis)
//			{
//				if(files[j].GetTip().equals("text"))
//					System.out.println("Text| Extensie: " +files[j].GetExtensie());
//				j++;
//			}
//			
//			System.out.println();
//			j = 0;
//			while(j<nr_fis)
//			{
//				if(files[j].GetTip().equals("aplicatie"))
//					System.out.println("Aplicatie| Extensie: " +files[j].GetExtensie());
//				j++;
//			}
//			
//		}
		
		////////Ordonare dupa marime////////
		
		Arrays.sort(files);
				
		
		//Printall
		
		System.out.println("~~~SORTARE DUPA MARIME BYTES!!!~~~");
		System.out.println("");
		for(int i = 0; i< nr_fis;i++)
		{
			System.out.println("Denumire: " +files[i].GetDenumire());
			System.out.println("Extensie: " +files[i].GetExtensie());
			System.out.println("Tip: " +files[i].GetTip());
			System.out.println("Marime: " +files[i].GetMarime());
			System.out.println("");
		}
		
		
		//GetAll
		
		
		
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		//e ex. „imagine” =>0, „text” =>1,  „aplicatie” =>2, etc.)
		/////////ACELASI LUCRU DOAR CA EXTENSILE LE PUN IN HASHTABLE//////
		int j = 0;
		while(j<nr_fis)
		{
		if(files[j].GetTip().equals("imagine"))
			hashtable.put(files[j].GetExtensie(),"imagine");
		j++;
		}
		
		j = 0;
		while(j<nr_fis)
		{
			if(files[j].GetTip().equals("aplicatie"))
				hashtable.put(files[j].GetExtensie(),"aplicatie");
			j++;
		}
		j = 0;
		while(j<nr_fis)
		{
			if(files[j].GetTip().equals("text"))
				hashtable.put(files[j].GetExtensie(),"text");
			j++;
		}
//		hashtable.put("imagine", "0");  //key extensile //valori sir caractere
//		hashtable.put("text", "1");
//		hashtable.put("aplicatie", "2");
	
	Enumeration	names;
	String key;
	names = hashtable.keys();
		while(names.hasMoreElements()) {
		key = (String) names.nextElement();
			System.out.println("Key: " +key+ "=> " + hashtable.get(key));
	}
}
}
















