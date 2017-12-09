/*Creați o clasă generică denumită BibliotecaVirtuala a cărei singur atribut este numărTotalIntrari, 
 * iar ca metode permite setarea și returnarea unei intrări. Tipurile de intrări din bibliotecă pot fi Carte,
 *  Articol, ResursăMedia, Revistă și Manual. Implementați clasele aferente acestor tipuri de date.
În metoda main() creați o variabilă de tip SortedSet<BibliotecaVirtuala> care să rețină toate intrările din 
bibliotecă. Utilizați metodele de adăugare, adăugare multiplă, returnare a unei intrări și verificarea existenței 
unei intrări în bibliotecă.
*/
public class BibliotecaVirtuala<T> {

	protected T numarTotalIntrari;
	protected T intr;  //pai nu sunt si intrarile atribute???
	
	public void SetInt(T intrare)
	{
		
			intr=intrare;
		
		
	}
	
	public T GetInt()
	{
		
			return intr;
	}
}

//Carte,Articol, ResursăMedia, Revistă și Manual.

class Carte<T> extends BibliotecaVirtuala<T>{
	
	Carte(){
		
	}
}
class ex5{
	public static void main(String[] args) {
		SortedSet<BibliotecaVirtuala>

	}

}