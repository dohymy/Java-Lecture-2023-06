package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex04_FullAge {

	public static void main(String[] args) {
		System.out.print("생년월일(yyyy-mm-dd)> ");
		Scanner scan =new Scanner(System.in);
		String[] birth = "2000-01-01".split("-");	//String array
		scan.close();
		int birth_year = Integer.parseInt(birth[0]);
		int birth_month = Integer.parseInt(birth[1]);
		int birth_day = Integer.parseInt(birth[2]);
		System.out.printf("%d-%02d-%02d\n", birth_year, birth_month, birth_day);
		
		LocalDate today = LocalDate.now();
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		System.out.printf("%d-%02d-%02d\n", tYear, tMonth, tMonth);
		
		int age;
		if (tMonth < birth_month)
			age = tYear - birth_year - 1;
		else if (tMonth > birth_month)
			age = tYear - birth_year;
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("생년> ");
//		year = scan.nextInt();
//		System.out.println("생월> ");
//		month = scan.nextInt();
//		System.out.println("생일> ");
//		day = scan.nextInt();
//		scan.close();
//		System.out.println("%d-%02d-%02d\n", year, month,day);
		
		
		
		
	}

}
