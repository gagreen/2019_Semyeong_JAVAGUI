import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\system.ini");
		File dest = new File("C:\\Temp\\system.txt");
		
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
