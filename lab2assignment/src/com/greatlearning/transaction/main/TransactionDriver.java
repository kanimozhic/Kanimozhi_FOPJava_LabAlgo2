package com.greatlearning.transaction.main;
import java.util.Scanner;
import com.greatlearning.transactionservice.TransactionService;

public class TransactionDriver {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the value of array");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		TransactionService transactionService = new TransactionService();
		transactionService.CheckTransaction(arr, targetNo);
		sc.close();
			
		
	}

}
