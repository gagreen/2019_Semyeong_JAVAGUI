class Shape {
	public Shape next;
	public Shape() { next = null; }
	
	public void draw() { 
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { //Shape�� draw()�޼��� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	
	static void paint(Shape p) { //���� Ŭ�����̹Ƿ� ���� Ŭ���� ShapeŸ���� �Ű������� �Ѿ�ü� �ִ�
		p.draw(); // ���� ���ε����� Shape�� draw()�Ӹ� �ƴ϶�, ��ӹ��� draw()�� �����Ŵ
	}

	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());

	}

}
