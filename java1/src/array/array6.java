package array;

import java.util.ArrayList;

//2차 클래스 배열
public class array6 {

	public static void main(String[] args) {
		//2차 클래스 배열을 선언(빈 배열)
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>(); //비어있는 2차 클래스 배열
		//1차 클래스 배열을 선언
		ArrayList<Integer> al= new ArrayList<Integer>(); //1차 클배 만들고 2차 클배에 넣어야함
		al.add(100);
		al.add(200);
		al.add(300);
		//System.out.println(al);
		
		all.add(al); //1차 클래스에 등록된 배열 값을 2차 클래스에 삽입
		//System.out.println(all);
		
		ArrayList<Integer> a2= new ArrayList<Integer>(); //신규 1차 클래스
		a2.add(1000);
		a2.add(2000);
		a2.add(3000);
		all.add(a2); //신규 1차 클래스 값을 2차 클래스에 삽입
		System.out.println(all);
	}

}
