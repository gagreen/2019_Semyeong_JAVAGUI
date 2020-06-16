import java.io.*;
import java.util.*;

public class FileWriting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter fout = null; // 레퍼런스 변수 선언
		try {
			fout = new FileWriter("C:\\Temp\\Test.txt"); //출력 스트림
			while(true) {
				String line = s.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length()); //0부터 문자열의 길이만큼
				fout.write("\r\n", 0, 2); //한 줄 띄기 위해 \r\n을 파일에 저장
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}

}
