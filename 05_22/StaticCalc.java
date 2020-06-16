
public class StaticCalc {
	
	public static int abs(int a) { //Àý´ñ°ª
		return (a>0)?a:-a; 
	}
	public static int max(int a, int b) { // ÃÖ´ñ°ª
		return (a>b)?a:b;
	}
	public static int min(int a, int b) { // ÃÖ¼Ú°ª
		return (a>b)?b:a;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticCalc.abs(-5));
		System.out.println(StaticCalc.max(-159654, 0));
		System.out.println(StaticCalc.min(-159654, 159654));
	}

}
