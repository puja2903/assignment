 /*3.Write a Java Program to reverse the array contents.*/

package Array;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		System.out.println("Enter the 6 numbers:");
		int arr[]=new int[6];
		Scanner ps=new Scanner(System.in);
		for(int i=0;i<6;i++) 
		{
			arr[i]=ps.nextInt();
		}
		
	        for (int i = 0; i < arr.length; i++) { 
	            System.out.println(arr[i] + " ");  
	        } 
	        
	         
	        System.out.println("Array in reverse order: ");  

	        //condition for reversing the array	         
	        for (int i = arr.length-1; i >= 0; i--) 
	        { 	     	
	            System.out.println(arr[i] + " ");  
	        }}}
