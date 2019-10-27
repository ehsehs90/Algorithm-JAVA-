package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class b2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[9];
		int sum = 0;

		// 9명의 난쟁이 키를 sum에 합한다.
		for (int i = 0; i < 9; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		Arrays.sort(s);
		
		// 9명에서 2명 선택 후(나머지 7명의) sum =100인지 확인하기
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {

				// 100이면 브루트포스(완전탐색) 끝!
				if (sum - s[i] - s[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (i == k || j == k)
							continue;
						System.out.println(s[k]);
					}
					// 완전탐색 중지를 알리는 중요한 코드
					System.exit(0);
				}
			}
		}
	}
}
