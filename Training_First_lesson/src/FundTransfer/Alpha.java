package FundTransfer;

import java.util.Scanner;

public class Alpha {
	public static double price = 1200000;
	public static double loan_interest = 8;
	public static double loan_amt;
	public static void details() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the color of car:");
		String color = sc.next();
		System.out.print("Enter the rate of interest:");
		loan_interest = sc.nextDouble();
		System.out.print("Down payment made my the buyer:");
		double downpay = sc.nextInt();
		loan_amt = price-downpay;
		System.out.println("Price of the car:"+price);
		System.out.println("Color of the car:"+color);
		System.out.println("Interest to be applied on loan for car:"+loan_interest+"%");
		System.out.println("Down payment made by the buyer:"+downpay);
		System.out.println("Loan amount:"+loan_amt);
	}
}
