package Encapsulation;
public class Div {
	public static void main(String args[]) {
		System.out.println("Divided by 5:  ");		
		for (int i=1; i<200; i++) {
			if (i%5==0) 
			System.out.println(i +" ");			
		}					
		System.out.println("Divided by 7: ");
		for (int i=1; i<200; i++) {
			if (i%7==0) 
				System.out.println(i +" ");			
		}		
		System.out.println("Divided by 5 & 7: ");			
		for (int i=1; i<200; i++) {
			if (i%5==0 && i%7==0)
				System.out.println(i +" ");			
		}}}
