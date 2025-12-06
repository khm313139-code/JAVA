package week_broadcast1206;

import java.util.*;

public class week2 {

	public static void main(String[] args) {
		String member[][]= {
				{"홍길동","hong@nate.com","01012223445"},
				{"강감찬","kang@naver.com","01011103445"},
				{"이순신","lee@hotmail.com","01011544445"},
				{"유관순","kunsoon@hotmail.com","01011244445"}
		};
		//책내용
//		ArrayList<String> al = new ArrayList<String>();
//		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		
		//실무내용 - 한번에 2차 클래스 배열로 만들기
		ArrayList<String[]> all = new ArrayList<String[]>(Arrays.asList(member));
		System.out.println(Arrays.toString(all.get(1)));
		System.out.println(all.size());
		System.out.println(Arrays.deepToString(all.toArray()));
		System.out.println(all.get(0)[0]);
	}
}
