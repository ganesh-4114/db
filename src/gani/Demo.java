package gani;

class Customer {
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw..");
		if (this.amount < amount) {
			System.out.println("Less balance, please deposit and then withdraw");
			try {wait();} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.amount -= amount;
		System.out.println("Succesfully Withdrawn " + amount);
		
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Depositing Amount");
		this.amount += amount;
		System.out.println(amount + " Successfully Deposited");
		notify();
	}
	
}


public class Demo extends Thread{
	public static void main(String args[]) {
		final Customer c= new Customer();
		new Thread() {
			public void run() {
				c.withdraw(9000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(4999);
			}
		}.start();	
		new Thread() {
			public void run() {
				c.withdraw(9000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(999);
			}
		}.start();
		
	}
	
}
