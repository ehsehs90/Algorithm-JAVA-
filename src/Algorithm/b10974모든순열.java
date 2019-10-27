package Algorithm;

import java.util.Scanner;

public class b10974모든순열 {
	public static boolean next_permutatioon(int[] a) {

		int i = a.length - 1;
		System.out.println("@" + i);
		while (i > 0 && a[i - 1] >= a[i]) {
			i -= 1;
			System.out.println(1);
		}
		if (i <= 0)
			return false;

		int j = a.length - 1;
		while (a[j] <= a[i - 1]) {
			j -= 1;
			System.out.println(2);
		}

		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		System.out.println(3);
		j = a.length - 1;
		while (i < j) {
			System.out.println(4);
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

		int n = sc.nextInt();
		int[] a = new int[n];
		// 순열 생성
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
			// System.out.print(a[i] + " ");
		} // 첫 순열 시작 (기준순열)
		do {
			for (int i = 0; i < n; i++) {
				
				System.out.print(a[i] + " ");
			}
			System.out.println();

		} while (next_permutatioon(a));
	}

}
