import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����� ������?: ");
		int score = s.nextInt();
		if(score >= 80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�. ����");
		}
		
		s.close();
	}
}
