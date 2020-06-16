import java.util.*;
class Player{
	Scanner s = new Scanner(System.in);
	private String name;
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	public int turn() {
		System.out.print("�����[����(1) ����(2) ��(3) ������(4)]>>");
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
	private final String s[] = {"����", "����", "��"};
	private Player [] player = new Player[2];
	
	public RSP() {
		player[0] = new Player("�����");
		player[1] = new Computer("��ǻ��");
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
				int diff = input - com; // �Է°��� �������� �̿��� ���̸� ����
				switch(diff) {
				case 0: System.out.println("�����ϴ�."); break;
				case -1: System.out.println(player[1].getName() + "�� �̰���ϴ�."); break;
				case -2: System.out.println(player[0].getName() + "�� �̰���ϴ�."); break;
				case 1: System.out.println(player[0].getName() + "�� �̰���ϴ�."); break;
				case 2: System.out.println(player[1].getName() + "�� �̰���ϴ�."); break;
				}
			}
			else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
	
	public static void main(String[] args) {
		RSP rsp = new RSP();
		rsp.run();
	}

}
