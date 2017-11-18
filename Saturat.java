package lab6ex4;

import java.awt.Color;
import java.util.Random;

/*Scrieți o aplicație Java ce implementează o excepție numită Saturat. Această excepție este generată atunci când saturația unei culori este 
 * peste valoarea 200. Creați o metodă ce generează aleator culori în spațiul RGB și face conversia acestora la spațiul HSB/HSV.
 *  (https://www.cs.rit.edu/~ncs/color/t_convert.html) . Dacă după conversie, saturația culorii depășește valoarea 200, regenerați culoarea. 
 *  După 10 regenerări consecutive, dacă nu se obține o culoare nesaturată, se aruncă o excepție.
 * 
 */


public class Saturat extends Exception {

	Saturat(String msg){
		super(msg);
	}
	Saturat(){
		super();
	}
	
	public void afis(int r, int g, int b)
	{
		System.out.println("R G B: " +r +" "+g +" "+b);
	}
	public void  Generate_Color() throws Saturat{
		
		Random rand = new Random();
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		int max_loc;
		int min_loc;
		
//		r=166;
//		g = 166;
//		b=173;
		
		float[] hsv = new float[3];
		Color.RGBtoHSB(r,g,b,hsv);	
		
		System.out.println("R G B: " +r +" "+g +" "+b);
		System.out.println("H S V: " +hsv[0] +" "+hsv[1] +" "+hsv[2]);
		
		//Scala folosite de paint in Windows e diferita
		//Acolo face o reprezentare 0..240
		
		//The Color dialog box just uses a different scale from what you're normally used to. For example, 
		//240 on that dialog box means 100 on your usual scale, and 120 means 50.
		//
		
		
		
		int S = Math.round(hsv[1]*240);		//Rotunjeste numarul
		
		System.out.println("S[Paint] : " +S);
		if(r > g)
		{
			max_loc =r;
			min_loc = g;
			
		}
		else
		{
			max_loc = g;
			min_loc = r;
		}
		
		
		int i = 0;
		while(S > 200)
		{
			r = rand.nextInt(255);
			g = rand.nextInt(255);
			b = rand.nextInt(255);
		
			
			System.out.println("R G B: " +r +" "+g +" "+b);
			
			Color.RGBtoHSB(r,g,b,hsv);
			 S = Math.round(hsv[1]*240);
			System.out.println("H S V: " +hsv[0] +" "+hsv[1] +" "+hsv[2]);
			System.out.println("S[Paint] : " +S);
			i++;
			
			if(i ==10)
			{
				throw new Saturat("10 Generari consecutive cu culoare saturata!");
			}
		
		}
		
	}
}

class ex4{
	
public static void main(String... args){
	
	Saturat ob = new Saturat();
	
	try {
		ob.Generate_Color();
	} 
	catch (Exception e) {
		System.out.println("Exceptie prinsa.");
		System.out.println(e.getMessage());
	}
	
}

}

