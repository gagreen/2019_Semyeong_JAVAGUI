import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름은?: ");
		String name = s.next();
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		s.close();
	}

}
