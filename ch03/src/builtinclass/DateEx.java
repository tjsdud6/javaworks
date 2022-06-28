package builtinclass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// Date 클래스 사용
		Date today = new Date();
		System.out.println(today);
		
		//SimpleDateFormat 클래스 - 날짜/시간 형식
		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));
		
		System.out.println("=============================");
		
		//LocalDate, LocalTime 클래스 사용
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
