package ch05;

import java.util.Scanner;

public class Ex99_test {

	public static void main(String[] args) {
		// 4번 문제
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int element: array) {
			if (element > max)
				max = element;
		}
		System.out.println("max: " + max);
		System.out.print("=======================\n");
		
		// 5번 문제
		int[][] array1 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				sum += array1[i][j];
				count ++;
				}
		}
		avg = (double) sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		System.out.print("=======================\n");
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수> " );
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i=0; i <= scores.length; i++) {
					System.out.print("scores["+ i +"]");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i=0; i <= scores.length; i++) {
					System.out.print("scores["+ i +"]" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max1 = 0;
				int sum1 = 0;
				double avg1 = 0;
				for (int i=0; i <= scores.length; i++) {
					max1 = (max < scores[i]) ? scores[i] : max;
					sum1 += scores[i];
				}
				avg1 = (double) sum1 / studentNum;
				System.out.println("최고 점수: " + max1);
				System.out.println("평균 점수: " + avg1);
				
			} else if (selectNo == 5) {
				run = false;
			}
			
			
		}
		
	}

}
