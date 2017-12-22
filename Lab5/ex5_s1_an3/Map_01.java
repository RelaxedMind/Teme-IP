import java.util.*;
	
public class Map_01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		String values[] = {"12", "-77", "23", "12"};

		
		for (String a : values) {
			Integer freq = map.get(a);
			map.put(a, (freq == null) ? 1 : freq + 1);
		}
		System.out.println(map.size() + " distinct words:");
		System.out.println(map);
	}
}