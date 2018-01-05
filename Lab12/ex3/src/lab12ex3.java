import java.util.Scanner;

/*Scrieți o aplicație Java ce calculează cel mai mare divizor comun a două numere mari (>100.000). 
 * Aplicația va citi de la
tastatură în mod continuu perechi de câte două numere și va lansa în execuție câte un thread pentru 
fiecare pereche
citită. Rezultatele vor fi afișate în consolă în momentul finalizării metodei de calcul a cmmmdc.
*/


class MyThread extends Thread{
	
	int x;
	int y;
	
	public void run(){
		
			cmmdc(x,y);
			
}
		
	public int cmmdc(int x, int y)
	{
	boolean gasit = false;
	int z =y;
	if(x >=y)
	{
		if(x%y ==0)
		{
			System.out.println("CMMDC: " +y);
			return y;
		}
		while(!gasit)
		{
			if(x%y !=0)
		{
			z = z-1;
			if(x%z ==0 && y%z ==0)
			{
				System.out.println("CMMDC: " +z);
				return z;
			}
		}	
			
		}
	}
	
	else{
		
		if(y%x ==0)
		{
			System.out.println("CMMDC: " +x);
			return x;
		}
		while(!gasit)
		{
			if(y%x !=0)
		{
			z = z-1;
			if(y%z ==0 && x%z ==0)
			{
				System.out.println("CMMDC: " +z);
				return z;
				
			}	
		}
		}
		
	}
	return y;
	
	}
	
	
	public void Store(int x, int y){
		this.x = x;
		this.y = y;
	}
	
//	public int cmmdc(int x, int y)
//	{	boolean gasit = false;
//		int z =y;
//		if(x >=y)
//		{
//			if(x%y ==0)
//				return y;
//			while(!gasit)
//			{
//				if(x%y !=0)
//			{
//				z = z-1;
//				if(x%z ==0 && y%z ==0)
//					return z;
//			}	
//				
//			}
//		}
//		
//		else{
//			
//			if(y%x ==0)
//				return x;
//			while(!gasit)
//			{
//				if(y%x !=0)
//			{
//				z = z-1;
//				if(y%z ==0 && x%z ==0)
//					return z;
//			}	
//				
//			}
//			
//		}
//		
//		return y;
//		
//	}
	
}


public class lab12ex3 {
	public static void main(String[] args) {
	
		MyThread trd[] = new MyThread[9999999];
		int x = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
	
		while(true){
			for(int i = 0; i<9999999;i++)
		{
			trd[i] = new MyThread();
		System.out.println("Introduceti 2 nr > 100.000");
		x=scan.nextInt();
		y = scan.nextInt();
		
		trd[i].Store(x, y);	
		trd[i].start();
	
			}
		}
		
	}
}
