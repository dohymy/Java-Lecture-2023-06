package ch07_Inheritance.sec06;

public class Cow extends Animal{
	public Cow() {
		this.kind = "소";
	}
	@Override
	public void sound() {
		System.out.println("음메");
	}
}
