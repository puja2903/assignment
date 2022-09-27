/*1. Java Program to find average of an int Array.*/

package Array;
 import java. util.Scanner;
public class ClassAssi1 {

	public static void main(String[] args) {
		int sum = 0;double average;
		int a[]=new int[6];
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter the elements: ");
for(int i=0;i<6;i++) 
{
	a[i]=ps.nextInt();
}
for(int i=0;i<6;i++) 
{
	sum=a[i]+sum;
	
}	
average=sum/6.0;
System.out.println("Addition: "+sum);
System.out.println("Result: "+average);
	}

}
