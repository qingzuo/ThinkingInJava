package concurrency.test;

public class Problem2_2_2 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new Fibonacci(i)).start();
		}
	}

}

class Fibonacci implements Runnable {
	
	int n;
	
	public Fibonacci(int n) {
		this.n = n;
	}
	
	private int fib(int n) {
	    if(n < 2) return 1;
	    return fib(n-2) + fib(n-1);
	  }

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " = " +fib(n));
		}
	}
	
}
