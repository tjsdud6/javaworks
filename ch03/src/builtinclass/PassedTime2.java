package builtinclass;

import java.util.Calendar;

public class PassedTime2 {
	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		//startDay의 날짜
		startDay.set(2022, 5, 9);
		PrintDate(startDay);
		
		//오늘 날짜
		today.set(2022, 6, 29);
		System.out.println("시작일 : ");
		PrintDate(today);
		
		//오늘날짜 - 시작일
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//밀리초(ms)를 일(day)로 환산
		
		passedTime = passedTime /(24 * 60 * 60 * 1000);
		System.out.println("만난 지 " + passedTime + "일이 지났습니다.");
	}

	private static void PrintDate(Calendar date) {
		System.out.println(date.get(Calendar.YEAR)+"년 " + 
				date.get(Calendar.MONTH)+"월 "+ date.get(Calendar.DATE)+ "일");
	}
}
