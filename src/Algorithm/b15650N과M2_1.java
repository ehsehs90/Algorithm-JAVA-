package Algorithm;

import java.util.Scanner;

public class b15650N과M2_1 {
	static int[] a = new int[10];

	static void go(int index, int selected, int n, int m) {
		// index == m ���
		if (selected == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(a[i]);
				if (i != m - 1)
					System.out.print(' ');
			}
			System.out.println();
			return;
		} // �ߺ� ���� M�� �̱� (��������)

		if (index > n)
			return;
		// ���ذ� �Ȱ���.. �ϴ� ��� ����� �� �ľ��ϴ°� �˰ڴµ�.. if ���Ȱ��ε� ��?
		// ���� �̷��� �ϴ°ǰ�..
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
