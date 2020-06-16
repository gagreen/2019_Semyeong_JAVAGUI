import java.util.*;

class Player {
	private Scanner s = new Scanner(System.in);
	private String name;
	private int res;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRes() {
		return res;
	}
	
	public void result() {
		int startSec, endSec;
		
		System.out.print(getName() + " 시작 <Enter>키>>" );
		s.nextLine(); //시작
		Calendar c = Calendar.getInstance(); //현재 시간 받기
		startSec = c.get(Calendar.SECOND); //초 받기
		System.out.println("현재 초 시간: " + startSec);
		
		System.out.print("10초 예상 후 <Enter>키>>");
		s.nextLine(); //끝
		c = Calendar.getInstance();
		endSec = c.get(Calendar.SECOND);
		System.out.println("현재 초 시간: " + endSec);
		if(endSec < startSec) { // 6-50과 같은 경우를 대비
			endSec += 60;
		}
		
		res = endSec - startSec ;
		
	}
	
}

public class TenSecond {
	
	public static void judge(Player[] p) {
		int bestIndex = 0; //가장 비슷하게 맞힌 사람의 인덱스
		int bestResult = Math.abs(p[0].getRes()-10); // 가장 비슷한 결과
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i].getName() + "의 결과: " + p[i].getRes() + ", ");
			if(bestResult > Math.abs(p[i].getRes()-10)) { //절댓값
				bestResult = Math.abs(p[i].getRes()-10);
				bestIndex = i;
			}
		}
		System.out.println("승자는 " + p[bestIndex].getName());
		
	}
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int howMany;
		
		System.out.print("인원수 입력>");
		howMany = s.nextInt();
		Player [] p = new Player[howMany];
		
		for(int i=0; i<p.length; i++) {
			System.out.print("이름 입력: ");
			p[i] = new Player(s.next());
		}
		
		System.out.println("게임 시작!");
		for(int i=0; i<p.length; i++) {
			p[i].result();
		}
		
		judge(p);
		
		s.close();
	}
}
