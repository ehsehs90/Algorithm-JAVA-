package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class b2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[9];
		int sum = 0;

		// 9���� ������ Ű�� sum�� ���Ѵ�.
		for (int i = 0; i < 9; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		Arrays.sort(s);
		
		// 9���� 2�� ���� ��(������ 7����) sum =100���� Ȯ���ϱ�
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {

				// 100�̸� ���Ʈ����(����Ž��) ��!
				if (sum - s[i] - s[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (i == k || j == k)
							continue;
						System.out.println(s[k]);
					}
					// ����Ž�� ������ �˸��� �߿��� �ڵ�
					System.exit(0);
				}
			}
		}
	}
}
