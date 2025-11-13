package Work;

public class CountingWorker extends Thread{
	ProcessCounter obj;
	CountingWorker(ProcessCounter obj){
		this.obj = obj;
	}

	public void run() {
		for(int i=0;i<200;i++) {
			try {
				obj.decrement();
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Value of Decrementor:"+obj.getValue());

		}
	}
}
