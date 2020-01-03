package Algorithm;

import java.util.Scanner;

public class 피보나치수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();

		피보나치수 ex = new 피보나치수();
		System.out.println(ex.fibo(input));
	}
	
	
	public int fibo(int n) {
		
		if (n==0) return 0;
		if (n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}
	
}
