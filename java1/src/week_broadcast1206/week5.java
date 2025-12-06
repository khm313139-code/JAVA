package week_broadcast1206;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//클래스 배열 자료형
public class week5 {
	public static void main(String[] args) { //1번 실행
		test_box tb = new test_box();
		Integer result = (Integer)tb.user(100);
		//System.out.println(result);
		String result2 = (String)tb.user("홍길동");
		//System.out.println(result2);
		float result3 = (float)tb.user(0.61f);
		//System.out.println(result3);
		
		
		
		//메소드 하나에 다 던지는 중
		List<String> userdata = tb.box("자바");
		System.out.println(userdata);
		
		ArrayList<Integer> userno = tb.box(500);
		System.out.println(userno);
		
		ArrayList<Double> sales = tb.box(0.56);
		System.out.println(sales);
		
		List<ArrayList<String>> db = tb.box2("홍길동");
		System.out.println(db);
		
	}

	}


class test_box extends ex3_box{ //2번 실행
	@Override
	public <T> Object user(T data) {
		if(data instanceof String) { //이 자료형으로 조건문 돌리겠다.
		//if(data.getClass()== String.class) {
			String total = "리턴값 회신: " + data;
			return total;
		}
		else if(data instanceof Float) {
			float total = 0.99f+(Float)data;
			return total;
		}
		
		
		else {
			Integer total = 100+(Integer)data;
			return total;
		}
	}
	@Override
	public <T> ArrayList<T> box(T data) {
		return super.box(data);
	}
}



abstract class ex3_box{ //3번 실행 - 이렇게 만들면 멀티 메소드임
	public <T> Object user(T data) {
		return data;
	}
	public <T> ArrayList<T> box(T data){
		ArrayList<T> all = new ArrayList<T>();
		all.add(data);
		return all;
	}
	
	//2차 배열 make
	public <T> List<ArrayList<T>> box2(T data){
		List<ArrayList<T>>  all = new ArrayList<ArrayList<T>>();
		
		ArrayList<T> al = new ArrayList<T>();
		al.add(data);
		al.add((T) "1000");
		al.add((T) "1");
		all.add(al);
		
		return all;
	}
}