package ch07_Inheritance.sec01;

public class Child extends Parent { // extends XXX를 해줌.
	int childInt;
	
	Child() {}
	Child(int childInt){
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
