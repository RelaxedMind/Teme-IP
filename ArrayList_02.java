import java.util.*;

public class ArrayList_02 {
	public static void main(String args[]) {
		Collection<String> obj = new ArrayList<String>();

		obj.add("Ana");
		obj.add("Maria");
		obj.add("Ion");


		System.out.println("Elementele din lista:"+obj);

		//Collection nu suporta adaugare de elemente pe baza de index
		//obj.add(0, "Inca o Ana");

		System.out.println("Lista completata:"+obj);

		//eliminare de elemente varianta 1
		obj.remove("Maria");
		obj.remove("Nu exista");

		System.out.println("Lista actualizata:"+obj);

		//eliminare de elemente varianta 2
		obj.remove(1);

		System.out.println("Lista finala:"+obj);
	}
}