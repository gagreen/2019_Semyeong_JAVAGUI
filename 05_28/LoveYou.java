import java.util.*;

public class LoveYou {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input;
		String first;
		System.out.println("문자열 입력>>");
		input = s.nextLine();
		int len = input.length();
		
		for(int i=0; i<len; i++) {
			first = input.substring(0,1);
			input = input.substring(1) + first;
			System.out.println(input);
		}
		s.close();
	}

}
