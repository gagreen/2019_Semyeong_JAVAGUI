import java.io.*;
import java.util.*;

public class FileWriting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter fout = null; // ���۷��� ���� ����
		try {
			fout = new FileWriter("C:\\Temp\\Test.txt"); //��� ��Ʈ��
			while(true) {
				String line = s.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length()); //0���� ���ڿ��� ���̸�ŭ
				fout.write("\r\n", 0, 2); //�� �� ��� ���� \r\n�� ���Ͽ� ����
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
		s.close();
	}

}
