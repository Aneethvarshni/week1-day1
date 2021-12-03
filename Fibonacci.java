package week1.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n-2;i++)
		{		
			sum=a+b;	
			a=b;
			b=sum;
			System.out.println(sum);
			
		}

	}

}
