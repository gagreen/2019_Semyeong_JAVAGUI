import java.util.*;
public class WordGameApp {
	public static void run(Player [] p) {
		Scanner s = new Scanner(System.in);
		String last = "아버지"; //마지막 단어 저장
		int playerNum = p.length, i=0;
		
		
		System.out.println("시작 단어는 " + last + "입니다.");
		while(true) {
			System.out.print(p[i].name+">>");
			p[i].getWordFromUser();
			
			if(p[i].checkSuccess(last)) {
				last = p[i].input;
			}
			else {
				System.out.println(p[i].name + "이(가) 졌습니다.");
				break;
			}
			i++;
			if(i >= playerNum) {
				i = 0;
			}
		}
		s.close();

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int playerNum;
		String name;
		
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참여하는 인원은 몇명입니까?>>");
		playerNum = s.nextInt();
		
		Player [] p = new Player[playerNum]; // 객체 배열
		for(int i=0; i<p.length; i++) { // 이름 입력 및 객체 생성
			System.out.print("참가자 이름 입력>>");
			name = s.next();
			p[i] = new Player(name);
		}
		run(p);
		s.close();
	}

}

class Player {
	String name, input;
	Scanner s = new Scanner(System.in);
	
	public Player(String name) { // 각 선수 생성자
		this.name = name;
	}
	
	public void getWordFromUser() { // 단어 입력
		this.input = s.nextLine();
	}
	
	public boolean checkSuccess(String last) { // 앞 뒤가 맞는지 체크
		int lastIndex = last.length()-1;
		char lastChar = last.charAt(lastIndex);
		char firstChar = input.charAt(0);
		
		if(lastChar == firstChar) {
			return true;
		}
		return false;
	}
}
