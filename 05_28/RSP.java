import java.util.*;
class Player{
	Scanner s = new Scanner(System.in);
	private String name;
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	public int turn() {
		System.out.print("사용자[가위(1) 바위(2) 보(3) 끝내기(4)]>>");
		return s.nextInt();
	}
}

class Computer extends Player{
	
	public Computer(String name) {
		super(name);
	}
	
	public int turn() {
		int input = (int)(Math.random()*3 +1);
		return input;
	}
}

public class RSP {
	private final String s[] = {"가위", "바위", "보"};
	private Player [] player = new Player[2];
	
	public RSP() {
		player[0] = new Player("사용자");
		player[1] = new Computer("컴퓨터");
	}
	
	public void run() {
		int input=0, com;
		while(true) {
			input = player[0].turn();
			com = player[1].turn();
			if(input>0 && input<5) {
				if(input == 4) {
					break;
				}
				System.out.println(player[0].getName()+"("+s[input-1]+")"+ " : " + player[1].getName()+"("+s[com-1]+")");
				int diff = input - com; // 입력값이 숫자임을 이용해 차이를 저장
				switch(diff) {
				case 0: System.out.println("비겼습니다."); break;
				case -1: System.out.println(player[1].getName() + "가 이겼습니다."); break;
				case -2: System.out.println(player[0].getName() + "가 이겼습니다."); break;
				case 1: System.out.println(player[0].getName() + "가 이겼습니다."); break;
				case 2: System.out.println(player[1].getName() + "가 이겼습니다."); break;
				}
			}
			else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
	public static void main(String[] args) {
		RSP rsp = new RSP();
		rsp.run();
	}

}
