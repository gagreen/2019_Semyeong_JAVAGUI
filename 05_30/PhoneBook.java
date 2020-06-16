import java.util.*;
public class PhoneBook {
	static Scanner s = new Scanner(System.in);
	private Phone[] p;
	
	public void save() {
		int howMany; //인원수 입력 역할
		System.out.print("인원수 >>");
		howMany = s.nextInt();
		p = new Phone[howMany]; // 인원수만큼 객체 배열 생성
		
		for(int i=0; i<howMany; i++) {
			String name, phone; // 이름과 전화번호 입력 역할
			System.out.print("이름과 전화번호(빈칸으로 구분)>>");
			name = s.next();
			phone = s.next();
			p[i] = new Phone(name, phone); //객체 생성
		}
		System.out.println("저장되었습니다."); // 입력
	}
	
	public String search(String input) { //검색 역할
		for(int i=0; i<p.length; i++) {
			if(input.equals(p[i].getName())) { //입력과 이름이 같다면
				return p[i].getPhone(); //전화번호 리턴
			}
		}
		return null; // 없다면 null 리턴
	}
	
	public void run() {
		save();
		
		String input;
		while(true) {
			System.out.print("검색할 이름>>");
			input = s.next();
			if(input.equals("그만")) {
				break;
			}
			if(search(input) == null) {
				System.out.println(input + "이 없습니다.");
			}
			else {
				System.out.println(input+ "의 전화번호는 " +search(input));
			}
		}
	}
	
	public static void main(String [] args) {
		new PhoneBook().run();
	}
}
