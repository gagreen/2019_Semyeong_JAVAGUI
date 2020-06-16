import java.util.*;
public class PhoneBook {
	static Scanner s = new Scanner(System.in);
	private Phone[] p;
	
	public void save() {
		int howMany; //�ο��� �Է� ����
		System.out.print("�ο��� >>");
		howMany = s.nextInt();
		p = new Phone[howMany]; // �ο�����ŭ ��ü �迭 ����
		
		for(int i=0; i<howMany; i++) {
			String name, phone; // �̸��� ��ȭ��ȣ �Է� ����
			System.out.print("�̸��� ��ȭ��ȣ(��ĭ���� ����)>>");
			name = s.next();
			phone = s.next();
			p[i] = new Phone(name, phone); //��ü ����
		}
		System.out.println("����Ǿ����ϴ�."); // �Է�
	}
	
	public String search(String input) { //�˻� ����
		for(int i=0; i<p.length; i++) {
			if(input.equals(p[i].getName())) { //�Է°� �̸��� ���ٸ�
				return p[i].getPhone(); //��ȭ��ȣ ����
			}
		}
		return null; // ���ٸ� null ����
	}
	
	public void run() {
		save();
		
		String input;
		while(true) {
			System.out.print("�˻��� �̸�>>");
			input = s.next();
			if(input.equals("�׸�")) {
				break;
			}
			if(search(input) == null) {
				System.out.println(input + "�� �����ϴ�.");
			}
			else {
				System.out.println(input+ "�� ��ȭ��ȣ�� " +search(input));
			}
		}
	}
	
	public static void main(String [] args) {
		new PhoneBook().run();
	}
}
