import java.util.*;

public class HashSet_01 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		for (String a : args)
			if (!s.add(a))
				System.out.println("Duplicate detected: " + a);

		System.out.println(s.size() + " distinct words: " + s);
	}
}
