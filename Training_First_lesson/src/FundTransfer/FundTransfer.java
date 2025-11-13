package FundTransfer;

import java.util.*;

public class FundTransfer {
	public static int fundcounts;
	public int counts;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean status; 
		char b = 'A';
		String adharno = "42394394392";
		String aadharlist[] = {"j335","3435435","343535"};
		ProcessPayment.processFund();
		ProcessPayment obj= new ProcessPayment();
		ProcessPayment obj1 = new ProcessPayment();
		obj.processNEFTfund();
		obj1.processNEFTfund();
		print();
		add(3,4);
		isEvenNo(10);
		FundTransfer fobj = new FundTransfer();
		fobj.validateName("Neha");
		int k = (6>7)?3:6;
		System.out.println(k);
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Input is:"+input);
	}
	public static void print() {
		System.out.println("inside print");
		int i = 0;
		i =i+2;   //=+2;
		System.out.println("inside print - "+i);
		i = i-1;
		i = i*2;
		i = i/3;
		i = i%2;
	}

	public static void add(int i,int j) {
		 
		int result = i+j;
		int arr[] = {1,2,5,7,9,10};

		for (int k=0;k<arr.length;k++) {
			System.out.println("value of k in for loop with array  "+arr[k]);
		}
		System.out.println("result - "+result);
		
		for (int k=0;k<10;k++) {
			System.out.println("value of k in for loop  "+k);
		}
		
		while(result<10 ) {
			System.out.println("value of result in while - "+ result);
			result = result+1;
		}
		
		do {
			result++;
			System.out.println("value of result in do while = "+result);
		}
		while(result<20);
	}

	public static boolean isEvenNo(int i) {
		if(i>0 && i%2 == 0) {
			
			return true;
		}
		return false;
	}
	public boolean processTransaction() {
		//Non-static variable isnt accessible in static variable.  
		System.out.println("Inside transaction"+counts);
		return false;
	}
	public boolean validateName(String name) {
		switch(name) {
		case "Ashish":
			System.out.println("match found");
			return true;
		case "Neha":
			System.out.println("match found");
			return true;
		default:
			System.out.println("No match found");
			return false;
			
		}
	}

}
