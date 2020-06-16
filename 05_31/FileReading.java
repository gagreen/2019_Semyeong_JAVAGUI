import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		FileReader fin = null; // 파일을 읽을 레퍼런스 변수 선언
		try { //예외처리 구문
			fin = new FileReader("C:\\Windows\\system.ini"); // 문자 입력 스트림 생성 
			
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
		}
		catch (IOException e){
			System.out.println("입출력 오류!");
		}
	}

}
