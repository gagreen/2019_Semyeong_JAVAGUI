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
		
		System.out.print(getName() + " ���� <Enter>Ű>>" );
		s.nextLine(); //����
		Calendar c = Calendar.getInstance(); //���� �ð� �ޱ�
		startSec = c.get(Calendar.SECOND); //�� �ޱ�
		System.out.println("���� �� �ð�: " + startSec);
		
		System.out.print("10�� ���� �� <Enter>Ű>>");
		s.nextLine(); //��
		c = Calendar.getInstance();
		endSec = c.get(Calendar.SECOND);
		System.out.println("���� �� �ð�: " + endSec);
		if(endSec < startSec) { // 6-50�� ���� ��츦 ���
			endSec += 60;
		}
		
		res = endSec - startSec ;
		
	}
	
}

public class TenSecond {
	
	public static void judge(Player[] p) {
		int bestIndex = 0; //���� ����ϰ� ���� ����� �ε���
		int bestResult = Math.abs(p[0].getRes()-10); // ���� ����� ���
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i].getName() + "�� ���: " + p[i].getRes() + ", ");
			if(bestResult > Math.abs(p[i].getRes()-10)) { //����
				bestResult = Math.abs(p[i].getRes()-10);
				bestIndex = i;
			}
		}
		System.out.println("���ڴ� " + p[bestIndex].getName());
		
	}
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int howMany;
		
		System.out.print("�ο��� �Է�>");
		howMany = s.nextInt();
		Player [] p = new Player[howMany];
		
		for(int i=0; i<p.length; i++) {
			System.out.print("�̸� �Է�: ");
			p[i] = new Player(s.next());
		}
		
		System.out.println("���� ����!");
		for(int i=0; i<p.length; i++) {
			p[i].result();
		}
		
		judge(p);
		
		s.close();
	}
}
