package ch07_Inheritance.sec06;

public abstract class Animal {
	String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
