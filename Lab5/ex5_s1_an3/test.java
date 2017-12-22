import java.util.*;
import java.lang.Comparable;
/*
interface Comparable<T> {
	public int compareTo(T o);
}
*/

class Name  {
	private final String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() { return firstName; }
	public String getLastName()  { return lastName;  }

	


	public String toString() {
		return firstName + " " + lastName;    //Suprascrisa
	}

	
}

class Test {
	public static void main(String... args) {
		Name bandsArray[] = {
			new Name("Foo", "Fighters"),
			new Name("Nir", "Vana"),
			new Name("Met", "Allica"),
			new Name("AC", "DC")
		};
		List<Name> names = Arrays.asList(bandsArray);
		//Arrays.sort(bandsArray);		//face sortare de tabloului
		//Collections.sort(names);		//face o sortare pe baza metodei compareTo-- trebuie data lista musai

		
		System.out.println(names);
	}
}