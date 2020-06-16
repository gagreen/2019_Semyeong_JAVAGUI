import java.util.*;
public class MaxNumberApp {
	public static int max(Vector<Integer> arr) {
		int num=0;
		
		for(int i=0; i<arr.size(); i++) {
			if(num < arr.get(i)) {
				num = arr.get(i);
			}
		}
		
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int input, output;
		Vector<Integer> arr = new Vector<Integer>(); //Integer타입의 Vector 생성
		
		System.out.print("입력(-1을 입력하면 입력종료) : ");
		while(true) {
			
			input = s.nextInt();
			if(input == -1) { // -1이면 입력종료
				break;
			}
			arr.add(input);
		}
		output = max(arr);
		System.out.println("가장 큰 수는 " + output);
		s.close();
	}

}
