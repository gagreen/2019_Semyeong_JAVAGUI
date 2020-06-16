import java.util.*;
public class WordGameApp {
	public static void run(Player [] p) {
		Scanner s = new Scanner(System.in);
		String last = "�ƹ���"; //������ �ܾ� ����
		int playerNum = p.length, i=0;
		
		
		System.out.println("���� �ܾ�� " + last + "�Դϴ�.");
		while(true) {
			System.out.print(p[i].name+">>");
			p[i].getWordFromUser();
			
			if(p[i].checkSuccess(last)) {
				last = p[i].input;
			}
			else {
				System.out.println(p[i].name + "��(��) �����ϴ�.");
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
		
		System.out.println("�����ձ� ������ �����մϴ�.");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?>>");
		playerNum = s.nextInt();
		
		Player [] p = new Player[playerNum]; // ��ü �迭
		for(int i=0; i<p.length; i++) { // �̸� �Է� �� ��ü ����
			System.out.print("������ �̸� �Է�>>");
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
	
	public Player(String name) { // �� ���� ������
		this.name = name;
	}
	
	public void getWordFromUser() { // �ܾ� �Է�
		this.input = s.nextLine();
	}
	
	public boolean checkSuccess(String last) { // �� �ڰ� �´��� üũ
		int lastIndex = last.length()-1;
		char lastChar = last.charAt(lastIndex);
		char firstChar = input.charAt(0);
		
		if(lastChar == firstChar) {
			return true;
		}
		return false;
	}
}
