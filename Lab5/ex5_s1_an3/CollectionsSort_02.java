import java.util.*;
import java.lang.Comparable;
/*
interface Comparator<T> {
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
		return temp.firstName.equals(firstName) && temp.lastName.equals(lastName);
	}

	public int hashCode() {
        	return firstName.hashCode() + lastName.hashCode();
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	//metoda preluata din interfata Comparable
	public int compareTo(Name n) {
		int lastCmp = lastName.compareTo(n.getLastName());
		return lastCmp;
	}

	public static Comparator<Name> FirstNameComparator = new Comparator<Name>() {
		public int compare(Name name1, Name name2) {
			int firstCmp = name1.getFirstName().compareTo(name2.getFirstName());
			return firstCmp;
		}

	};

}

class Test {
	public static void main(String... args) {
		Name bandsArray[] = {
			new Name("Foo", "Fighters"),
			new Name("Nir", "Vana"),
			new Name("Met", "Allica"),
			new Name("AC", "DC")
		};
		
		Arrays.sort(bandsArray);
		List<Name> sortedLastNames = Arrays.asList(bandsArray);   //converteste tablou in lista
		System.out.println("Sorted after last name: "+sortedLastNames);

		Arrays.sort(bandsArray, Name.FirstNameComparator);
		List<Name> sortedFirstNames = Arrays.asList(bandsArray);
		System.out.println("Sorted after first name: "+sortedFirstNames);
	}
}