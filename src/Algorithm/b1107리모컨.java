package Algorithm;

import java.util.Scanner;

public class b1107리모컨 {

	static boolean brokenbtn[] = new boolean[10]; // 0~9
	static int possible(int c) {
		
		if (c == 0) { 		//반례 : 이동하려고 하는 채널이 0인경우
			if (brokenbtn[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		//possible 을 불가능하면 0, 가능하면 버튼을 눌러야 하는 횟수를 리턴시키자.
		int len = 0;
		while (c > 0) {//이동하려는 채널에 고장난 버튼이 있나 없나 확인
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
		int N = sc.nextInt(); // 이동하려는 채널
		int M = sc.nextInt(); // 고장난 버튼 개수(숫자만 고장남)

		for (int i = 0; i < M; i++) { //고장난 버튼 세팅
			int n = sc.nextInt();
			brokenbtn[n] = true;
		}

		int ans = N - 100;
		if (ans < 0) {
			ans = -ans;
		}

		for (int i = 0; i <= 100000; i++) { // 브루트포스-완전탐색 . 
			int c = i;   //이동하려는 채널 c결정			
			// c는 숫자버튼으로 이동하려는 채널번호(0부터 100,000까지 하겠다)
			
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