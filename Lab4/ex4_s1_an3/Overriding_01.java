//clasa de baza
class Bicicleta{
	public void metoda(){
		System.out.println("mesaj din clasa de baza");
	}		
}

//clasa derivata
class BicicletaDeTeren extends Bicicleta{
	//suprascrierea metodei din clasa de baza
	public void metoda(){
		System.out.println("mesaj din clasa de derivata");
	}
}
	
class Test{
	public static void main(String[] args){
		Bicicleta b0 = new Bicicleta();
		BicicletaDeTeren b1 = new BicicletaDeTeren();

		b0.metoda();
		b1.metoda();
	}
}
