package Learning_Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import BankingApp.Customer;

public class CustomerOps {
	public static void main(String[] args) {
		CustomerOps obj = new CustomerOps();
		obj.processSetforCustomObjects();
	}
	public void processSetforCustomObjects() {
		Customer custObj = null;
		//LinkedHashSet<Customer> custList = new LinkedHashSet<Customer>();
//		CustomerAgeComparator comp = new CustomerAgeComparator();
		HashSet<Customer> custList = new HashSet<Customer>();
		Customer c1 = new Customer("James","james@gmail.com","43432432442",4343,21);
		Customer c5 = new Customer("James","james@gmail.com","43432432442",4343,21);
		Customer c2 = new Customer("Robin","robin@gmail.com","43432432441",50000,34);
	    Customer c3 = new Customer("Joy","joy@gmail.com","43432432443",40000,23);
	    Customer c4 = new Customer("Arav","arav@gmail.com","43432432444",50000,74);

	    custList.add(c2);
	    custList.add(c1);
	    custList.add(c3);
	    custList.add(c4);
	    custList.add(c5);
	    if(c1.hashCode()!=c5.hashCode()) {
	    	System.out.println("DIff");
	    }
	    System.out.println("size:"+custList.size());
		Iterator<Customer>  itr = custList.iterator();
		while(itr.hasNext()) {
			custObj = itr.next();
			String name = custObj.getName();
			System.out.println(name);
		}
		
//		custList.forEach(namea->System.out.println(namea.getName()));
//		custList.forEach(System.out::println);
		     
	}	

}
