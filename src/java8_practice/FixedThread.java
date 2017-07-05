package java8_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread {
	public static void main(String[] args) {
		System.out.println("Main thread starts here..");
		
		
		ExecutorService execService = Executors.newFixedThreadPool(10);
		
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.shutdown();

		System.out.println("Main thread ends here");

	}

}
