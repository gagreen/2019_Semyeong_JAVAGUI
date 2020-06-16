import java.util.*;

public class GradeAveApp {
		
	public static double average(ArrayList<Character> arr) {
		double sum=0;
		for(int i=0; i<6; i++) {
			switch(arr.get(i)) {
			case 'A': sum += 4.0; break;
			case 'B': sum += 3.0; break;
			case 'C': sum += 2.0; break;
			case 'D': sum += 1.0; break;
			case 'F': sum += 0.0; break;
			}
		}
		return sum/arr.size();
	}
	public static void main(Character[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Character> arr = new ArrayList<Character>();
		double output;
		
		System.out.print("6개 학점 입력(A/B/C/D/F) : ");
		for(int i=0; i<6; i++) {
			arr.add(s.next().charAt(0)); //char이므로 charAt(0)으로 char화 시킴
		}
		
		output = average(arr);
		System.out.println(output);
		s.close();
	}

}
