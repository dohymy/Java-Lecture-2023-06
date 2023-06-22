package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex06_MinMax {

	public static void main(String[] args) {
		int[] scores = new int[30];
		Random rand = new Random();
		for (int score: scores)
			score = rand.nextInt(100);
		System.out.println(Arrays.toString(scores));
		
		// 최대값
		int max = 0; // 나오지 않을 가장 작은 수를 적는다.
		for (int score: scores) {
			if (score > max) { // score의 최대값을 구하여 max에 저장
				max = score;
			}
		}
		System.out.println("최대값: " + max);
		
		//	최소값
		int min = 100;
		for (int score: scores)
			if (score < min)
				min = score;
		System.out.println("최소값: " + min);
	}

}
