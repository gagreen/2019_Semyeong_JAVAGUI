
public class Oval implements Shape{
	int width, height;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println(width + "x" + height + "�� �����ϴ� Ÿ���Դϴ�.");
		
	}

	@Override
	public double getArea() {
		return (width/2) * (height/2) * PI;
	}
	
}
