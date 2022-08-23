package Operator;
import java.util.Scanner;
public class Greatest {

	public static void main(String []args) {
		 int x, y, z;
	        Scanner ps = new Scanner(System.in);
	        System.out.print("Enter the first number:");
	        x = ps.nextInt();
	        System.out.print("Enter the second number:");
	        y = ps.nextInt();
	        System.out.print("Enter the third number:");
	        z = ps.nextInt();
	        if(x > y && x > z)
	        {
	            System.out.println("Greatest number is:"+x);
	        }
	        else if(y > z)
	        {
	            System.out.println("Greatest number is:"+y);
	        }
	        else
	        {
	            System.out.println("Greatest number is:"+z);
	        }
	 
	    }
	
	}


