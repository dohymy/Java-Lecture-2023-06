package ch01;

public class Comment {
	/**
	 * 도큐먼트 주석 - API document 만들 때 사용
	 * @param args
	 */
	public static void main(String[] args) {
		// In-line comment
		/* 주석 */
		/*
		 * 여러 줄의 주석
		 */
		// 프로그램 시작 위치
		System.out.println("실행문 뒤에는 세미콜론(;)을 붙여야 함.");
		// 변수는 앞에 type을 꼭 지정해야 한다.
		int x = 1;
		// 변수가 사용되지 않으면 경고가 뜬다.
		int y = 2;
		int sum = x + y ;
		System.out.println("결과는 " + sum + " 입니다.");
	}

}
