package java8_practice;

import java.util.concurrent.TimeUnit;
public class LoopTask implements Runnable {

	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		System.out.println("#### <TASK-" + id + "> Starting ####");

		
		for (int i=10; i>0; i--) {
			System.out.println("<TASK-" + id + ">Tick Tick" + i);
			try{
				TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("#### <TASK-" + id + "> DONE ####");

	}
	public LoopTask() {
		this.id = ++count;
	}
}
