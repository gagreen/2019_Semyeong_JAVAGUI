import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3)); //������ �κп� �߰�
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1); //index Numbering�� 0���� ����
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p); // Point Ŭ������ toString()�޼���
		}
	}

}
