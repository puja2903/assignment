package com.cognizant.shapes;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle:");
		int length=ps.nextInt();
		System.out.println("Enter the breadth of the Rectangle:");
		int breadth=ps.nextInt();
		Areacalculator(length , breadth);
	}
private static void Areacalculator(int length, int breadth) {
	int Areacalculator=length * breadth;
	System.out.println("Length of rectangle: "+ length);
	System.out.println("Breadth of rectangle: "+ breadth);
	System.out.println("area of the rectangle:"+Areacalculator);
}}
