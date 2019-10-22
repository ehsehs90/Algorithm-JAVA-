package Algorithm;

import java.util.Scanner;

public class b15650N과M2_1 {
	static int[] a = new int[10];

	static void go(int index, int selected, int n, int m) {
		// index == m 출력
		if (selected == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(a[i]);
				if (i != m - 1)
					System.out.print(' ');
			}
			System.out.println();
			return;
		} // 중복 없이 M개 뽑기 (오름차순)

		if (index > n)
			return;
		// 이해가 안간다.. 일단 모든 경우의 수 파악하는건 알겠는데.. if 절안감싸도 돼?
		// 원래 이렇게 하는건가..
		a[selected] = index;
		go(index + 1, selected + 1, n, m);
		a[selected] = 0;
		go(index +1, selected, n, m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		go(1, 0, n, m);
	}

}
