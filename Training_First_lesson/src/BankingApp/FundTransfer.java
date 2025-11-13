package BankingApp;

import BankingApp.ProcessPayment;
import java.io.*;
public class FundTransfer {
	public static void main(String[] args) {
//		ProcessPayment obj= new ProcessPayment();
//		ProcessPayment obj1 = new ProcessPayment();
		FundTransfer fobj = new FundTransfer();
		Customer c1 = new Customer("James","jane@gmail.com","353384534",20000,42);
		Customer c2 = new Customer("Jane","jane@gmail.com","355484534",10000,34);
		BankingApp.ProcessPayment.processFund(c1,c2,40000.00);
		ProcessFund neftobj = new ProcessFund();
		System.out.println("Customer balance initiator:"+c1.getAmountBalance());
		System.out.println("Customer balance bene:"+c2.getAmountBalance());
		neftobj.processFund(c1, c2, 35366);
		ProcessFund obj2 = new ProcessFund();
		obj2.processFund(c2, c1, 10000);
//		boolean isvalid = ProcessFund.validateCust(c2);
//		if(isvalid) {
//			obj2.processFund(c1, c2, 100000);
//		}
		try {
			int i = 5/0;
			int arr[] = {};
			System.out.println(arr[2]);
			File f = new File("");
			FileInputStream ftr = new FileInputStream(f);
			ftr.read();
			FileReader fr = new FileReader(f);
			fr.close();
		}
		catch(ArithmeticException ex) {
			System.out.print("Inside a catch");
		}
		catch(Exception e) {
			System.out.print("IO Exception"+e.getMessage());
		}
	}
}
