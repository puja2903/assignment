/*2. Write a Java program to create a new array list,
 add some colors (string) and print out the collection.*/
package Array;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size=ps.nextInt();
		String a[]=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter  " + (i+1) +" color: ");
		a[i]=ps.next();
		}
		System.out.println("your colors list is: ");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+ " , ");
		}
    }
}