package week_broadcast1206;
//클래스 배열: list(부모 클래스): arraylist, linkedlist, vector

import java.util.*;

public class week3 {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("자바");
		all.add("스프링");
		all.remove(0);
		//System.out.println(all);
		
		//stack은 상위 클래스임 - arraylist와 linkedlist결합
		Stack<String> all2 = new Stack<String>(); //stack 이라는 배열 클래스가 또 있다.
		//stack은 lifo임 후입 선출
		
		all2.add("홍길동");
		all2.add("강감찬");
		all2.add("유관순");
		if(all2.empty()==true) { //true: 값이 없는 상황
			//System.out.println("해당 배열에 값이 없습니다.");
		}
		all2.add(3,"이순신");
		all2.pop();
//		System.out.println(all2.peek()); //배열에 제일 마지막 데이터 값 출력
//		System.out.println(all2);
//		System.out.println(all2.search("홍길동")); //검색 -1뜨면 배열에 이순신 없다. 값이 있는지 없는지 파악 가능
//		System.out.println(all2.search("강감찬"));
//		System.out.println(all2.search("유관순")); //들어온 순서로 검색함 선입후출?
		
		int f = 0; //왜 반복돌릴때 이순신은 안나옴? pop을 쓰면 배열값이 완전히 바뀜
		//가져오는데 pop쓰면 배열 값이 완전히 비어버림
		//get하고는 느낌이 다름
		//pop을 쓰면 정수 변수 하나 선언해서 처리해야함.(후입선출이라 이렇게 처리해야함)
		int no = all2.size();
		while(f<no) {
			System.out.println(all2.pop());
			f++;
		}
		List<String> all3 = new Stack<String>(); //이렇게 붙일수도 있음.
	}
}
