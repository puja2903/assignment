package Assignment;

public class SyncThread {
	 
	//creating 4 synchronized type method

synchronized String method1(String s1) { 
return s1;
}
synchronized String method2(String s2) {
return s2;
}
synchronized String method3(String s3) {
return s3;
}
synchronized String method4(String s4) {
return s4;
}
synchronized String method5(String s5) {
return s5;
}}
class demo extends Thread{
	SyncThread st;  //creating reference of main class
	demo(SyncThread st){  //parameterized constructor
		this.st=st;  //this keyword refer the current object
	}
	public void run() {  //override the run method
		System.out.println(st.method1("I ")+st.method2("want ")+st.method3("to ")+st.method4("learn ")+st.method5("JAVA"));
	}
}
class out{
public static void main(String ...arg) {
	SyncThread ob=new SyncThread();  //object of the main class
	demo d=new demo(ob);  //object of the extend class
	d.start();  //calling the method
}
}
