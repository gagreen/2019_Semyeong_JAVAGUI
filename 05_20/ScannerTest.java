import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����� �̸���?: ");
		String name = s.next();
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		s.close();
	}

}
