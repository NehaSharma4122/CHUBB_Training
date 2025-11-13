package FundTransfer;

import java.util.Scanner;

public class Fibonacci {
	public static void Fib(int n) {
		if(n<1) {
			System.out.println("Invalid number of terms\n");
			return;
		}
		int n1 = 1;
		int n2 = 0;
		System.out.println(n2);
		if(n==1) {
			return;
		}
		System.out.println(n1);
		for(int i=3;i<=n;i++) {
			int curr = n1+n2;
			n2=n1;
			n1=curr;
			System.out.println(curr);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Fib(n);
	}

}
