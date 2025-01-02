package enumAnnotationGenerics;

public class EnumBasic01 {

	public static void main(String[] args) {
		System.out.println(Kind.CLOVER); // CLOVER
		
		Kind k = Kind.DIAMOND;
		System.out.println(k); // DIAMOND
		System.out.println(k.getClass().getName()); // enumAnnotationGenerics.Kind
		System.out.println(k == Kind.DIAMOND); // true

	}

}

enum Kind { CLOVER, HEART, DIAMOND, SPADE }
/*
 * enum( 열거형 )
 * 여러 상수를 선언할때 편리하게 선언가능
 * 
 * 상수 : 값을 한번 저장하면 변경할수 없는 저장공간, 변수 타입앞에 final을 붙여준다.
 * 
 * enum은 내부적으로 java.lang.Enum 클래스를 상속으며, 상수는 모두 고유한 객체로 생성됨
 * 
 */