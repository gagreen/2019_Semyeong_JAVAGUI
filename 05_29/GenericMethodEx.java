
public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){ // T가 타입 매개변수인 제네릭 메서드
		GStack<T> s = new GStack<T>(); // 스택 a를 반대로 저장할 목적 GStack 생성
		while(true) {
			T tmp;
			tmp = a.pop(); // 매개변수로 받아온 원래 스택에서 하나 꺼내기
			if(tmp == null) { // 스택이 비어있다면
				break;
			}else {
				s.push(tmp); // 새 스택에 요소 삽입
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		
		gs = reverse(gs); // 컴파일러가 타입 매개변수를 Double로 유추
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}

	}

}
