import java.util.*;
public class CircleTest
{  
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Scanner num = new Scanner(System.in);
		double rad = num.nextDouble();
		c1.radius= rad;
		c1.display();
		c2.display();
		}
		}
		class Circle
		{ 
			double radius;
			double area()
			{
			return radius*radius*3.14159;
			}
			double circumference()
			{
				return 2*radius*3.14159;
				}
				void display()
				{ System.out.println("Area: " + area());
				System.out.println("circumference =" + circumference());
				}
				void Circle(double radius)
				{ 
					this.radius= radius;
					}
					Circle()
					{
						this.radius= 1;
						}
						}

