package _01_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T03_simpleDataFormat {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		/*
		 * SimpleDateFormat 클래스: 날짜에 대한 format을 제공
		 * yyyy: 년도 네 자리, yy: 년도 두 자리
		 * MM(대문자): 월 두 자리, M: 월 한 자리
		 * dd: 일 두 자리, d: 일 한 자리
		 * hh: 12시간제 , HH: 24시간제
		 * mm(소문자): 분
		 * ss: 초
		 * E: 요일
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf2.format(today));
		
		Date today2 = new Date(2025,3,7);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf3.format(today2));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E요일// 12시간제");
		System.out.println(sdf4.format(today));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일// 24시간제");
		// 한글 넣기 가능
		System.out.println(sdf5.format(today));
		
		String str = "20250819";
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd");
		try { // parsing은 sdf8로 하고 출력은 sdf9로??? 
			Date strNow = sdf8.parse(str); // 문자를 날짜의 형태로 변경
			System.out.println(sdf9.format(strNow));
		} catch (Exception e) {
			
		}
	}
}
