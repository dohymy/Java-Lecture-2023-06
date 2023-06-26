package ch07_Inheritance.sec02;


public class Child extends Parent { // extends XXX를 해줌.
	int childInt;
	
	Child() {}
	Child(int childInt){
		super(childInt *2); // super : 부모를 호출
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
