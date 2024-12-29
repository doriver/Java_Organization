package aNumber;

import java.util.Random;

public class RandomBasic01 {

	public static void main(String[] args) {
		Random rd = new Random();
		for (int i= 0; i < 10; i++ ) {
			System.out.println(rd.nextInt(24)); // 0 ~ 23까지 
			System.out.println(rd.nextInt(60)); // 0 ~ 59까지 
		}
	}

}
