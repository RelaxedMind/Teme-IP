import java.util.*;

public class SortedSet_01 {
	public static void main(String[] args) {

      	// crearea unui set sortat TreeSet
		SortedSet <String>set = new TreeSet<String>(); 
      		// adaugarea de elemente in set	
		set.add("b");
      		set.add("c");
      		set.add("a");
      	// parcurgerea elementelor din set
      		Iterator <String>it = set.iterator();
      		while (it.hasNext()) {
         		// preluarea elementului curent
			String element = it.next();
			System.out.println(element);
		}
	}
}
