import java.util.*;
import java.io.*;

public class FilePrinter {

	public static void main(String[] args) {
		System.out.println("C://Windows//system.ini�� ������ �о� ����մϴ�.");
		FileReader fr = null;
		try {
			fr = new FileReader("C://Windows//system.ini");
			Scanner fScanner = new Scanner(fr); //���Ͽ��� �о�� ���� �ִ´�
			int i = 1;
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%4d: ", i++);
				System.out.println(line);
			}
			fScanner.close();
			
		}catch(IOException e) {
			System.out.println("������ �ҷ����� ���߽��ϴ�.");
		}
		
	}

}
