/*Scrieți o aplicație ce verifică dacă 3 puncte aleatoare formează un triunghi obtuzunghic. 
 * Dacă nu este îndeplinită condiția, se aruncă o excepție specifică: TriunghiAscutitunghic, TriunghiDreptunghic.
 *  Dacă cele 3 puncte se află pe aceeași dreaptă sau dacă segmentele pe care le determină nu pot forma un triunghi, se aruncă o excepție 
 *  TriunghiImposibil, iar în blocul catch aferent, se afișează un mesaj corespunzător și se aruncă o excepție de tip RuntimeException
 * */
 

class Punct{
	
	private int a;
	private int b;

	
	Punct(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		
	}
	Punct()
	{
		
		
		
	}
	
	public void Set_Punct(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	public int GetA()
	{
		return a;
	}
	
	public int GetB()
	{
		return b;
	}
	
	public void Print_Punct()
	{
		System.out.println("Coordonata a: " +a);
		System.out.println("Coordonata b: " +b);
	
	}
	public float getAngle(Punct p1, Punct p2) {
		float difX = p2.a - p1.a;
		float difY = p2.b - p1.b;
		float angle = (float) Math.toDegrees(Math.atan2(difX,-difY));
		
//	    if(angle < 0){
//	        angle += 360;
//	    }

	    return angle;
	}
	
}


 class TriunghiAscutit extends Exception{

	TriunghiAscutit(String msj) {
		super("msj");
	}
		TriunghiAscutit() {
			super();
		// TODO Auto-generated constructor stub
	}

 }
 
 class TriunghiDrept extends Exception{
	 
	 TriunghiDrept(String msj) {
		 super("msj");
	 }
	 TriunghiDrept() {
		 super();
		 // TODO Auto-generated constructor stub
	 }
	 
 }
		
 class Triunghi{
	 
	 Triunghi(){
		 
	 }
	 
	public void Verif(float unghi1, float unghi2, float unghi3) throws TriunghiAscutit, TriunghiDrept{
		
		if(unghi1 >90  || unghi2 >90 || unghi3 >90)
		{
			System.out.println("Acesta este un triunghi Obtuz unghic!") ;
		}
		
		if(unghi1 <90 && unghi2 <90 && unghi3 <90)
		{
			throw new TriunghiAscutit("Acesta este un triunghi ascutit");
		}
		
		if(unghi1 ==90 || unghi2 ==90 || unghi3 == 90)
		{
			throw new TriunghiDrept("Acesta este un triunghi drept");
		}
		
		//Inca nu face chiar ce trebuie
		
	}
 }
	class ex5{
		public static void main(String... args)
		{
			Punct ob1 = new Punct(200, 300);
			Punct ob2 = new Punct(300, 200);
			Punct ob3 = new Punct(3, 1);
			
			Triunghi tr = new Triunghi();
			
			ob1.Set_Punct(200, 300);
			ob2.Set_Punct(300, 200);
			ob3.Set_Punct(100, 300);
				float a=ob1.getAngle(ob1 ,ob2);
				float b=ob2.getAngle(ob2 ,ob3);
				float c=ob3.getAngle(ob3 ,ob1);
				
				System.out.println("a b c: " +a +" " +b + " "+c);
	
				try {
						tr.Verif(a, b, c);
				}
				catch (TriunghiAscutit e) {
					System.out.println("Exceptie prinsa.");
					System.out.println(e.getMessage());
				} catch (TriunghiDrept e)
				{
					System.out.println("Exceptie prinsa.");
					System.out.println(e.getMessage());
					
				}
		
			
			
			
		}
	}
	
