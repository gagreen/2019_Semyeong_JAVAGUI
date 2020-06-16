
public class ObjectPropertyEx {
	public static void print(Object obj) { // 업 캐스팅으로 매개변수 받음
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}

}
