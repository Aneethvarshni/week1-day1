package week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		scan.close();
		//boolean isPrime = true;
		// int count = 0;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				System.out.println("Not a prime");
				//isPrime=false;
				//break;
			} 

		}  System.out.println("It is a prime number");
//		if(isPrime) {
//		 
//		}
		
		/*
		 * if (count == 2) { System.out.println("it is a prime");
		 * 
		 * } else {
		 * 
		 * System.out.println("not prime coz count was :" +count); }
		 */

	} 
}
