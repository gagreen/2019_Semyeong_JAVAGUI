import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>");
			String str = s.next();
			a.add(str); //입력값을 ArrayList에 추가
		}
		
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { //하나씩 길이를 비교하여 
				longestIndex = i; // 길다면 인덱스 값을 저장
			}
		}
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
		
		s.close();
	}

}
