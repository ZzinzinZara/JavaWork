package _01_calendar;

import java.util.*;

public class T01_calendar_get {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); // 싱글톤
		System.out.print(today.get(Calendar.YEAR)+"년 ");
		System.out.print(today.get(Calendar.MONTH)+1+"월 ");
		System.out.print(today.get(Calendar.WEEK_OF_MONTH)+"번째 주, ");
		System.out.println(today.get(Calendar.DATE)+"일");
		
		// 시간
		System.out.println("시간(0~23): "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("시간(0~11): "+today.get(Calendar.HOUR));
		
		int ampm = today.get(Calendar.AM_PM);
		System.out.println(ampm); // 0: am, 1: pm
		
		/*
		 * 출력
		 * if 오전 -> AM 09시
		 * if 오후 -> PM 09시
		 */
		
		if(ampm==1) {
			System.out.printf("PM %d시\n",today.get(Calendar.HOUR));
		} else System.out.printf("AM %d시\n",today.get(Calendar.HOUR));
	}
}
