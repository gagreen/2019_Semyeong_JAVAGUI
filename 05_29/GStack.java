
public class GStack <T> {
	int tos;
	Object [] stck;
	public GStack() { // �����ڷ� �ʱ�ȭ
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) { // ���� ��� ����
		if(tos == 10) { // ������ ũ�⸦ �ʰ��Ͽ� ���� �Ұ�
			return;
		}
		stck[tos] = item; 
		tos++;
	}
	
	public T pop() { // ������
		if(tos == 0) { // ������ ��� �־ null ����
			return null;
		}
		tos--;
		return (T)stck[tos]; // Ÿ�� �Ű������� ĳ����
	}
}
