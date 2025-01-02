package enumAnnotationGenerics;

public @interface AnnotationBasic01 {
	// 새로운 애너테이션 정의방법 : @붙이는거 제외하면 인터페이스 정의하는것과 동의
}

/*
 * @Target : 애너테이션이 적용가능한 대상을 지정하는데 사용됨 
 * @Retention : 애너테이션이 유지되는 기간(소스파일, 클래스파일, 실행시)을 지정하는데 사용됨
 */