

class Point{
	public int x,y;
	
	public Point()
	{
		this(0,0);
	}
	
	public Point(int x,int y)
	{
		this.x=x;this.y=y;
	}
	
	public String toString()
	{
		return("("+x+","+y+")");
	}
}
	
class Cerc extends Point{
	public Point centru;
	public int raza;
	
	Cerc(int x,int y,int r)
	{
		centru=new Point (x,y);
		raza=r;
		System.out .println ("Cerc de centru "+centru+" si raza= "+r);
	}
	
	
	Cerc()
	{
		this(0,0,10);
	}
	
	public String toString()
	{
		return("Cerc de centru "+centru+" si raza= "+raza);
	}
}
	
class Linie extends Point {
	public Point p1,p2;
	
	Linie()
	{
		this(0,0,0,0);
	}
	
	Linie(int x1,int y1,int x2,int y2)
	{
		this(new Point (x1,y1),new Point (x2,y2));
	}
	
	Linie(Point p1,Point p2)
	{
		this.p1=p1;this.p2 =p2;
		System.out .println ("Linie de la "+p1+" la "+p2);
	}
	
	public String toString()
	{
		return("Linie: "+p1+"-"+p2);
	}
}

class Triunghi extends Linie {
	public Linie l1,l2,l3;
	
	Triunghi()
	{
	this(0,0,0,0,0,0);
	}
	
	Triunghi(int xl1,int yl1,int xl2,int yl2,int x22,int y22)
	{
	this(new Linie(xl1,yl1,xl2,yl2),new Linie(xl2,yl2,x22,y22),new Linie(x22,y22,xl1,yl1));
	System.out.println("Linie de la ("+p1.x+","+p1.y+") la ("+p2.x+","+p2.y+")");
	}
	
	Triunghi(Point p1,Point p2,Point p3)
	{
		this(new Linie(p1,p2),new Linie(p2,p3),new Linie(p3,p1));
	}
	
	Triunghi(Linie l1,Linie l2,Linie l3)
	{
	this.l1=l1;this.l2=l2;this.l3=l3;
	System.out.println("Triunghi");
	}
	
	public String toString()
	{
		return("Triunghi cu  :\n\t"+l1+"\n\t"+l2+"\n\t"+l3);
	}
}
	
	
class Test{
	
	public static void main (String[] args){
		Point p1,p2,p3;
		Cerc c1,c2;
		Linie l1,l2,l3;
		Triunghi t1,t2,t3,t4;
		
		p1=new Point (1,2);
		p2=new Point (1,12);
		p3=new Point (1,20);
		
		c1=new Cerc ();
		c2=new Cerc (1,2,3);
		
		l1=new Linie();
		l2=new Linie(1,2,1,15);
		l3=new Linie(p1,p2);
		
		t1=new Triunghi();
		t2=new Triunghi(1,1,1,10,5,7);
		t3=new Triunghi(p1,p2,p3);
		t4=new Triunghi(l1,l2,l3);
		
		
		System.out .println ("\nFigura contine urmatoarele elemente:\n");
		System.out .println(c1);
		System.out .println(c2);
		
		System.out .println(l1);
		System.out .println(l2);
		System.out .println(l3);
		
		System.out .println(t1);
		System.out .println(t2);
		System.out .println(t3);
		System.out .println(t4);
	}
}
