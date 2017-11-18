import java.util.Vector;

public class Vector_01 {
 
	public static void main(String[] args) {
 
		
		Vector <Integer> v = new Vector<Integer>();
		v.add(new Integer(7));
		v.add(new Integer(8));
		v.add(new Integer(9));
 
 	  	for(Integer crt_int : v){
			System.out.println(crt_int.intValue());
		}

		v.removeAllElements();
		//v.setSize(3);

		v.add(0, new Integer(7));
		v.add(0, new Integer(8));
		v.add(0, new Integer(9));
 
 	  	for(int i=0; i<v.size(); i++){
			System.out.println(i+": "+v.elementAt(i).intValue());
		}

		v.removeElementAt(2);

		for(Integer crt_int : v){
			System.out.println(crt_int.intValue());
		}

		v.removeAllElements();
		

	}
}