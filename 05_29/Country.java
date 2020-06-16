import java.util.*;

public class Country {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		String name;
		int people;
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea, 5000)");
		while(true) {
			System.out.print("������ �̸�, �α���>> ");
			name = s.next();
			if(name.equals("�׸�")) {
				break;
			}
			people = s.nextInt();
			nations.put(name, people);//key, value�� ����
		}// �Է�
		
		while(true) {
			System.out.print("�˻�>>");
			name = s.next();
			if(name.equals("�׸�")) {
				break;
			}
			if(nations.containsKey(name)) { // �Ű����� ������ Ű�� ������ �ִٸ� true ����
				System.out.println(name + "�� �α��� " + nations.get(name));
			}else {
				System.out.println(name + " ����� �����ϴ�.");
			}
		}// �˻�
		s.close();
	}
	
}
