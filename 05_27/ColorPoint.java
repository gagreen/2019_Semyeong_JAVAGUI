public class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	public String toString() {
		return color + "���� (" + getX() + "," + getY() + ")�� ��";
	}
	
	
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");

	}

}
