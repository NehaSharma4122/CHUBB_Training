package Work;

public class CountingIncrementor extends Thread{
	ProcessCounter obj; 
	//This object is a Shared object between incrementor and decrementor
	CountingIncrementor(ProcessCounter obj){
		this.obj = obj;
	}

	public void run() {
		for(int i=0;i<200;i++) {
			try {
				obj.increment();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Value of Incrementor:"+obj.getValue());
		}
	}

}

