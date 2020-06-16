
public class WrapperEx {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2='F';
		if(Character.isDigit(c1)) { // 숫자라면
			System.out.println(c1 + "는 숫자");
		}
		if(Character.isAlphabetic(c2)) { // 알파벳이면
			System.out.println(c2 + "는 영어");
		}
		
		System.out.println(Integer.parseInt("-123")); // 문자열을 정수로
		System.out.println(Integer.toHexString(28)); // 2진수 문자열로
		System.out.println(Integer.toBinaryString(28)); // 16진수 문자열로
		System.out.println(Integer.bitCount(28)); // 2진수 중 1의 개수 
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); // 3.14를 "3.14"로
		System.out.println(Double.parseDouble("3.14")); // 문자열을 숫자로
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); // b를 문자열로 전환
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 boolean형태로 전환

	}

}
