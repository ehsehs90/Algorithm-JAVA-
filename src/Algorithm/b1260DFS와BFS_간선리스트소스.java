package Algorithm;

import java.util.*;

//인접 리스트 사용
public class b1260DFS와BFS_간선리스트소스 {

	static ArrayList<Integer>[] a;
	static boolean[] c; // check 배열

	// 재귀 호출을 이용해 구현 - 인접리스트
	// 인접리스트 a[x] 는 x라는 곳에 x와 연결되어 있는 모든 정점이 들어있다.
	public static void dfs(int x) {

		if (c[x]) {
			return;
		}
		c[x] = true; // 정점 x를 방문했다고 표시
		System.out.print(x + " ");
		// 정점 x를 방문하고(있는) 상태에서, 다음에 방문할 정점을 찾는 코드
		for (int y : a[x]) {
			if (c[y] == false) { // 검사 해서 방문하지 않았으면
				dfs(y); // 방문한다
			}
		}
	}
	//queue를 이용해 bfs 
	public static void bfs(int start) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		c[start] = true;
		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
			for (int y : a[x]) {
				if (c[y] == false) {
					c[y] = true; // 정점 x에서 다음 정점(y) 가 될 수 있는것을 모두 들린다
					q.add(y); // 모두 q에 넣어준다.
								// bfs에서는 q에 넣을 때 방문했다고 해야한다.
					// q에서 뺄때 방문해버리면 시간이 더 오래걸린다. 2번 들릴 수도 있다.

				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {

			a[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
		}
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		c = new boolean[n + 1];
		dfs(start);
		System.out.println("DFS");
		c = new boolean[n + 1];
		bfs(start);
		System.out.println("BFS");

	}

}
