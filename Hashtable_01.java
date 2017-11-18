import java.util.Hashtable;
import java.util.Enumeration;

public class Hashtable_01 {
 
	public static void main(String[] args) {
 
		Enumeration names;
		String key;
 
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
 
 	  	hashtable.put("Key1","Ana");
		hashtable.put("Key2","are");
		hashtable.put("Key3","mere");
		hashtable.put("Key4","pere");
		hashtable.put("Key5","si banane");
 
		names = hashtable.keys();
		while(names.hasMoreElements()) {
	//		key = (String) names.nextElement();
			System.out.println("Key: " +key+ " & Value: " + hashtable.get(key));
		}
	}
}