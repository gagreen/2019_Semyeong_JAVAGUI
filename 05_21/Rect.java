
public class Rect {
	int width, height;
	
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rect [] r = new Rect[5];
		
		for(int i=1; i<r.length; i++) {
			r[i] = new Rect(i, i*2);
			System.out.println(r[i].getArea() + " ");
		}

	}

}
