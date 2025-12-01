package array;

import java.util.HashMap;
import java.util.Map;

//Map: 인터페이스 배열 키 오브젝트가 있는 배열(hashmap, hashtable, treemap)
//원시배열은 키가 없음
//map은 key 이름 중복 시 에러가 발생할 수 있음.

public class array12 {

	public static void main(String[] args) {
		Map<String, String> all = new HashMap<String, String>();//Map<key 값, value 값>
		all.put("user", "박순수");
		all.put("area", "자양동");
		System.out.println(all);
		System.out.println(all.get("user"));
		System.out.println(all.get("area"));
		all.put("user", "허대회");
		System.out.println(all);
		
		Map<String, Integer> data = new HashMap<String, Integer>();//키는 문자로 받지만 데이터는 숫자로 받겠다 이렇게도 작성할 수 있음.
		data.put("number", 5000);
		data.put("point", 60000);
		System.out.println(data);
		System.out.println(data.get("number")); //get("키이름")
		data.remove("number"); //map은 무조건 키 이름을 가져와야지 데이터를 끌고 올 수 있다. 이렇게 작성하면 number키의 데이터값이 삭제됨.
		System.out.println(data);
		//찾고자 하는 키를 확인할 때 사용 => true or false만 뜬다.
		System.out.println(data.containsKey("number")); //data배열에 key값인 number 값이 있는지 근데 키를 remove했으니 false가 뜬다.
		System.out.println(data.keySet()); // 배열 안에 키가 뭐가 있는지 볼 수 있음. / 해당 배열에 키 이름만 가져옴.
		data.put("coupon", 50);
		System.out.println(data.size()); //map size()는 키의 갯수를 파악에서 출력시킴.
		System.out.println(data.containsKey("point"));
		
	}

}
