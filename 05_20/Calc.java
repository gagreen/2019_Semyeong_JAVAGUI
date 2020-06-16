
public class Calc {
	public static void main(String[] args) {
		double sum = 0D;
		
		for(int i=0; i<args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("гу╟Х: " + sum);

	}
}