package Algorithm;

import java.io.IOException;
import java.util.Scanner;

public class b3085 {
	//char 배열 a[]에 5개씩 배열 넣는다.tochararray로.
	
	static int check(char[][] a) { //check함수 만들기.
		int n = a.length; // a.length : 5개
		int ans = 1;

		// 가로로 check[n][n]
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
			// 세로로 check[n][n]
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
		return ans; //return 값 int
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char a[][] = new char[n][n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
			// System.out.println(a[i]);
		}
		
		//ans = 출력값
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				// 1.가로로 체인지
				if (j + 1 < n) {
					char t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t; //바꾸고 나서
					int temp = check(a); //체크해봐; 만약 바꾼값이 그 전값보다 크면 ans갱신
					if (ans < temp) 					ans = temp;
					//다시 원상복구
					t = a[i][j];	a[i][j] = a[i][j + 1]; 	a[i][j + 1] = t;
				}//2.세로로 체인지
				if (i + 1 < n) {
					char t = a[i][j];		a[i][j] = a[i + 1][j];		a[i + 1][j] = t; //바꾸고 나서
					int temp = check(a); //체크해봐; 바꾼값이 그 전값보다 크면 ans갱신.
					if (ans < temp)						ans = temp;
					t = a[i][j]; a[i][j] = a[i + 1][j]; a[i + 1][j] = t; //다시 원상복구
				}
			}			
		}System.out.println(ans);

	}
}
