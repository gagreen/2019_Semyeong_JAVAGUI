import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("임근태", 99);
		scoreMap.put("김민성", 100);
		scoreMap.put("김명동", 7);
		scoreMap.put("김중동", 87);
		
		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
		
		Set<String> keys = scoreMap.keySet(); // 키를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); // Set에 있는 모든 key를 순서대로 검색
		
		while(it.hasNext()) { // 다음 요소가 있으면 true 리턴
			String name = it.next();
			int score = scoreMap.get(name); //name Key에 해당하는 value 리턴
			System.out.println(name + " : " + score);
		}

	}

}
