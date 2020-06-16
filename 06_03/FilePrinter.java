import java.util.*;
import java.io.*;

public class FilePrinter {

	public static void main(String[] args) {
		System.out.println("C://Windows//system.ini의 파일을 읽어 출력합니다.");
		FileReader fr = null;
		try {
			fr = new FileReader("C://Windows//system.ini");
			Scanner fScanner = new Scanner(fr); //파일에서 읽어온 것을 넣는다
			int i = 1;
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%4d: ", i++);
				System.out.println(line);
			}
			fScanner.close();
			
		}catch(IOException e) {
			System.out.println("파일을 불러오지 못했습니다.");
		}
		
	}

}
