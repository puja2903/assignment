package Assignment;
/* 5. try to create class implementing Runnable interface and override run method to 
	   print something.then create 4 thread & start all of them to call the same run method.*/

public class A implements Runnable {  
	@Override
	public void run() {    //creating method
		
		for(int i=0;i<=5;i++) {   //for block
			System.out.println("Puja Sarkar");  //printing the name 
			}}}
 class main{   //creating another class
	public static void main(String[] args) {   //main method
		
		A obj=new A();  //creating object of the main class
		//creating 4 thread
		Thread t=new Thread(obj);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		//calling the method
		t.start();
		t1.start();
		t2.start();
		t3.start();   }}

