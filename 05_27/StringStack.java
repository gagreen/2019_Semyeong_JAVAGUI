import java.util.*;

interface Stack {
	int length(); //����� ����
	int capacity(); // ���� ������ ����
	String pop(); // ���
	boolean push(String val); // �Է�
}

public class StringStack implements Stack {
	private int tos; //Top Of Stack
	private String [] element;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}
	
	@Override
	public int length() {
		return tos + 1;
	}
	
	@Override
	public int capacity() {
		return element.length;
	}
	
	@Override
	public String pop() {
		if(tos == -1) { // ���� �ȿ� �ƹ��͵� ���� ��
			return null;
		}
		String output = element[tos];
		tos--;
		return output;
	}
	@Override
	public boolean push(String val) {
		if (tos == element.length - 1) { //���� ���� ������ ���� ��
			return false;
		}
		tos++;
		element[tos] = val;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean check;
		int size; //������ ������ �Է°�
		String input; // �� ��� �Է°�
		System.out.print("������ ������ �Է�>>");
		size = s.nextInt();
		StringStack strStack = new StringStack(size);//��ü ����
		
		while(true) {
			System.out.print("���ڿ� �Է�>>");
			input = s.next();
			if(input.equals("�׸�")) {
				break;
			}//�Է� ����
			check = strStack.push(input);
			if(check == false) {
				System.out.println("������ �� ���� push �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = strStack.length(); //for�� ������ length�� ���ϹǷ� ������ ����� �������� �д�.
		for(int i=0; i<len; i++) {
			System.out.print(strStack.pop() + " ");
		}
		
		s.close();
	}

}
