import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		FileReader fin = null; // ������ ���� ���۷��� ���� ����
		try { //����ó�� ����
			fin = new FileReader("C:\\Windows\\system.ini"); // ���� �Է� ��Ʈ�� ���� 
			
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
		}
		catch (IOException e){
			System.out.println("����� ����!");
		}
	}

}
