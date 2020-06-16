class Point{
	private int x, y;
	
	public Point() { // 기본 생성자
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) { // 생성자
		super(x, y); // Point의 생성자 불러오기
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint(); // 슈퍼 클래스의 메서드
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue"); // 객체 생성
		cp.showColorPoint();

	}

}
