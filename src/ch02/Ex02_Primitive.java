package ch02;

public class Ex02_Primitive {

	public static void main(String[] args) {
		// Literal
		int intLiteral = 30;
		int bitLiteral = 0b1001; // 9
		int octal = 0377;		 // 255
		int hexa = 0xff;		 // 255
		long longVal = 256L;		 // long literal
		System.out.printf("%d, %d, %d, %d\n", intLiteral, bitLiteral, octal, hexa, longVal);
		// ctrl + space = 자동 완성
		
		// 문자는 ''(작은 따옴표)로 감싼다.
		char ga = '가';
		char capitalA = 0x41;	// 대문자 A
		System.out.printf("%c, %c\n", ga, capitalA);
		
		// " "(큰 따옴표)로 쓸 때는 String (문자열에 사용)
		// 기본(primitive) 타입은 아니지만 기본처럼 사용되는 String
		String hello = "Hello World";
		System.out.printf("%s\n", hello);
		
		// 실수: float, double (double을 주로 씀)
		double pi = 3.14;
		double mega = 1e6;
		float exp = 2.728f;		// float타입으로 저장하려면 f를 붙여준다
		System.out.printf("%.2f, %.1f\n", "%.3f", pi, mega, exp);
		
		// boolean
		boolean start = true, stop = false;
		
	}

}
