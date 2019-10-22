package Algorithm;

import java.util.Scanner;

public class b15650N과M2 {
	static boolean[] c = new boolean[10];
	static int[] a = new int[10];

	static void go(int index, int start, int n, int m) {
		// index == m 출력
		if (index == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(a[i]);
				if (i != m - 1)
					System.out.print(' ');
			}
			System.out.println();
			return;
		} // 중복 없이 M개 뽑기 (오름차순)
		
		for(int i=start; i<=n ; i++) {
			if(c[i]) continue;
			c[i] = true;
			a[index] = i;
			go(index+1,i+1,n,m);
			c[i]=false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		go(0, 1, n, m);
	}

}
