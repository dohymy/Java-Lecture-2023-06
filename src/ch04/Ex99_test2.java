package ch04;

import java.util.Scanner;

public class Ex99_test2 {

	public static void main(String[] args) {
		// 2번 문제
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1에서 100까지의 정수 중 3의 배수의 합은" + sum + "입니다.");
		
		// 3번 문제
		System.out.print("=======================\n");
		while (true) {
			int dice1 = 1 + (int) (Math.random()*6);
			int dice2 = 1 + (int) (Math.random()*6);
			System.out.println(dice1 + "," + dice2);
			if ((dice1 + dice2) == 5)
				break;
		}
		
		// 4번 문제
		System.out.print("=======================\n");
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if ( (4*x) + (5*y) == 50)
					System.out.println(x + ", " + y);
			}
		}
		
		// 7번 문제
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			
			int select = Integer.parseInt(scanner.nextLine());
			if (select == 1) {
				System.out.println("예금액> " + balance);
				balance += Integer.parseInt(scanner.nextLine());
			}else if (select == 2) {
				System.out.println("출금액> " + balance);
				balance -= Integer.parseInt(scanner.nextLine());
			}else if (select == 3) {
				System.out.println("잔고> " + balance);
			}else 
				break;
		}
		System.out.println("프로그램 종료");
	}

}
