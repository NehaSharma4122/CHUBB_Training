package Learning_Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
public class DateOperations {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Today's date:"+d);
		LocalDate ld = LocalDate.now();
		System.out.println("Today's date:"+ld);
		LocalDate l = LocalDate.of(2002, 10, 1);
		System.out.println("Today's date:"+l);
		LocalDate ls = LocalDate.parse("2025-11-20");
		System.out.println("Today's date:"+ls);

		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Today's time:"+t);
		System.out.println("Today's datetime:"+dt);


		//LocalDate - Date(year,month,day);
		//LocalTime = Time(hour,min,sec)
		//LocalDateTime = Date and time
		//Period = time b/w 2 dates
		
	}
}
