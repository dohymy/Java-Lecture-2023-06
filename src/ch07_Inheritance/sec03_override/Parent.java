package ch07_Inheritance.sec03_override;

public class Parent {
	int parentInt;
		
		Parent(){}
		Parent(int parentInt) {
			this.parentInt = parentInt;
		}
		
		void parentMethod() {
			System.out.println(this.parentInt);
		}
}
