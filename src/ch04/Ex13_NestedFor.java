package ch04;

public class Ex13_NestedFor {

	public static void main(String[] args) {
		// 다이아몬드 그리기
		// 1사분면
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}	
		// 2사분면
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 4-i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		// 3사분면
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 5-i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		// 4사분면
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5-i; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			System.out.println();
		}
		// 완성된 다이아몬드 그리기
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5-i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < i; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < i; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < 5-i; k++) {
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
