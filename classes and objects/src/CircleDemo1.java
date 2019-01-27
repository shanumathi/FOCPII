class Circle
{
 private int r=2;
 public double findarea()
 	{ 
 	double A;
 	A=Math.PI*r*r;
 	return A;
	}
 void displayArea(double A)
	{
 	System.out.println("Area is" +A);
 	}
}

class CircleDemo1
{
public static void main(String[] args)
 	{
	Circle c1 = new Circle();
	c1.displayArea(c1.findarea());
	}
}