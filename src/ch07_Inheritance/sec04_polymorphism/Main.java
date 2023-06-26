package ch07_Inheritance.sec04_polymorphism;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		// 다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어진다.
		Animal animal = new Cat();
		animal.sound();
		
		animal = dog;
		animal.sound();
		
		// animal이 어떤 타입인지 확인 후 강제변환
		if (animal instanceof Cat) {
			cat = (Cat) animal;
			cat.sound();
		} else if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.sound();
		} 
		else {
			System.out.println("cat.sound()를 사용할 수 없음.");
		}
		
		Object obj = new Animal();
		// obj.sound(); 사용불가
		if (obj instanceof Animal) {
			animal = (Animal) obj;
			animal.sound();
		}
	}

}
