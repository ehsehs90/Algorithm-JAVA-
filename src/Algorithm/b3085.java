package Algorithm;

import java.io.IOException;
import java.util.Scanner;

public class b3085 {
	//char �迭 a[]�� 5���� �迭 �ִ´�.tochararray��.
	
	static int check(char[][] a) { //check�Լ� �����.
		int n = a.length; // a.length : 5��
		int ans = 1;

		// ���η� check[n][n]
		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 1; j < n; j++) {
				if (a[i][j] == a[i][j - 1]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if (ans < cnt)
					ans = cnt;

			}
			cnt = 1;
			// ���η� check[n][n]
			for (int j = 1; j < n; j++) {
				if (a[j][i] == a[j - 1][i]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if (ans < cnt)
					ans = cnt;
			}
		}
		return ans; //return �� int
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char a[][] = new char[n][n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
			// System.out.println(a[i]);
		}
		
		//ans = ��°�
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				// 1.���η� ü����
				if (j + 1 < n) {
					char t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t; //�ٲٰ� ����
					int temp = check(a); //üũ�غ�; ���� �ٲ۰��� �� �������� ũ�� ans����
					if (ans < temp) 					ans = temp;
					//�ٽ� ���󺹱�
					t = a[i][j];	a[i][j] = a[i][j + 1]; 	a[i][j + 1] = t;
				}//2.���η� ü����
				if (i + 1 < n) {
					char t = a[i][j];		a[i][j] = a[i + 1][j];		a[i + 1][j] = t; //�ٲٰ� ����
					int temp = check(a); //üũ�غ�; �ٲ۰��� �� �������� ũ�� ans����.
					if (ans < temp)						ans = temp;
					t = a[i][j]; a[i][j] = a[i + 1][j]; a[i + 1][j] = t; //�ٽ� ���󺹱�
				}
			}			
		}System.out.println(ans);

	}
}
