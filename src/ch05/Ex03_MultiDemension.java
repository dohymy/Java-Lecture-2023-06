package ch05;

import java.util.Arrays;

public class Ex03_MultiDemension {

	public static void main(String[] args) {
		// 행이 2, 열이 3개인 배열 생성
		int[][] matrix = new int[2][3];
		int score[][] = {{80,90,85},{92,76,84}};
		
		System.out.printf("%d, %d\n", score[0][0], score[1][2]);
		
		// 행의 갯수, 열의 갯수를 확인하는 법
		System.out.printf("%d, %d\n", matrix.length, matrix[0].length);
		
		System.out.println(Arrays.toString(score)); // 도움이 안 됨
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));
	}

}
