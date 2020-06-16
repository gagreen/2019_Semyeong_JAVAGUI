
public interface Shape {
	final double PI = 3.14;
	void draw(); // 도형 그리기 추상메서드
	double getArea(); // 도형 면적 리턴 추상메서드
	default public void redraw() { // default 메서드
		System.out.print("--다시 그립니다. ");
		draw(); 
	}
}
