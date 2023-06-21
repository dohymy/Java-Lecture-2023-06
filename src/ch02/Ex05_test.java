package ch02;

import java.util.Scanner;

public class Ex05_test {

	public static void main(String[] args) {
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("전화: " + tel1 + " - " + tel2 + " - " + tel3);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum1 = scan.nextLine();
		System.out.print("두번째 수");
		String strNum2 = scan.nextLine();
		
//		int num1 = (int) strNum1;
//		int num2 = strNum2;
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " + result);
	}

}
