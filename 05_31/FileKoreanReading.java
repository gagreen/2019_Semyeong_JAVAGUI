import java.io.*;

public class FileKoreanReading {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\koreanEx.txt");
			in = new InputStreamReader(fin, "MS949"); // MS에서 만든 한글 확장 완성형 문자 집합
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding()); // 문자 집합의 이름 리턴
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e){
			System.out.println("입출력 오류");
		}
	}

}
