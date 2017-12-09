//clasa de baza
class Baza{
	public Baza(){
		System.out.println("Constructorul fara parametri al clasei de baza");
	}
	public Baza(int x){
		System.out.println("Constructorul cu parametri al clasei de baza");
	}	
}

//clasa derivata
class Derivata extends Baza{
	public Derivata(){
		super(7); //apelul constructorului cu parametri din clasa de baza
		System.out.println("Constructorul clasei derivate");
	}
}

class Test{
	public static void main(String... args){
		Derivata ob1 = new Derivata();
	}
}
