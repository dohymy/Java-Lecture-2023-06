package ch02;

public class Ex01_Variable {
	public static void main(String[] args) {
		// 변수명에 예약어를 쓸 수 없다.
		int age;		// 변수 선언
		age = 21;		// 변수 초기화
		int value = 80;
		int score = value * 2; // 변수 선언과 초기화를 동시에 실행(권장)
		System.out.println("age: " + age + ", score: " + score);
		
		// 여러 개의 변수를 한 줄에 선언+초기화 할 수 있음.
		int x = 10, y = 20;
		
		// x와 y의 값을 바꾸고 싶을 때
		int tmp = x;
		x = y;
		y = tmp;
		
		// 로컬 변수는 블록{ } 안에서만 사용할 수 있다
		if (score > 100) {
			// int value = 20   // 로컬변수 value가 이미 있기 때문에 사용 불가
			int localVar = 10;	// if block 안에서만 사용 가능한 로컬 변수	
			System.out.println(localVar);
		}
		
	}

}
