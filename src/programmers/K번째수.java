package programmers;

import java.util.*;

public class K번째수{

	static int[] array = { 1, 5, 2, 6, 3, 7, 4 };
	static int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

	// private static class Solution {
	static public int[] solution(int[] array, int[][] commands) {

	int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {

			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			int idx = 0;
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {

				temp[idx] = array[j];
				idx++;
			}

			Arrays.sort(temp);

			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}
	// }

	public static void main(String[] args) {
		int[] a = new int[3];
		a=solution(array, commands);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
			
			
		}

	}

//
//import java.util.*;
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
// 
//	int[] answer = new int[commands.length];
//
//		for (int i = 0; i < commands.length; i++) {
//
//			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
//			int idx = 0;
//			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
//
//				temp[idx] = array[j];
//				idx++;
//			}
//
//			Arrays.sort(temp);
//
//			answer[i] = temp[commands[i][2] - 1];
//		}
//		return answer;
//    }
//}


