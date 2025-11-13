package FundTransfer;

import java.util.Scanner;

public class Linear_Search {

	public static boolean Search(int[] arr, int key, int size) {
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number in the array:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		boolean res = Search(arr,key,n);
		if(res) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not found");
		}
		
	}

}
