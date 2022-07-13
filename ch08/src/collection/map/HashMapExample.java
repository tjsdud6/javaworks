package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map의 객체 map 생성
		//순서가 없고, 중복 불가 (key는 불가, value는 가능)
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("이순신", 85);
		map.put("홍길동", 90);
		map.put("강감찬", 80);
		map.put("홍길동", 75);
		
		System.out.println("총 객체 수: " + map.size());
		
		//객체 1개 찾기
		System.out.println("\t홍길동: " + map.get("홍길동"));
		System.out.println();
		
		//전체 객체 출력
		//Set<String> keySet = map.keySet();
		//반복자 얻기
		//Iterator<String> iterator = keySet.iterator();
		
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next(); //1개의 키를 가져와서 
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동"); //키를 삭제
		System.out.println("총 객체 수: " + map.size());
		
		//자료 존재 유무
		if(map.containsKey("이순신")) {
			System.out.println("자료 있음");
		}else {
			System.out.println("자료가 확인되지 않습니다.");
		}
		
		//향상 for문
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
