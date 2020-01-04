package Algorithm;

import java.util.Scanner;

public class 하노이탑 {
	
	public static StringBuilder sb= new StringBuilder();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count= sc.nextInt();
		hanoi(1,3,2, count);
		System.out.println((int)Math.pow(2, count)-1);
		System.out.println(sb.toString());
		
	}
	
	public static void hanoi(int from, int to, int center, int count) {
		
		if (count==0) return;
		
		else if (count==1) {
			sb.append(from + " "+ to);
			sb.append(System.lineSeparator());
			
		}else {
			hanoi(from, center, to, count-1);
			sb.append(from +" "+ to);
			sb.append(System.lineSeparator());
			hanoi(center, to, from, count-1);
			
		}
		
		// 1322 2 3 1
		//1231//2311
		//12//23
		//13//
	}

}
