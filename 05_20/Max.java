import java.util.*;

public class Max {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr = new int[5];
		int max = 0;
		System.out.println("양수 배열 요소 입력");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		s.close();
	}

}
