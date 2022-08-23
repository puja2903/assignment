//Q2)write a java program to solve quadratic equation.
package Operator;
import java.util.Scanner;
public class Quadraticeq {

	public static void main(String[] args) {
		 Scanner ps= new Scanner(System.in);

         System.out.print("First input number:");
         double a = ps.nextDouble();
         System.out.print("Second input number:");
            double b = ps.nextDouble();
         System.out.print("Third input number:");
         double c = ps.nextDouble();

         double result = b * b - 4 * a * c;

         if (result > 0) {
             double r1 = (-b + Math.pow(result, 0.5)) / (2 * a);
             double r2 = (-b - Math.pow(result, 0.5)) / (2 * a);
             System.out.println("The roots are " + r1 + " and " + r2);
         } else if (result == 0) {
             double r1 = -b / (2 * a);
             System.out.println("The root is " + r1);
         } else {
             System.out.println("The equation has no real roots.");
         }

 }


	}

