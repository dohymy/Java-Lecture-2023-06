package ch10_exception;

public class Ex07_MultiCatch {

	public static void main(String[] args) {
		// 우클릭 - Run as - configuration - argument (입력) - Run
		String str = null;
		int value = 0;
		
		try {
			str = args[0];
			value = Integer.parseInt(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용법: 매개변수를 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("잘못된 숫자 형식입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(value);
	}

}
