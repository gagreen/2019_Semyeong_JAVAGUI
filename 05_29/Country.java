import java.util.*;

public class Country {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		String name;
		int people;
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea, 5000)");
		while(true) {
			System.out.print("나라의 이름, 인구수>> ");
			name = s.next();
			if(name.equals("그만")) {
				break;
			}
			people = s.nextInt();
			nations.put(name, people);//key, value로 삽입
		}// 입력
		
		while(true) {
			System.out.print("검색>>");
			name = s.next();
			if(name.equals("그만")) {
				break;
			}
			if(nations.containsKey(name)) { // 매개변수 내용의 키를 가지고 있다면 true 리턴
				System.out.println(name + "의 인구는 " + nations.get(name));
			}else {
				System.out.println(name + " 나라는 없습니다.");
			}
		}// 검색
		s.close();
	}
	
}
