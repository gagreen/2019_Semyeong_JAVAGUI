import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) { //다음 요소가 있다면 true 리턴
			int n = it.next(); // 다음 요소 리턴
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		
		System.out.println("벡터에 있는 정수 합: " + sum);

	}

}
