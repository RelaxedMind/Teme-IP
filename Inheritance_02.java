interface Int1{
	void metoda1(); //prototip de metoda
}

interface Int2{
	void metoda2(); //prototip de metoda
}

class Class1 implements Int1, Int2{
	//trebuie implementate metodele primite din ambele interfete
	public void metoda1(){
		System.out.println("implementarea metodei 1");
	}
	public void metoda2(){
		System.out.println("implementarea metodei 2");
	}	
}

class Test{
	public static void main(String a[]){
		Class1 ob1 = new Class1();
		ob1.metoda1();
		ob1.metoda2();
	}
}
