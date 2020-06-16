
public class Rect implements Shape{
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("크기가 " + width + "x" + height + "인 사각형입니다.");
		
	}

	@Override
	public double getArea() {
		return width*height;
	}
}
