package Learning_Java;
import java.util.*;

import BankingApp.Customer;


public class ColletionOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColletionOperator obj = new ColletionOperator();
		//obj.processList();
	//	obj.processSet();
		obj.processSetforCustomObjects();
	//	obj.sortedSetProcess();
	//	obj.sortedSetProcessNum();
//		obj.processMap();
//		Collections.sort(null);
	}

	
	public void processList() {
		String name = "";
		ArrayList<String> names = new ArrayList<String>();
		names.add("James"); //0
		names.add("Rohan"); //1
		names.add("Roy");   //1
		names.add("Ajay");
		names.add("Camlin");
		names.remove(0);
		names.add("Rohit");
		Collections.sort(names);
		boolean isnamethere = names.contains("Rohit111");
		int index = names.indexOf("Rohit111");
		System.out.println(" isnamethere "+isnamethere +" index "+index);
		Iterator<String>  itr = names.iterator();
		
		while(itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}
		
		names.forEach(namea->System.out.println(namea));
		names.forEach(System.out::println);
		     
	}
	
	public void processSet() {
		String name = "";
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("James"); //0
		names.add("Rohan"); //1
		names.add("Roy");   //1
		
		names.remove(0);
		names.add("Rohit");
		boolean isnamethere = names.contains("Rohit111");
		
		System.out.println(" isnamethere "+isnamethere );
		Iterator<String>  itr = names.iterator();
		
		while(itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}
		
		     names.forEach(namea->System.out.println(namea));
		     names.forEach(System.out::println);
		     
	}	
	
	public void processSetforCustomObjects() {
		Customer custObj = null;
		//LinkedHashSet<Customer> custList = new LinkedHashSet<Customer>();
//		CustomerAgeComparator comp = new CustomerAgeComparator();
		TreeSet<Customer> custList = new TreeSet<Customer>();

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
		Iterator<Customer>  itr = custList.iterator();
		while(itr.hasNext()) {
			custObj = itr.next();
			   String name = custObj.getName();
			System.out.println(name);
		}
		
//		custList.forEach(namea->System.out.println(namea.getName()));
//		custList.forEach(System.out::println);
		     
	}	
	
	public void sortedSetProcess() {
		String name = "";
		TreeSet<String> names = new TreeSet<String>();
		names.add("Anish");
		names.add("rohan");
		names.add("yatin");
		names.add("james");
		
Iterator<String>  itr = names.iterator();
		
		while(itr.hasNext()) {
			name = itr.next();
			System.out.println(name);
		}
		
		     names.forEach(namea->System.out.println(namea));
		     names.forEach(System.out::println);
	}
	
	public void sortedSetProcessNum() {
		
	//	Integer intobj = new Integer(1);
	//	intobj.intValue()
		int num = 0;
		TreeSet<Integer> names = new TreeSet<Integer>();
		names.add(10);
		names.add(30);
		names.add(5);
		names.add(20);
		
Iterator<Integer>  itr = names.iterator();
		
		while(itr.hasNext()) {
			num = itr.next();
			System.out.println(num);
		}
		
		     names.forEach(namea->System.out.println(namea));
		     names.forEach(System.out::println);
	}
	
	public void processMap() {
		
		
		String key = "";
		String value = "";
		HashMap<String,String> studentmap = new HashMap<String,String>(32,.90f); // initial capacity =32 and will be resized when its 90%(load factor) full
		
		studentmap.put("James", "IT");
		studentmap.put("ROY", "CS");
		studentmap.put("Anish", "AI");
		studentmap.put("Yatin", "DEVOPS");
		
		System.out.println(studentmap.get("Rohit"));
		Set<String> keyset = studentmap.keySet();
		
		Iterator<String>  itr = keyset.iterator();
		
		while(itr.hasNext()) {
			key = itr.next();
			value = studentmap.get(key);
			System.out.println(key);
		}
		
	}
public void processTreeMap() {
		
		
		String key = "";
		String value = "";
		TreeMap<String,String> studentmap = new TreeMap<String,String>(); // initial capacity =32 and will be resized when its 90%(load factor) full
		
		studentmap.put("James", "IT");
		studentmap.put("ROY", "CS");
		studentmap.put("Anish", "AI");
		studentmap.put("Yatin", "DEVOPS");
		
		System.out.println(studentmap.get("Rohit"));
		Set<String> keyset = studentmap.keySet();
		
		Iterator<String>  itr = keyset.iterator();
		
		while(itr.hasNext()) {
			key = itr.next();
			value = studentmap.get(key);
			System.out.println(key);
		}
		
	}
	public void processQueue() {
		Queue<String> que = new PriorityQueue<>();
		que.add("Ram");
		que.add("Neha");
	}
}