package Algorithm;

import java.util.Scanner;

public class b1476날짜계산2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt() - 1;
		int S = sc.nextInt() - 1;
		int M = sc.nextInt() - 1;
		for (int i = 1;; i++) { //완전탐색 조건!
			if (i % 15 == E && i % 28 == S && i % 19 == M) {
				System.out.println(i + 1);
				break;			//만족하면 반복문을 빠져나온다
			}

		}
	}
}
