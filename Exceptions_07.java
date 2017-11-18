import java.lang.Throwable;

class MyException extends Throwable{
	//constructor
	public MyException(){
		//apelul constructorului clasei de baza
		super("Sirul de caractere nu are voie sa fie abc!!!");
	}
}

class X{
	void metoda(String text) throws MyException{
		if(text.equalsIgnoreCase("abc")){
			throw new MyException();
		}
		else{
			System.out.println("Sirul de caractere "+text+" corespunde.");
		}
	}
}

class Test{
	public static void main(String args[]){
		String text_interzis = new String("abc");		
		String text_acceptat = new String("xyz");		

		X ob1 = new X();

		try{
			ob1.metoda(text_interzis);
		}
		catch(MyException ex1){
			ex1.printStackTrace();
		}

		try{
			ob1.metoda(text_acceptat);
		}
		catch(MyException ex2){
			ex2.toString();
		}
	}
}
