
public class WrapperEx {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2='F';
		if(Character.isDigit(c1)) { // ���ڶ��
			System.out.println(c1 + "�� ����");
		}
		if(Character.isAlphabetic(c2)) { // ���ĺ��̸�
			System.out.println(c2 + "�� ����");
		}
		
		System.out.println(Integer.parseInt("-123")); // ���ڿ��� ������
		System.out.println(Integer.toHexString(28)); // 2���� ���ڿ���
		System.out.println(Integer.toBinaryString(28)); // 16���� ���ڿ���
		System.out.println(Integer.bitCount(28)); // 2���� �� 1�� ���� 
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); // 3.14�� "3.14"��
		System.out.println(Double.parseDouble("3.14")); // ���ڿ��� ���ڷ�
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); // b�� ���ڿ��� ��ȯ
		System.out.println(Boolean.parseBoolean("false")); // ���ڿ��� boolean���·� ��ȯ

	}

}
