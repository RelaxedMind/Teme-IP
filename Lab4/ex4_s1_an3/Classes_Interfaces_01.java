
interface ExempluInterfata{
	void set();
	void reset();
}

class ClasaA implements ExempluInterfata {
	boolean a;
	
	public void set(){
		a=true;
		System.out .println ("a=" +a);
	}
	
	public void reset(){
		a=false;
		System.out .println ("a=" +a);
	}
}

class ClasaB implements ExempluInterfata {
	int b;
	
	public void set(){
		b=1;System.out .println ("b=" +b);
	}
	
	public void reset(){
		b=0;System.out .println ("b=" +b);
	}
}
	
	
class Test{	
	public static void main (String[] args){
		Test princ=new Test ();
		ClasaA obA=new ClasaA ();
		ClasaB obB=new ClasaB ();
		princ.metoda1(obA);
		princ.metoda2(obB);
		System.out .println ("obA="+obA+"; obB="+obB);
		princ.metoda2(obA);
		princ.metoda1(obB);
		System.out .println ("obA="+obA+"; obB="+obB);
		try{synchronized(obA){obA.wait ();}}
		catch(InterruptedException e){}
		// TODO: Add initialization code here
	}
	static void metoda1(ExempluInterfata obj){
		obj.set();
	}
	static void metoda2(ExempluInterfata obj){
		obj.reset();
	}
}
