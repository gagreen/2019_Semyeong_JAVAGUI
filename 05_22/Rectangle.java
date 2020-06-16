
public class Rectangle {
	
	int x, y, width, height;
	public Rectangle(int x, int y, int width, int height) {
		this.x = x; 
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() { //Rectangle 객체의 넓이를 출력
		return width * height;
	}
	
	public void show() { //Rectangle 객체의 정보를 출력
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "X" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) { // 현재 객체 안에 r객체를 포함한다면 true, 아니면 false
		if((this.x < r.x && r.x+r.width < this.x+this.width )/*가로*/&&
				(this.y < r.y && r.y+ r.height <this.y+this.height)/*세로*/) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은" + s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함");
		}
		if(t.contains(s)) {
			System.out.println("t는 s를 포함");
		}
	}

}
