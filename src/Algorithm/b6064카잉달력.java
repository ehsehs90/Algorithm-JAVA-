package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b6064Ä«À×´Þ·Â {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-->0) {
			
			String[] line = br.readLine().split(" ");
			int m = Integer.valueOf(line[0]);
			int n = Integer.valueOf(line[1]);
			int x = Integer.valueOf(line[2])-1;
			int y = Integer.valueOf(line[3])-1;
			boolean ok = false;
			for( int k=x; k<(n*m); k+=m) {
				if(k%n == y) {
					System.out.println(k+1);
					ok = true;
					break;
				}
			}
			if(!ok) {
				System.out.println(-1);
			}
		}
		
	}
}