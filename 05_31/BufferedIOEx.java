import java.io.*;
import java.util.*;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("C:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			// 20Byte�� ���۸� ������ ǥ�� ��� ��Ʈ���� �����Ͽ� ����ϴ� ���� ��Ʈ��
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush(); //���ۿ� �����ִ� ���� ��� ���
			
			fin.close();
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
