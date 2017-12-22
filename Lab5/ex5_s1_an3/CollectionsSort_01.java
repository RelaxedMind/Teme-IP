import java.util.*;
import java.lang.Comparable;
/*
interface Comparable<T> {
	public int compareTo(T o);
}
*/

class Name implements Comparable<Name> {
	private final String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() { return firstName; }
	public String getLastName()  { return lastName;  }

	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name temp = (Name) o;
		return temp.firstName.equals(firstName) && temp.lastName.equals(lastName);  //suprascrisa
	}

	public int hashCode() {    //suprascrisa
					//face o codare, nu se mai poate  decoda
        	return firstName.hashCode() + lastName.hashCode();
	}

	public String toString() {
		return firstName + " " + lastName;    //Suprascrisa
	}

	//metoda preluata din interfata Comparable
	public int compareTo(Name n) {		
		int lastCmp = lastName.compareTo(n.getLastName());  //compareTo(n.getLastName() - se compara stringurile
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.getFirstName()));
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
		Collections.sort(names);		//face o sortare pe baza metodei compareTo-- trebuie data lista musai

		
		System.out.println(names);
	}
}