package Algorithm;

import java.util.*;

class Pair1 {
	int x;
	int y;

	Pair1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class b2667단지번호를붙이자 {
	public static final int[] dx = { 0, 0, 1, -1 };
	public static final int[] dy = { 1, -1, 0, 0 };

	public static void bfs(int[][] a, int[][] group, int x, int y, int cnt, int n) {
		Queue<Pair1> q = new LinkedList<Pair1>();
		q.add(new Pair1(x, y));
		group[x][y] = cnt;
		while (!q.isEmpty()) {
			Pair1 p = q.remove();
			x = p.x;
			y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (0 <= nx && nx < n && 0 < ny && ny < n) {
					if (a[nx][ny] == 1 & group[nx][ny] == 0) {
						q.add(new Pair1(nx, ny));
						group[nx][ny] = cnt;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = s.charAt(j) - '0';

			}

		}
		int cnt =0;
		int[][] group = new int [n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] ==1 && group[i][j]==0) {
					bfs(a, group, i,j,++cnt,n);
					
				}
			}
		}
		int[] ans = new int[cnt];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(group[i][j] !=0) {
					ans[group[i][j]]+=1;
				}
			}
		}//그악sssss
		Arrays.sort(ans);
		System.out.println(cnt);
		for(int i=0; i<cnt; i++){
			System.out.println(ans[i]);
		}
	}

}
