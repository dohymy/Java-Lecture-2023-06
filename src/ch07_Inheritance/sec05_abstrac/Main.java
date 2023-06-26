package ch07_Inheritance.sec05_abstrac;

public class Main {

	public static void main(String[] args) {
		// Phone phone = new Phone(); 추상 클래스는 객체화 불가
		SmartPhone sp = new SmartPhone(); // 상속받아 사용
		sp.turnOn();
		sp.call("010-1234-5678");
		sp.turnOff();
	}
}
