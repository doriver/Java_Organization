package aTypeConvert;

public class Basic01 {

	public static void main(String[] args) {
		// Integer.toString() 로 int > String
		int x = 10;
		String ss = Integer.toString(x);
		System.out.println(ss); // 10
		
		// intValue() 로 Long > int
		Long y = 12L;
		int xx = y.intValue();
		System.out.println(xx); // 12 , 에러 없음
	}

}
