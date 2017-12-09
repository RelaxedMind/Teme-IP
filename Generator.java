/*
 * Creați o interfață denumită Generator<T> cu singura metodă next(T var). 
 * Implementați interfața pentru a permite
generarea valorilor următoare în cazul aplicării asupra unor variabile de tipuri de date concrete 
(Integer, Character, etc.).
Instanțierea clasei se va face în cadrul metodei main() care va fi poziționată într-o clasă distinctă.
 */
public interface Generator<T> {
	
	public <T> T next(T var);

}

//class C1<T> implements Generator<T>{
//
//	@Override
//	public <T> T next(T var) {
//		
//		if(var instanceof Integer)
//		{
//			(Integer)var= (Integer)var + 1;
//		}
//		return var;
//			
//		
//	}
	
	
class C1<T> implements Generator<T>{
	
		public	<T> T next(T var) {
			
	    if (var.getClass() == Integer.class) {
	        // With auto-boxing / unboxing
	       var =(T) (Integer) ((Integer) var  + 1);
	    }
	    
	    if (var.getClass() == String.class) {
	        // With auto-boxing / unboxing
	       var =(T) (String) ((String) var  + 1);
	    }
	    
	    if (var.getClass() == Character.class) {
	        // With auto-boxing / unboxing
	    	char c = ((Character) var).charValue();
	    	c++;
	    	 var =(T) (new Character(c));
	    }
	    
	    return var;
}
}
	class Test{
		public static void main(String[] args) {
	
			C1<Integer> ob1 = new C1<Integer>();
			C1<String> ob2 = new C1<String>();
			C1<Character> ob3 = new C1<Character>();
			
			String string = new String("ab");
			Integer y = new Integer(7);
			Character c = new Character('a');
			
		System.out.println("Int: " +	ob1.next(y));
		System.out.println("Char: " +	ob3.next(c));
		System.out.println("String: " +	ob2.next(string));
		
		}
	}
	
