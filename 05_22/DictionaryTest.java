import java.util.*;

public class DictionaryTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = "";
		System.out.println("한글 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			 input = s.next();
			 if(input.equals("그만")) {
				 break;
			 }
			 System.out.println(DictionaryExecute.kor2Eng(input));
		}
		System.out.println("프로그램 종료");
		s.close();
	}

}


class DictionaryExecute{
	private static String [] kor = {"사랑","사람","돈","미래","희망","아기"};
	private static String [] eng = {"love","person","money","future","hope","baby"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return word + "은(는) " + eng[i];
			}
		}
		return word+"은(는) 저의 사전에 없습니다.";
	}

}

// teacher's version
//  Test부분에서 String eng = Execute.kor2Eng(kor)으로
//  Execute에서 단어나 null을 반환 시켜
//  Test에서 null이라면 없음, null이 아니면 번역본 출력