package ch04;

import java.util.Scanner;

public class Ex03_FullAge {

	public static void main(String[] args) {
		String[] birth = "2000-01-01".split("-");
		int year = Integer.parseInt(birth[0]);
		int month = Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("생년> ");
		year = scan.nextInt();
		System.out.println("생월> ");
		month = scan.nextInt();
		System.out.println("생일> ");
		day = scan.nextInt();
		scan.close();
		
		
	}

}
