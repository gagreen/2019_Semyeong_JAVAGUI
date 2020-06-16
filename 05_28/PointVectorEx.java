import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3)); //마지막 부분에 추가
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1); //index Numbering은 0부터 시작
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p); // Point 클래스의 toString()메서드
		}
	}

}
