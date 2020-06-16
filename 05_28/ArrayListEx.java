import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ���>");
			String str = s.next();
			a.add(str); //�Է°��� ArrayList�� �߰�
		}
		
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { //�ϳ��� ���̸� ���Ͽ� 
				longestIndex = i; // ��ٸ� �ε��� ���� ����
			}
		}
		System.out.println("\n���� �� �̸��� : " + a.get(longestIndex));
		
		s.close();
	}

}
