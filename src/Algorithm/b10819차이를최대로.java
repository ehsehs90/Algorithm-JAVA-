package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class b10819차이를최대로 {

	public static int calculate(int[] a) {

		int sum = 0;
		for (int i = 1; i < a.length; i++) {

			sum += Math.abs(a[i] - a[i - 1]);
		}
		return sum;
	}

	public static boolean next_permutatioon(int[] a) {

		int i = a.length - 1;
		//System.out.println("@" + i);
		while (i > 0 && a[i - 1] >= a[i]) {
			i -= 1;
			//System.out.println(1);
		}
		if (i <= 0)
			return false;

		int j = a.length - 1;
		while (a[j] <= a[i - 1]) {
			j -= 1;
			//System.out.println(2);
		}

		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		//System.out.println(3);
		j = a.length - 1;
		while (i < j) {
			//System.out.println(4);
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		// 순열 생성
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		// 첫 순열 시작 (기준순열)
		Arrays.sort(a);
		

		do {
			int temp = calculate(a);
			ans = Math.max(ans, temp);
			//System.out.println(ans);

		} while (next_permutatioon(a));
		System.out.println(ans);
	}

}
