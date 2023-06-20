package ch01;

import java.util.Iterator;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		System.out.println("안녕하세요?");
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i]=i*10;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
