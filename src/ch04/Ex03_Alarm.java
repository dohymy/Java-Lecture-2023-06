package ch04;

import java.util.Scanner;

public class Ex03_Alarm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시간 입력> ");
		int hour = Integer.parseInt(scan.nextLine());
		
		System.out.print("분 입력> ");
		int minute = Integer.parseInt(scan.nextLine());
		scan.close();
		
		
		if (minute>=45)
			System.out.println(hour + "시 " + (minute - 45) +"분");
		else
			if (hour == 0)
				System.out.println("23시 " + (minute + 15) + "분");
			else
				System.out.println((hour - 1) + "시 " + (minute + 15) + "분");
			
//		int hour, minute
//		hour = scan.nextInt();
//		minute = scan.nextInt();
		
	}

}
