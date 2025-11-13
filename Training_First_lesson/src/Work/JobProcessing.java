package Work;

import Learning_Java.FileReadOperations;

public class JobProcessing {
	public static void main(String[] args) {
		FileReadOperations fobj = new FileReadOperations();
		
		WorkerThread w1 = new WorkerThread(fobj);
		
		Thread t2 = new Thread(w1);
		t2.start();
		
		JobThread t1 = new JobThread(fobj);
		t1.start();
		System.out.println("thread details:"+t1.getId());
		System.out.println("thread details:"+t1.getName());
		System.out.println("thread details:"+t1.getPriority());
		System.out.println("thread details:"+t1.getState());
	}
}
