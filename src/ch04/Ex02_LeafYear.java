package ch04;

import java.util.Scanner;

public class Ex02_LeafYear {

	public static void main(String[] args) {
		System.out.print("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		int year = Integer.parseInt(scan.nextLine());
		scan.close();
		
		String result;
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 100 == 0)
			result = "평년";
		else if (year % 4 == 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 4 ==0 && year % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		// 간결한 방식
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		// 함수로 사용하기
		System.out.println(year + "년은 " + leafYear(year)+"입니다.");
	}
		// 함수로 만들기
	private static String leafYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return "윤년";
		else
			return  "평년";
	}

}
