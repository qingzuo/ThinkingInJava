package concurrency.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Problem2_3_2 {
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			exec.execute(new Fibonacci(i));
		}
		exec.shutdown();
	}

}