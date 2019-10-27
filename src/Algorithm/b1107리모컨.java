package Algorithm;

import java.util.Scanner;

public class b1107리모컨 {

	static boolean brokenbtn[] = new boolean[10]; // 0~9
	static int possible(int c) {
		
		if (c == 0) { 		//�ݷ� : �̵��Ϸ��� �ϴ� ä���� 0�ΰ��
			if (brokenbtn[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		//possible �� �Ұ����ϸ� 0, �����ϸ� ��ư�� ������ �ϴ� Ƚ���� ���Ͻ�Ű��.
		int len = 0;
		while (c > 0) {//�̵��Ϸ��� ä�ο� ���峭 ��ư�� �ֳ� ���� Ȯ��
			if (brokenbtn[c % 10]) {
				return 0;
			}
			len += 1;
			c /= 10;
		}
		return len;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �̵��Ϸ��� ä��
		int M = sc.nextInt(); // ���峭 ��ư ����(���ڸ� ���峲)

		for (int i = 0; i < M; i++) { //���峭 ��ư ����
			int n = sc.nextInt();
			brokenbtn[n] = true;
		}

		int ans = N - 100;
		if (ans < 0) {
			ans = -ans;
		}

		for (int i = 0; i <= 100000; i++) { // ���Ʈ����-����Ž�� . 
			int c = i;   //�̵��Ϸ��� ä�� c����			
			// c�� ���ڹ�ư���� �̵��Ϸ��� ä�ι�ȣ(0���� 100,000���� �ϰڴ�)
			
			int len = possible(c);
			if (len > 0) {
				int press = c - N;  // +
				if (press < 0) {
					press = -press;  //-

				}
				if (ans > len + press) {
					ans = len + press;
				}

			}
			System.out.println(ans);
		}

	}
}