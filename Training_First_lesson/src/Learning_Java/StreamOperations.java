package Learning_Java;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import BankingApp.Customer;

public class StreamOperations {
	public static void main(String[] args) {
		Stream<Integer> strm = Stream.of(1,2,3,4,4);
//		strm.mapToInt(Integer::intValue).sum();
		List<Integer> numsq = strm.map(i->i*i).collect(Collectors.toList());
		// map is intermediate ops
		//collect is a terminal operation. intermediate ops are lazy n wont run until terminal ops are called.
		numsq.forEach(System.out::println);
		List<String> logs = Arrays.asList("Login","fundtransfer","Add bene","Logout");
		List<String> names = new ArrayList<String>();
		names.add(null);
		Stream<String> str = logs.stream();
		//str.anyMatch("Login");
		boolean status = str.allMatch(name->name.startsWith("L"));
		System.out.println("Value of status:"+status);
		str.anyMatch(name->name.startsWith("L"));
		long  count = str.filter(st->st.startsWith("L")).count();
		//Means in this arraylist any particular string starts with L.
		System.out.println("Value of count:"+count);
		
		logs.stream().filter(st->st.startsWith("L")).count();
		List<String> filternames = logs.stream().filter(str1->str1.startsWith("L")).collect(Collectors.toList());
		filternames.forEach(System.out::println);
		
	}
	public void streamWithList() {
		CustomerAgeComparator comp = new CustomerAgeComparator();
		ArrayList<Customer> custList = new ArrayList<Customer>();
		Customer c1 = new Customer("James","james@gmail.com","434323432",4343,65);
		Customer c2 = new Customer("Jace","jace@gmail.com","434323436",4344,66);
		Customer c3 = new Customer("Jack","jack@gmail.com","434323438",4346,67);
		Customer c4 = new Customer("John","john@gmail.com","434323439",4347,68);
		custList.add(c1);
		custList.add(c2);
		custList.add(c4);
		custList.add(c3);
		
		custList.stream().filter(cus->cus.getName().equalsIgnoreCase("Joy")).collect(Collectors.toList()).get(0);
		
		List<Customer> custFilter = custList.stream()
				.filter(cus->cus.getName().equalsIgnoreCase("Joy") && cus.getAmountBalance()>4000)
				.collect(Collectors.toList());
		
		List<Customer> sortedList = (List<Customer>)custList.stream().sorted(comp);
		
		List<Customer> sort1 = (List<Customer>)custList.stream()
				.sorted(Comparator.comparing(Customer::getName))
				.collect(Collectors.toList());
		
		List<Customer> sort2 = (List<Customer>)custList.stream().sorted(Comparator.comparingDouble(Customer::getAmountBalance)).collect(Collectors.toList());
		
		List<String> sorted3 = custList.stream().map(c->c.getName()).collect(Collectors.toList());
		List<Double> sbalance = custList.stream().map(c->c.getAmountBalance()).collect(Collectors.toList());
		double totalCount = sbalance.stream().mapToDouble(Double::doubleValue).sum();
		

	}
}
