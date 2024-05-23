package aLocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basic01 {

	public static void main(String[] args) {
		
		// 현재 날짜와 시간
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + LDT);
        
        // 포맷팅
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = LDT.format(formatter);
        System.out.println("포맷된 날짜와 시간: " + formattedDateTime);

        // 날짜와 시간 조작
        LocalDateTime tomorrow = LDT.plusDays(1);
        System.out.println("내일 같은 시간: " + tomorrow);

        // 특정 날짜와 시간 생성
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 23, 12, 30);
        System.out.println("지정한 날짜와 시간: " + dateTime);
        
        
	}

}
