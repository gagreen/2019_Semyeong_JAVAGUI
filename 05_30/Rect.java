
public class Rect implements Shape{
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("ũ�Ⱑ " + width + "x" + height + "�� �簢���Դϴ�.");
		
	}

	@Override
	public double getArea() {
		return width*height;
	}
}
