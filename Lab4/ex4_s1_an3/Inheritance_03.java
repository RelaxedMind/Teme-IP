//prima interfata de baza
	interface Int1{
		public void m1();
	}

	//a 2-a interfata de baza
	interface Int2{
		public void m2();
	}

	//interfata derivata din primele doua
	interface Int3 extends Int1, Int2{
		public void m3();
	}

	//o clasa care foloseste interfata derivata
	class MyClass implements Int3{
		public void m1(){
			System.out.println("metoda 1");
		}
		public void m2(){
			System.out.println("metoda 2");
		}
		public void m3(){
			System.out.println("metoda 3");
		}	
	}

	class Test{
		public static void main(String[] args){
			MyClass ob1 = new MyClass();
			ob1.m1();
			ob1.m2();
			ob1.m3();
		}
	}
