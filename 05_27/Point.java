class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//EqualsEx예제를 위해
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;
		}
		return false;
	}
}