import java.util.*;
// Using abstract methods and classes.
abstract class Figure
{
     double dim1;
     double dim2;
    Figure(double a, double b)
    {
       dim1 = a;
       dim2 = b;
    }
    // area is now an abstract method
     abstract double area();
}

class Rectangle extends Figure
{
    Rectangle(double a, double b) 
    {
       super(a, b);
    }
     // override area for rectangle
   double area()
    {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
class areademo
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		Double a,b;
		System.out.println("enter a: ");
		a=input.nextDouble();
		System.out.println("enter b: ");
		b=input.nextDouble();
		//System.out.println(" ");
		Rectangle ob = new Rectangle(a,b);
		System.out.println("area of rectangle:"+ob.area());

	}
}


