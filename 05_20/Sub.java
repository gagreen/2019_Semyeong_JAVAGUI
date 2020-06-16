import java.util.*;


public class Sub {
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(sub(a, b));
		s.close();
	}
}
