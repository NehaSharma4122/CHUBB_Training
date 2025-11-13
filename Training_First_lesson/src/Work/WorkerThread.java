package Work;

import Learning_Java.FileHandling;
import Learning_Java.FileReadOperations;

public class WorkerThread implements Runnable{
	
	FileHandling fl = new FileHandling();
	FileReadOperations obj;
	
	WorkerThread(FileReadOperations obj1){
		this.obj = obj1;
	}
	
	@Override
	public void run() {
		fl();
		System.out.println("Hi this is inside run");
	}
}
