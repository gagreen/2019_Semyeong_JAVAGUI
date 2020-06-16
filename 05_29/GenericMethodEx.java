
public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){ // T�� Ÿ�� �Ű������� ���׸� �޼���
		GStack<T> s = new GStack<T>(); // ���� a�� �ݴ�� ������ ���� GStack ����
		while(true) {
			T tmp;
			tmp = a.pop(); // �Ű������� �޾ƿ� ���� ���ÿ��� �ϳ� ������
			if(tmp == null) { // ������ ����ִٸ�
				break;
			}else {
				s.push(tmp); // �� ���ÿ� ��� ����
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		
		gs = reverse(gs); // �����Ϸ��� Ÿ�� �Ű������� Double�� ����
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}

	}

}
