package Test2;

import java.util.Scanner;

public class Fibonacci {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int n = scanner.nextInt();

		int[] fibo = new int[n];


		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];

		}
		int count = 1;

		for (int i = 0; i < n; ++i) {
			System.out.println(fibo[i] + " -- " + count);
			count++;
		}

	}

}