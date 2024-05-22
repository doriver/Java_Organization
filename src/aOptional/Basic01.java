package aOptional;

import java.util.Optional;

public class Basic01 {

	public static void main(String[] args) {
		// Optional 객체 생성
        Optional<String> optional = Optional.of("Hello, World!");        
//        Optional<String> nnnns = Optional.of(null); // NullPointerException
        
        Optional<String> emptyOptional = Optional.empty();
        
        System.out.println(optional); 
        // Optional[Hello, World!] , Optional의 value값이 "Hello, World!"
        
        System.out.println(emptyOptional);
        // Optional.empty , Optional의 value값이 null

	}

}
