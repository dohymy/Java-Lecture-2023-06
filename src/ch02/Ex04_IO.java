package ch02;

import java.util.Scanner;

public class Ex04_IO {

	public static void main(String[] args) throws Exception{
//		int keyCode = System.in.read();	// 한 char 읽을 때 쓰이지만 잘 안 쓰임
//		System.out.println(keyCode);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요 >");
		String inputText = scan.nextLine();	// enter를 칠 때까지의 문자열을 읽음
		System.out.println(inputText);
		
		System.out.print("타입을 입력하세요> ");
		String type = scan.nextLine(); // 정수, 실수
		System.out.print(type + "를 입력하세요> ");
		String numStr = scan.nextLine();
		
		if (type.equals("정수")) {
			int num = Integer.parseInt(numStr);
			System.out.println(num);
		} else if (type.equals("실수")){
			double num = Double.parseDouble(numStr);
			System.out.println(num);
		} else {
			System.out.println("정수 또는 실수를 입력하세요.");
		}
	}

}
