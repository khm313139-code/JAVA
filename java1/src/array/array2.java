package array;

import java.util.ArrayList;
import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		//ArrayList : 클래스 배열 중 하나의 형태 
		/*
		add: 배열에 데이터를 추가
		remove: 배열에 데이터를 삭제
		size: 배열에 데이터 전체 갯수
		clear: 배열에 데이터를 초기화
		get: 배열에 특정 노드번호를 적용하여 데이터 출력 
		*/
		ArrayList<Integer> al=new ArrayList<Integer>(); //숫자 형태의 클래스 배열
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		System.out.println(al);
		al.remove(2); //remove(배열번호)
		System.out.println(al);
		System.out.println(al.get(1)); //get(배열번호)
		System.out.println(al.size()); 
		//배열 길이는 length가 없어졌음 length는 원시배열에만 사용됨
		//클래스 배열은 size로 사용
		al.clear();
		System.out.println(al);
		
		
		ArrayList<String> al2=new ArrayList<String>(); //문자 형태의 클래스 배열
		al2.add("권하민");
		al2.add("김고은");
		al2.add("김동완");
		al2.add("김예빈");
		System.out.println(al2);
		
		
		
		// 배열 + 배열
		// clone(): 기존에 있는 클래스 배열을 복하는 기능
		
		ArrayList<String> al3= (ArrayList)al2.clone(); //할당할때 new 사용안함 / new 쓰면 초기화가 되어버림
		//clone(); al2를 복제해서 al3에 넣어라
		al3.add("허대회");
		al3.add("박순수");
		al3.add("신범석");
		System.out.println(al3);
		
		
		
		//원시배열 => 클래스 배열 변환
		//Arrays.asList(data) => 원시 배열 값을 클래스 배열로 모든 데이터를 변환시킬 때 사용
		Integer data[]= {100,200,300,400};
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(all);
		all.set(2, 500); //set(배열번호, 데이터값); => 기존에 있는 배열번호의 값이 변경됨.
		System.out.println(all);
		all.add(2,600); //add(배열번호, 데이터 값) => 해당 배열 번호 기준으로 데이터가 삽입됨.
		System.out.println(all);
		
		
		
		
		
	}
}
