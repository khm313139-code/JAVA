package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//응용편
//다음 배열 데이터를 이용하여 결과와 동일하게 출력 되도록 코드를 작성하시오
//1번 데이터: 100,55,67,90,13,7
//2번 데이터: 9,16,22,31

//결과
//[100,90,67,55,31,22,16,13,9,7]
public class array4 {

	public static void main(String[] args) {
//		ArrayList<Integer> al2=new ArrayList<Integer>(); //문자 형태의 클래스 배열
//		al2.add(100);
//		al2.add(55);
//		al2.add(67);
//		al2.add(90);
//		al2.add(13);
//		al2.add(7);
//		//System.out.println(al2);
//		
//		ArrayList<Integer> al3=(ArrayList)al2.clone();
//		al3.add(9);
//		al3.add(16);
//		al3.add(22);
//		al3.add(31);
//		//System.out.println(al3);
//		
//		Collections.sort(al3,Collections.reverseOrder());
//		System.out.println(al3);
		
		
		//강사님 코드
		Integer a[]= {100,55,67,90,13,7};
		Integer b[]= {9,16,22,31};
		
//		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(a)); //원시배열을 클래스 배열로 만들어 버림
//		
//		int f;
//		for (f=0; f<b.length; f++) {
//			all.add(b[f]);
//		}
//		System.out.println(all);
//		Collections.sort(all,Collections.reverseOrder());
//		System.out.println(all);
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(b));
		al.addAll(al2);//클래스와 클래스를 합칠대는 addALL을 사용한다. 기존 클래스배열 + 추가 클래스배열 모두 합쳐서 사용하는 메소드
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}
