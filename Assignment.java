
/*You will be given two integers x and y as input, you have to compute x/y. If x and y are 
not 32 bit signed integers or if y is zero, exception will occur and you have to report it. 
Read sample Input/Output to know what to report in case of exceptions.*/
package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

	public class Assignment {
	
		public static void main(String[] args) {
		      
	        try {
	        	Scanner in = new Scanner(System.in);
	        	System.out.println("Give the 1st input:");
	            
	            int x = in .nextInt();
	            int y = in .nextInt();
	            System.out.println(x/y);
	            
	            System.out.println("Give the 2nd input:");
	            
	            int a = in .nextInt();
	            int b = in .nextInt();
	            System.out.println(x/y);
	            
	         } catch (ArithmeticException e) {
	        	
	            System.out.println("ArithmeticException");
	        } catch (InputMismatchException e) {
	            System.out.println("InputMismatchException");
	        }}}
