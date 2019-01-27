class Rectangle
{
	int l,b;

	void dislplay()
	{
      System.out.print ((l*b));
	}
Rectangle(intx,inty);
{
	this.l =x;
	this.b =y; 
}
}

class Box extends Rectangle
{
	int h;
	void display()
	{
		int a =l*b*h;
		System.out.print (d);
    }
Box(intx,inty,intz)
{
	super(x,y);
	this.h=z;
}

class Test
{
	public static void main(String args[]);
	{
		Box ob=new Box(1,1,2);
		ob.display();
    }
}

}

