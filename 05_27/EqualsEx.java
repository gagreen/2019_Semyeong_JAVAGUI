
public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a == b) { // 가리키는 주소를 비교하므로 false 반환
			System.out.println("a==b");
		}
		if(a.equals(b)) { // 객체의 내용을 비교하므로 true 반환
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) { // false 반환
			System.out.println("a is equal to c");
		}

	}

}
