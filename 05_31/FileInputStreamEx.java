import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte[] b = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\test.out"); //���۷��� ������ ����
			int n=0, c;
			while((c= fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("C:\\Temp\\test.out���� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("C:\\Temp\\test.out���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}

	}

}
