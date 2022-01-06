package gani;



public class MyThread extends Thread{
	long start = System.currentTimeMillis();
	public void run() {
		
		for (int i = 2;i<=5; i++) {
			for (int j = 1; j<=10; j++) {
				System.out.println(i + "*" + j + " = " + (i*j) + "\n");
			}
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}
	
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();

	}
}
