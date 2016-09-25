package concurrency.test;

public class Problem2_1 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new TRunnable("message"+i)).start();
		}
	}

}

class TRunnable implements Runnable {
	
	String mes = "This is test for Runnable";

	public TRunnable(String mes) {
		super();
		this.mes = mes;
	}
	
	@Override
	public void run() {
		System.out.println(mes);
		Thread.yield();
		System.out.println(mes);
		Thread.yield();
		System.out.println(mes);
		Thread.yield();
		System.out.println("###" + Thread.currentThread().getName() + "is destroy.####");
	}
	
}
