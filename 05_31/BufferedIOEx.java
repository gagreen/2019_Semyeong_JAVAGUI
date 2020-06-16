import java.io.*;
import java.util.*;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("C:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			// 20Byte의 버퍼를 가지고 표준 출력 스트림에 연결하여 출력하는 버퍼 스트림
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush(); //버퍼에 남아있는 문자 모두 출력
			
			fin.close();
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
