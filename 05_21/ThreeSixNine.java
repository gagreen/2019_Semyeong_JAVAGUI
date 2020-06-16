
public class ThreeSixNine {

	public static void main(String[] args) {
		int count =0;
		String [] str = {" 박수 짝", " 박수 짝짝"};
		String temp;
		for(int i=1; i<100; i++) {
			count=0; //369가 나온 횟수
			temp = i+""; // i를 문자열로 전환

			for(int j=0; j<temp.length(); j++) {
				if(temp.charAt(j) == '3' || temp.charAt(j)=='6' || temp.charAt(j)=='9') {
					count++;
				}
			}
			if(count != 0) {
				System.out.println(i + str[count-1]);
			}
			
		}
		
		// teacher's version
		int res, num, numberOf369=0;
		for(int i=1; i<100; i++) {
			num = i; // 반복문을 보존하기 위해서 새로운 변수에 대입
			for(res= num%10; num>0; res = num%10) { // 각 자리만큼 반복
				if(res == 3 || res == 6 || res == 9) {
					numberOf369++;
				}
				num /= 10;
			}
			if(numberOf369 > 0) { // 369가 하나 이상일 떄
				System.out.println(i + str[numberOf369-1]);
			}
			numberOf369 = 0; //초기화
		}
		

	}

}
