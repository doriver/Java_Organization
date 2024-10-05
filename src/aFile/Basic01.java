package aFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Basic01 {

	public static void main(String[] args) {
			
		File directory = new File("D:\\aaaa");
		directory.mkdir(); // 디렉토리 생성
		
		Path path = Paths.get("D:\\aaaa/test.txt"); // 파일 경로
		
		try {
			// Writes bytes to a file( byte배열을 파일로 저장 )
			Files.write(path, "안녕하세요".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
