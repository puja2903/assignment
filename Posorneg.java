package Operator;
import java.util.Scanner;
public class Posorneg {

	public static void main(String[] args) {
		Scanner ps=new Scanner(System.in);
		System.out.println("The input number is:");
		int input=ps.nextInt();
		if(input>0) {
			System.out.println("The input number is positive.");
		}
		else if(input<0) {
			System.out.println("The input number is negative.");
		}
		else {
			System.out.println("The input number is zero.");
		}
		
	}

}
