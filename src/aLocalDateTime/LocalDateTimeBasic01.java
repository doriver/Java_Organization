package aLocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeBasic01 {

	public static void main(String[] args) {
		
		// 현재 날짜와 시간
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + LDT); // 2024-12-29T11:57:34.943579900
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 현재시간을 포맷팅함
        String formattedDateTime = LDT.format(formatter);
        System.out.println("포맷된 날짜와 시간: " + formattedDateTime); // 2024-12-29 11:57:34

        // 날짜와 시간 조작
        LocalDateTime tomorrow = LDT.plusDays(1);
        System.out.println("내일 같은 시간: " + tomorrow); // 2024-12-30T11:57:34.943579900

        System.out.println(" == 과거 == ");
        // minus~
        LocalDateTime pastYear = LDT.minusYears(10); 
        System.out.println(pastYear); // 2014-12-29T11:57:34.943579900
        LocalDateTime pastMonth = LDT.minusMonths(3);
        System.out.println(pastMonth); // 2024-09-29T11:57:34.943579900
        LocalDateTime pastWeek = LDT.minusWeeks(1);
        System.out.println(pastWeek); // 2024-12-22T11:57:34.943579900
        LocalDateTime pastDay = LDT.minusDays(2);
        System.out.println(pastDay); // 2024-12-27T11:57:34.943579900
        LocalDateTime pastHour = LDT.minusHours(3).minusMinutes(10);
        System.out.println(pastHour); // 2024-12-29T08:47:34.943579900
        
        
        System.out.println(" == 특정 날짜 == ");
        // 특정 날짜와 시간 생성
        // of
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 23, 12, 30);
        System.out.println("지정한 날짜와 시간: " + dateTime); // 2024-05-23T12:30
        
        // 문자열 파싱
        LocalDateTime parsed = LocalDateTime.parse("2024-12-12T12:12");
        System.out.println(parsed); // 2024-12-12T12:12
        
        
	}

}
