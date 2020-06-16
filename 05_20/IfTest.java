import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 점수는?: ");
		int score = s.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다! 합격입니다.");
		}
		else {
			System.out.println("불합격입니다. 유감");
		}
		
		s.close();
	}
}
