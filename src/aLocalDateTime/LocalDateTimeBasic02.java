package aLocalDateTime;

import java.time.LocalDateTime;
import java.util.Random;

public class LocalDateTimeBasic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		LocalDateTime parsed = LocalDateTime.parse("2024-12-12T12:12");
		
		
		for (int i = 0; i < 10; i++) {
			parsed = parsed.plusHours(rd.nextInt(7)).plusMinutes(rd.nextInt(60));
			System.out.println(parsed);
		}
	}

}
