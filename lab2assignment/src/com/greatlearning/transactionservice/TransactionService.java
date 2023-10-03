package com.greatlearning.transactionservice;
import java.util.Scanner;
public class TransactionService {
	public void CheckTransaction(int[] arr, int targetNo) {
		Scanner sc = new Scanner(System.in);
		while(targetNo--!=0) {
			int flag = 0;
			int target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			int sum=0;
			for (int i=0;i<arr.length;i++) {
				sum+=arr[i];
				if(sum>=target) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println("Given target is not achieved");
			}
		}
		
	}
}
	

		

