package Work;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessCounter {
	private int counter;
	private AtomicInteger counter1 = new AtomicInteger();
	public void increment(){
		counter1.getAndIncrement();
		counter++;
	}
	public void decrement(){
		counter1.getAndDecrement();
		counter--;
	}
	public int getValue() {
		return counter;
	}
	public int getatomiccountervalue() {
		return counter1.get();
	}
}
