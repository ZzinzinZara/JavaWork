package _03_enum;

import java.util.Calendar;
import java.util.Scanner;

public class T01_enumNEWS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		NEWS news1 = NEWS.NORTH;
		System.out.println(news1);
		
		NEWS news2 = NEWS.valueOf("WEST");
		System.out.println(news2);
		
		NEWS news3 = NEWS.valueOf(NEWS.class, "SOUTH");
		System.out.println(news3);
		
		switch(news1) {
		case EAST:
			System.out.printf("동\n");
			break;
		case WEST:
			System.out.printf("서\n");
			break;
		case SOUTH:
			System.out.printf("남\n");
			break;
		case NORTH:
			System.out.printf("북\n");
			break;
		}
		
		System.out.printf("==========================\n");
		
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 오늘의 요일 얻기 (1~7)
		System.out.println("요일: "+ day);
		
		WEEK today = null;
		switch(day) {
		case 1:
			today = WEEK.SUNDAY;
			break;
		case 2:
			today = WEEK.MONDAY;
			break;
		case 3:
			today = WEEK.TUESDAY;
			break;
		case 4:
			today = WEEK.WEDNESDAY;
			break;
		case 5:
			today = WEEK.THURSDAY;
			break;
		case 6:
			today = WEEK.FRIDAY;
			break;
		case 7:
			today = WEEK.SATURDAY;
			break;
		}
		System.out.println(today);
		
		if(today==WEEK.SUNDAY) System.out.printf("쉬어\n");
		else System.out.printf("공부\n");
		
		// 오늘이 해당하는 달 얻기 (0~11)
		int month = cal.get(Calendar.MONTH);
		
		switch(month) {
		case 0:System.out.printf("1"); break;
		case 1:System.out.printf("2"); break;
		case 2:System.out.printf("3"); break; 
		case 3:System.out.printf("4"); break;
		case 4:System.out.printf("5"); break;
		case 5:System.out.printf("6"); break;
		case 6:System.out.printf("7"); break;
		case 7:System.out.printf("8"); break;
		case 8:System.out.printf("9"); break;
		case 9:System.out.printf("10"); break;
		case 10:System.out.printf("11"); break;
		case 11:System.out.printf("12"); break;
		}
	}

}
