package lab7ex2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

/*Scrieți un appletcation care dacă este rulat ca și aplicație va prelua de la tastatură un mesaj și-l va 
 * afișa în consolă, iar dacă este rulat ca și applet va desena un cerc de culoare roșie tangent la
 *  dimensiunea cea mai mică (înălțime, lățime applet) a appletului.
 * */
public class lab7ex2 extends Applet{

	
	public void init(){
		System.out.println("init...");
	}
	
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawOval(5, 5, 200, 200);
	}

	
}

class Launchex2{
	public static void main(String...args){
		Scanner scan = new Scanner(System.in);
		String text  = new String();
		
		System.out.println("Introduceti text: ");
		text=scan.nextLine();
		
		System.out.println(text);
		
	}
}




