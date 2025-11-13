package Threads;

import java.util.concurrent.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker();
		//you need to create a start and not a run method as run only runs the current program on the same thread. 
		// if u start() then it creates a new thread to run the program
		//worker.run(); -> no new thread created
		//worker.start();
//		ExecutorService service = Executors.newFixedThreadPool(2);
		//If i dont know how any processors are available so in the system of the user, so this line will make sure it makes thread in accordance to their number of cores.
		// this allows us to keep this dynamic and flexible. .
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		service.execute(worker);
		service.execute(worker);
		service.execute(worker);
		service.shutdown();
	}

}
