/*Write a thread to print the thread name with a 2 second delay with main thread.*/

package Assignment;

class Thread1 extends Thread  {
	public void run() {
		while(true){
		System.out.println("my thread is running");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}}

	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		t1.start();
	}
	}

