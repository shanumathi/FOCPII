import java.util.*;
import java.lang.*;
class Point
{
    private double a, b;
   
    public Point()
    {
    	a =0;
    	b =0;
    	
    }

    public Point(double a)    {
    	a =a; 
    	b =b;

    }
    public Point (double a , double b) 
    {
    	a =a1;
    	b =b1;
    }
    public void display()
    {
    	System.out.println("x="+x + "y"+ y);
    }

    public double geta()
    {
    	return a;
    }
    public double getb()
    {
    	return b;
    }
    class GetDistance
    {
    	static void Distance(Point p1 , Point p2)
    {  double dis;
    	dis = Math.sqrt(Math.pow((p1.getx()-p2.getx()),2)+ Math.pow((p1.gety()-p2.gety()),2));
    	System.out.println(dis);

    }
     public static void main(String args[])

	{
	 Scanner input =new Scanner(System.in);
	 Point p1=new Point();

    System.out.println("enter the value of a and b");
	   
       double a=input.nextdouble();
       double b=input.nextdouble();

       Point p2= new Point(a,b);

       Distance(p1,p2);
       
