//clasa de baza
class Camion{
	protected String sigla;
	protected String nume;

//constructor fara parametri
	public Camion(){
		this.nume = "fara nume";
		this.sigla = "camion";
	}
//constructor parametrizat
	public Camion(String nume){
		this.nume = nume;
		sigla = new String("camion");
	}

	public String returneazaInfo(){
		return "ma numesc "+nume+" si sunt un "+sigla;
	}

	public void metodaSpecificaCamion(){
		System.out.println("CAMION!!!");
	}	
}

//clasa derivata
class Volvo extends Camion{
	//variabilele se mostenesc, nu mai trebuie re-declarate
	//String sigla; 
	//String nume;
//constructor parametrizat
	public Volvo(String nume){
		this.nume = nume;
		sigla = new String("Volvo");
	}

	//suprascrierea metodei originale
	public String returneazaInfo(){
		return "numele meu este "+nume+" si sunt un "+sigla;
	}

	public void metodaSpecificaVolvo(){
		System.out.println("VOLVO!!!");
	}
}
class Test{
	public static void main(String a[]){
		Camion c1 = new Camion("c1");
		System.out.println(c1.returneazaInfo());
		c1.metodaSpecificaCamion();
		
		Volvo v1 = new Volvo("v1");
		System.out.println(v1.returneazaInfo());
		v1.metodaSpecificaVolvo();

		Volvo v2 = new Volvo("v2");

		Camion c2 = v2; //upcasting
		System.out.println(c2.returneazaInfo());
		c2.metodaSpecificaCamion();
		//c2 nu are acces la metodaSpecificaVolvo
		//c2.metodaSpecificaVolvo();

		Volvo v3 = (Volvo)(c2);	//downcasting
		System.out.println(v3.returneazaInfo());
		v3.metodaSpecificaVolvo();
		v3.metodaSpecificaCamion();

		Camion c3 = new Camion();
		Volvo v4 = (Volvo)c3; //genereza erori la rulare
		v4.metodaSpecificaVolvo();
		v4.metodaSpecificaCamion();
	}
}
