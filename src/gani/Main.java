package gani;

class Single extends Thread {
	private String name;
	Single(String name) {
		System.out.println(name);
	}
	public void run() {
		for (int i=0; i<= 5; i++) {
			System.out.println("First Class");
			System.out.println("Value of i is: " + (i-1) + "\n");
		}
	}
}

class Double extends Thread {
	public void run() {
		for (int i=0; i<= 5; i++) {
			System.out.println("Second Class");
			System.out.println("Value of i is: " + (i*2) + "\n");
		}
	}
}

class Third extends Thread {
	public void run() {
		for (int i=0; i<= 5; i++) {
			System.out.println("Third Class");
			System.out.println("Value of i is: " + (i+2) + "\n");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single obj = new Single("Ganesh");
		obj.start();
		obj.stop();
		
		Double obj2 = new Double();
		obj2.start();
		obj2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(obj2.getPriority());
		Third obj3 = new Third();
		obj3.start();
		
		obj.setName("hi");
		System.out.println(obj.getName());	
		System.out.println(obj.isAlive());
		
	}

}
