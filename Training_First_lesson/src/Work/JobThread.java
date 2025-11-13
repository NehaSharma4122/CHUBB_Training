package Work;

import Learning_Java.FileReadOperations;

public class JobThread extends Thread {
	JobThread(){
		
	}
	FileReadOperations fl;
	JobThread(FileReadOperations fl1){
		this.fl = fl1;
	}
	public JobThread(String name) {
		super(name);
	}
	public void run() {
		//WRITE ALL LOGIC HERE AS ITS VERY IMP
		System.out.println("Inside run");
		System.out.println(isAlive());
		
	}
}
