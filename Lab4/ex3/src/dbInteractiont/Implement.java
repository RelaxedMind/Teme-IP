package dbInteractiont;

/*Creați o aplicație ce interacționează cu acest pachet astfel:
- scrieți o clasă ce implementează interfata de autentificare și care actualizează lista de 
persoane conform cu acțiunea specificată.
- scrieți clasa care extinde clasa abstractă Verify și implementează metodele verificare a userID
 și a parolei după următoarele specificații:
* userID poate să conțină doar litere, cifre și simbolul “.”
* parola trebuie să aibă lungimea minimă de 8 caractere, cel puțin un caracter uppercase și 
* un simbol non-alfanumeric
- scrieți o clasă de test ce verifică toate funcționalitățile aplicației.
*/

class ImplementAuth implements Auth{

	
public String[] createUser(Person ob) {
		
		String[] user = new String[1];
		ob.
		
		user[0] =ob.GetNume(nume)+"-"+ob.GetPrenume(prenume)+"-"+ob.GetMail(mail);
		System.out.println(user);
		
		
		return user;
	}

	@Override
	public String[] deleteUser(Person ob) {
	
		String del[] = new String[1];
		
		del =ob.user;
		
		
		
		del[0].replace(del[0], "");
		System.out.println(user);
		
		
		return del;
	}
	
}

class Implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
