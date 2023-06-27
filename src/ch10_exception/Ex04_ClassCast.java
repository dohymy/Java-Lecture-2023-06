package ch10_exception;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal a1 = new Cat(); // 부모(Animal)타입은 자식(Cat, Dog)타입을 가져갈 수 있다.
		Animal a2 = new Dog();
		
		Cat cat = (Cat) a1;
		Dog dog = (Dog) a2;
		
		if (a1 instanceof Cat)
			cat = (Cat) a1;
		if (a2 instanceof Dog)
			dog = (Dog) a2;
	}

}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}
