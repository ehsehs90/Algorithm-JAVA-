package Algorithm;

import java.util.*;

public class b2447별찍기 {

	private static final Scanner sc = new Scanner(System.in);
	private static char[][] starMap;

	public static void main(String[] args) {
		int num = sc.nextInt();
		starMap = new char[num][num];

		for (int i = 0; i < num; i++) {
			Arrays.fill(starMap[i], ' ');
		}

		solve(0, 0, num);

		for (int i = 0; i < num; i++) {
			System.out.println(starMap[i]);
		}
		
		System.out.println(27/3);
	}

	public static void solve(int x, int y, int n) {
		if(n==1) {
			starMap[x][y] ='*';
			return;
		}
		
		int m = n/3;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if( i==1 && j==1) {
					continue;
				}
				solve(x+m*i, y+m*j , m);
			}
		}
		
	}

}
