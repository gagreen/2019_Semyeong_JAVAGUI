import java.util.*;

public class DictionaryTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = "";
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			 input = s.next();
			 if(input.equals("�׸�")) {
				 break;
			 }
			 System.out.println(DictionaryExecute.kor2Eng(input));
		}
		System.out.println("���α׷� ����");
		s.close();
	}

}


class DictionaryExecute{
	private static String [] kor = {"���","���","��","�̷�","���","�Ʊ�"};
	private static String [] eng = {"love","person","money","future","hope","baby"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return word + "��(��) " + eng[i];
			}
		}
		return word+"��(��) ���� ������ �����ϴ�.";
	}

}

// teacher's version
//  Test�κп��� String eng = Execute.kor2Eng(kor)����
//  Execute���� �ܾ null�� ��ȯ ����
//  Test���� null�̶�� ����, null�� �ƴϸ� ������ ���