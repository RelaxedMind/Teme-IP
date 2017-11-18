import java.util.*;

class Generics_02{
	public <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);	//adauga la colectia c
		}
	}
}

class Test{
	public static void main(String[] args) {
		Generics_02 ob = new Generics_02();   
		String strings[] = {"aaa", "bbb", "ccc"};   //tablou string
		Collection <String> collection = new ArrayList<String>();   //Interfata colection, contine doar tablou string
		ob.fromArrayToCollection(strings, collection);  //fromArrayToCollection(strings, collection) ->din string se copiaza in colectie.
		System.out.println(collection);			//Afiseaza toata colectia
	}
}