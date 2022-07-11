package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); //대한민국 표준 날짜
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); //대한민국 표준 시간
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); //대한민국 표준 날짜,시간
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		
		String formattedDate = now.format(myFormat);
		System.out.println(formattedDate);

	}

}
