
public class GStack <T> {
	int tos;
	Object [] stck;
	public GStack() { // 생성자로 초기화
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) { // 스택 요소 삽입
		if(tos == 10) { // 스택의 크기를 초과하여 삽입 불가
			return;
		}
		stck[tos] = item; 
		tos++;
	}
	
	public T pop() { // 꺼내기
		if(tos == 0) { // 스택이 비어 있어서 null 리턴
			return null;
		}
		tos--;
		return (T)stck[tos]; // 타입 매개변수로 캐스팅
	}
}
