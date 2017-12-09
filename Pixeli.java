/*
Definiti un pachet Java numit imageProcessor care contine o clasa numita MyImage. Clasa contine toate metodele necesare initializarii si
 modificarii valorilor dintr-o matrice de pixeli de dimensiune m x n. Fiecare pixel este o instanta a
unei alte clase numita Pixel (inclusa de asemenea in pachet) care contine 3 variabile intregi R, G si B care pot avea valori intre 0 si 255.
Clasa MyImage mai contine metode pentru:
- eliminarea pixelilor care au componentele RGB sub anumite valori primite ca parametri
- eliminarea componentelor R G sau B din toti pixelii
- transformarea valorilor pixelilor in tonuri de gri prin aplicarea formulei 0.21 R + 0.71 G + 0.07 B. Noile componente R G si B vor fi
 egale cu noua valoare calculata
Nota: fiecare operatiune este cronometrata.
Importati pachetul intr-o aplicatie Java care instantiaza clasa MyImage. Programul aloca valori aleatoare componentelor culorilor pixelilor. 
Aplicati metodele din clasa asupra obiectului creat. Afisati rezultatele si timpii de transformare.
===============================================================
 */

package imageProcessor;

 class MyImage {
	 
	 public static char[][] GenerateEmptyScreen(int m, int n, Pixel p)
		{
			char game[][] = new char[m][n];
			for (int i = 0; i <m;i++)
			{
				for (int j = 0; j <n;j++)
				{
					p.B=0;
					p.G=0;
					p.R=0;
				}
			}	
				return game;
		}
	 
	 public static char[][] EditScreen(int m, int n, Pixel p)
		{
			char game[][] = new char[m][n];
			for (int i = 0; i <m;i++)
			{
				for (int j = 0; j <n;j++)
				{
					SetPixel(p.B)
				}
			}	
				return game;
		}
	 
	 
	 
private static void SetPixel(int b) {
		// TODO Auto-generated method stub
		
	}



class Pixel{
		 
		public int R;
		public int G;
		public int B;
		
		Pixel(int r, int g, int b)
		{
			R=r;
			G=g;
			B=b;
		}
		
		public void SetPixel(int R,int G, int B)
		 {
			 this.R = R;
			 this.G= G;
			 this.B = B;
		 }
	 }


public void EliminateP(Pixel ob, int r, int g, int b){
	
	if(ob.R<r)
		ob.R = 0;
	if(ob.G<g)
		ob.G = 0;
	if(ob.B<b)
		ob.B = 0;
		
	
}

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
