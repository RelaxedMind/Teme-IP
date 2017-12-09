

/*Definiți o clasă Vehicul ce are ca și atribute numărul maxim de pasageri, culoarea și viteza maximă de deplasare.
 *  Extindeți clasa Vehicul în cadrul clasei VehiculMotorizat ce include atributele de poziționare geografică
 *   (coordonate GPS – creați o clasă pentru obiecte de tip localizare geografică -GeoLoc) și viteza de deplasare. 
 *   VehicululMotorizat se poate deplasa dintr-un punct A într-un punct B (punctele sunt obiecte de tip Point ce au două atribute GeoLoc) 
 *   prin intermediul metodei deplasează(Point B) și care returnează timpul necesar deplasării solicitate.
Creați o nouă clasă Avion ce extinde clasa VehiculMotorizat și care adaugă metodei deplasează(Point B) și atributul altitudine.
 Metoda va returna timpul necesar deplasării ținând cont de faptul că avionul se va deplasa pe arcul de cerc dat de punctele A, B
  și altitudinea maximă la care ajunge avionul (considerați că altitudinea e atinsă doar la jumătatea traseului de deplasare).*/


 class Vehicul {

	int passangers;
	String color;
	int vit_max;
	
	Vehicul(int passangers, String color, int vit_max)
	{
		this.passangers= passangers;
		this.color=color;
		this.vit_max = vit_max;
		
		System.out.println("Constructor clasa de baza!");
	}
	
	
	
	public void SetPassageri(int pass){
		this.passangers = pass;
		
	}
	
	public void SetColor(String color){
		this.color = color;
		
	}
	
	public void SetVitMax(int viteza){
		this.vit_max = viteza;
		
	}
	
	public int GetPassageri(){
		return passangers;
		
	}
	
	public String GetColor(){
		return color;
		
	}
	
	public int GetVitMax(){
		return vit_max;
		
	}
	
}
// Extindeți clasa Vehicul în cadrul clasei VehiculMotorizat ce include atributele de poziționare geografică
// *   (coordonate GPS – creați o clasă pentru obiecte de tip localizare geografică -GeoLoc) și viteza de 
 //deplasare. 
// *   VehicululMotorizat se poate deplasa dintr-un punct A într-un punct B (punctele sunt obiecte de tip Point ce au două atribute GeoLoc) 
// *   prin intermediul metodei deplasează(Point B) și care returnează timpul necesar deplasării solicitate.
 
 class VehiculMotorizat extends Vehicul{
	 int vit; 
	 VehiculMotorizat(int passangers, String color, int vit_max) {
		super(passangers, color, vit_max);
		System.out.println("Constructor clasa derivata !");
		// TODO Auto-generated constructor stub
	}
	 
	 	VehiculMotorizat() {
			super(0,"none",0);
			// TODO Auto-generated constructor stub
		}
	 
 }
	
		class GeoLoc{
	
	double GPS_X;
	double GPS_Y;

		GeoLoc(double x, double y)
		{
			GPS_X =x;
			GPS_Y =y;
			
			
		}
		
		GeoLoc()
		{
			
		}
		
		public void SetGeo(double x, double y)
		{
			GPS_X = x;
			GPS_Y = y;
		}
		
		public double GetGeoX()
		{
			return GPS_X;
		}
		
		public double GetGeoY()
		{
			return GPS_Y;
		}
		
	}
	
	
//		 VehicululMotorizat se poate deplasa dintr-un punct A într-un punct B (punctele sunt obiecte de tip Point ce au două atribute GeoLoc) 
//		 *   prin intermediul metodei deplasează(Point B) și care returnează timpul necesar deplasării solicitate.
		
	class Point extends GeoLoc{
		
		public GeoLoc X, Y;
		
		public Point(GeoLoc x , GeoLoc y)
		{
			X=x;
			Y=y;
		}

		
		public double move (GeoLoc y) {
			
			double d;
			
			d = Math.sqrt(Math.exp(y.GPS_X-X.GPS_X)+(y.GPS_Y-X.GPS_Y));
			
			return d;
			
		}
		
		

//		public void Points(GeoLoc x, GeoLoc y)
//		{
//			GPS_cord(x, y);
//		}

	
 }





class Launch{
	public static void main(String[] args) {
	Vehicul vehicul  = new Vehicul(11, "galben", 15);
	
	VehiculMotorizat vm = new VehiculMotorizat(12, "rosu", 20);
	GeoLoc geox = new GeoLoc(2, 4);
	GeoLoc geoy = new GeoLoc(1, 3);
	System.out.println("geox: " +geox.GetGeoX());
	System.out.println("geoy: " +geox.GetGeoY());
	System.out.println("geox: " +geoy.GetGeoX());
	System.out.println("geoy: " +geoy.GetGeoY());
	Point point = new Point(geox, geoy);
	System.out.println("Test:" + point.move(geoy));
	
	//test.GPS_X =1;
	
	//VehiculMotorizat.GeoLoc geo = new VehiculMotorizat.GeoLoc(12, 13);
	//VehiculMotorizat.Point point = new VehiculMotorizat.Point(geo);
	
	
	
		}
}
