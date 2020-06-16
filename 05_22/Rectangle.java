
public class Rectangle {
	
	int x, y, width, height;
	public Rectangle(int x, int y, int width, int height) {
		this.x = x; 
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() { //Rectangle ��ü�� ���̸� ���
		return width * height;
	}
	
	public void show() { //Rectangle ��ü�� ������ ���
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "X" + height + "�� �簢��");
	}
	
	public boolean contains(Rectangle r) { // ���� ��ü �ȿ� r��ü�� �����Ѵٸ� true, �ƴϸ� false
		if((this.x < r.x && r.x+r.width < this.x+this.width )/*����*/&&
				(this.y < r.y && r.y+ r.height <this.y+this.height)/*����*/) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������" + s.square());
		if(t.contains(r)) {
			System.out.println("t�� r�� ����");
		}
		if(t.contains(s)) {
			System.out.println("t�� s�� ����");
		}
	}

}
