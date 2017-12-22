import java.util.*;
	
interface Int1<T>{
	public void printType(T var);
}

class C1<T> implements Int1<T>{
	public void printType(T var){
		System.out.println("Tipul variabilei curente: "+var.getClass());
	}
}

public class Generics_01{
	public static void main(String[] args) {
		//C1 ob1 = new C1(); //compiler warnings
		C1<String> ob1 = new C1<String>();
		String x = "xxx";
		ob1.printType(x);

		C1<Integer> ob2 = new C1<Integer>();
		Integer y = new Integer(7);
		ob2.printType(y);		
	}
}