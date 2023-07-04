package ch13_collection.sec92_q8set;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// return this.studentNum;
		return Objects.hash(this.studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;
		Student st = (Student) obj;
		return this.studentNum == st.studentNum; // 학번이 같으면 동일인물이다
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name + "]";
	}
}
