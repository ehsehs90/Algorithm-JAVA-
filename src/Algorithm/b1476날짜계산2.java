package Algorithm;

import java.util.Scanner;

public class b1476��¥���2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt() - 1;
		int S = sc.nextInt() - 1;
		int M = sc.nextInt() - 1;
		for (int i = 1;; i++) { //����Ž�� ����!
			if (i % 15 == E && i % 28 == S && i % 19 == M) {
				System.out.println(i + 1);
				break;			//�����ϸ� �ݺ����� �������´�
			}

		}
	}
}
