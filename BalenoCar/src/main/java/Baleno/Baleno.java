package Baleno;

import java.util.Scanner;

public class Baleno{
	public static int Time = 3;
	public static double amount(double price, double rate) {
		double interest = (price*rate*Time)/100;
		double amt  = price+interest;
		System.out.println("Total amount to be paid after "+Time+" years:"+amt);
		return amt;
	}
	public static double compoundAmount(double price, double rate) {
		System.out.print("Compound interval:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		double val = (1+(rate/(n*100)));
		double amt = price*Math.pow(val,n*Time);
		System.out.println("Total amount to be paid after "+Time+" years:"+amt);
		return amt;
		
	}
	public static void EMI(double cost) {
		double pay = cost/(Time*12);
		System.out.println("EMI of the car is:"+pay);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Model Name of Baleno:");
		String model = sc.next();
		switch(model.toLowerCase()) {
		case "alpha":
			Alpha a = new Alpha();
			System.out.println("Alpha model");
			a.details();
			double cost1 = amount(a.loan_amt,a.loan_interest);
			double compoundcos1 = compoundAmount(a.loan_amt,a.loan_interest);
			EMI(cost1);
			return;
		case "beta":
			Beta b = new Beta();
			System.out.println("Beta model");
			b.details();
			double cost2 = amount(b.loan_amt,b.loan_interest);
			double compoundcos2 = compoundAmount(b.loan_amt,b.loan_interest);
			EMI(cost2);
			return;
		case "delta":
			Delta d = new Delta();
			System.out.println("Delta Model");
			d.details();
			double cost3 = amount(d.loan_amt,d.loan_interest);
			double compoundcos3 = compoundAmount(d.loan_amt,d.loan_interest);
			EMI(cost3);
			return;
		default:
			System.out.println("Not a valid model");
			return;
		}
	}
}
