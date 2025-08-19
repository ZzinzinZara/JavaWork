package _01_calendar;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T06_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2025, 8,4,15,0,0);
		LocalDateTime endDay = LocalDateTime.of(2026, 3,13,22,20,0);
		
		System.out.println(startDay);
		System.out.println(endDay);
		
		// 날짜 포멧 지정
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일: "+dtf1.format(startDay));
		System.out.println("종료일: "+dtf1.format(endDay));
		System.out.printf("-----------------------------------\n");
		
		// isBefore(), isAfter(), isEqual
		System.out.println(today);
		if(today.isBefore(endDay)) { // endDay보다 이전이면
			System.out.println("교육 안 끝남");
		} else if(today.isAfter(endDay)) {
			System.out.printf("교육 끝남\n");
		} else if(today.isEqual(endDay)) {
			System.out.println("교육 마지막 날");
		}
		System.out.printf("-----------------------------------\n");
		
		Duration d = Duration.between(startDay,endDay);
		System.out.println(d.getSeconds()/60+" 시간 남음");
		
		System.out.println("종료일 까지 "+today.until(endDay,ChronoUnit.MONTHS)+"개월 남음");
		System.out.println("종료일 까지 "+today.until(endDay,ChronoUnit.DAYS)+"일 남음");
		System.out.println("종료일 까지 "+today.until(endDay,ChronoUnit.HOURS)+"시간 남음");
		System.out.printf("-----------------------------------\n");
		
		System.out.println(today.plusYears(3).format(dtf1));
		System.out.println(today.plusMonths(5).format(dtf1));
		System.out.println(today.plusDays(100).format(dtf1));
		System.out.printf("-----------------------------------\n");
		
		System.out.println(today.minusYears(3).format(dtf1));
		System.out.println(today.minusMonths(5).format(dtf1));
		System.out.println(today.minusDays(100).format(dtf1));
	}

}
