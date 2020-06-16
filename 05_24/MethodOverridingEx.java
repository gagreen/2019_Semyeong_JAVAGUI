class Shape {
	public Shape next;
	public Shape() { next = null; }
	
	public void draw() { 
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { //Shape의 draw()메서드 오버라이딩
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
	
	static void paint(Shape p) { //서브 클래스이므로 슈퍼 클래스 Shape타입의 매개변수로 넘어올수 있다
		p.draw(); // 동적 바인딩으로 Shape의 draw()뿐만 아니라, 상속받은 draw()를 실행시킴
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
