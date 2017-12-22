class Camion{
	protected float cantitate_combustibil;
	public Camion(){ cantitate_combustibil = 100; }
}
class Volvo extends Camion{
	String nume_sofer; //variabila proprie 
	//variabila cantitate_combustibil se mosteneste din clasa de baza

	//constructor fara parametri
	public Volvo(){ 
		cantitate_combustibil = 0; 
		nume_sofer=new String("nimeni"); 
	}
	//constructor parametrizat
	public Volvo(String nume_sofer, float cantitate_combustibil){ 
		this.nume_sofer = nume_sofer; 
		this.cantitate_combustibil = cantitate_combustibil;
	}
	public void afiseazaCombustibil(){ 
		System.out.println("Combustibil ramas: "+cantitate_combustibil); 
	}
}
class Test{
	public static void main(String a[]){
		Volvo v = new Volvo("Ion", 108);
		v.afiseazaCombustibil();
	}
}
