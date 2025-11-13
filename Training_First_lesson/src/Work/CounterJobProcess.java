package Work;

public class CounterJobProcess{
	public static void main(String[] args) {
		ProcessCounter cntobj = new ProcessCounter();
		CountingIncrementor incobj = new CountingIncrementor(cntobj);
		CountingWorker dobj = new CountingWorker(cntobj);
		incobj.start();
		dobj.start();
		System.out.println("Value of Counter: "+cntobj.getValue());
		System.out.println("Value of Counter: "+cntobj.getatomiccountervalue());
	}
}
