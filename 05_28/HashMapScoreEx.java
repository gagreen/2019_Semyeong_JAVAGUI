import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("�輺��", 97);
		scoreMap.put("�ӱ���", 99);
		scoreMap.put("��μ�", 100);
		scoreMap.put("���", 7);
		scoreMap.put("���ߵ�", 87);
		
		System.out.println("HashMap�� ��� ���� : " + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet(); // Ű�� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator(); // Set�� �ִ� ��� key�� ������� �˻�
		
		while(it.hasNext()) { // ���� ��Ұ� ������ true ����
			String name = it.next();
			int score = scoreMap.get(name); //name Key�� �ش��ϴ� value ����
			System.out.println(name + " : " + score);
		}

	}

}
