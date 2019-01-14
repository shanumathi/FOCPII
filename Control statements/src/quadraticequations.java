import java.util.Scanner;
public class quadraticequations{
  
  public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Input x: ");
            double x = input.nextDouble();
            System.out.print("Input y: ");
            double y = input.nextDouble();
            System.out.print("Input z: ");
            double z = input.nextDouble();

            double result = y * y - 4.0 * x * z;

            if (result > 0.0) {
                double r1 = (-y + Math.pow(result, 0.5)) / (2.0 * x);
                double r2 = (-y - Math.pow(result, 0.5)) / (2.0 * x);
                System.out.println("The roots are " + r1 + " and " + r2);
                 } else if (result == 0.0) {
                double r1 = -y / (2.0 * x);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }
    }
}