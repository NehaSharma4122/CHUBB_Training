package Learning_Java;
import java.util.*;

import BankingApp.Customer;
public class CollectionOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionOperations obj = new CollectionOperations();
		obj.processList();
	}
	public void processList() {
		String name = "";
		ArrayList<String> names = new ArrayList<String>();
		names.add("James");
		names.add("John");
		names.add("Java");
		names.remove(0);
		names.add("Arun");
		boolean isname = names.contains("Rohit");
		int ind = names.indexOf("Rohit");
		System.out.println("Is name there "+isname+" index "+ind);
		Iterator<String> itr = names.iterator();
		if(itr.hasNext()) {
//			name = itr.next();
			System.out.println(name);
			name = itr.next();
		}
		names.forEach(namea->System.out.println(namea));
		names.forEach(System.out::println);
		
		Customer custObj = null;
		LinkedHashSet<Customer> cusList = new LinkedHashSet<Customer>();
		Customer c1 = new Customer("James","jane@gmail.com","353384534",20000,43);
		Customer c2 = new Customer("Jane","jane@gmail.com","355484534",10000,45);	
		cusList.add(c1);
		cusList.add(c2);
	}
	
	public void addCustomers() {
		List<Customer> custList = new ArrayList<Customer>();
		
		 for(int i=0;;i++) {
			   Customer c6 = new Customer("Trump", "Trump@gmail.com", "43432432446", 30000,i+10);
			   custList.add(c6);
			   try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	}
}
