package _01_calendar;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T07_Zoned {

	public static void main(String[] args) {
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		
		ZonedDateTime berlinDT = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(berlinDT);
		
		ZonedDateTime newYorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkDT);
		
		// Calendar 사용
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now.getTime()));
	}

}
