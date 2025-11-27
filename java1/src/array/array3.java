package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//원시배열 -> 클래스 배열 이관 후 정렬
public class array3 {

	public static void main(String[] args) {
		Integer data[]= {3,1,6,5,9,11,16,12,4};
		//Collections: 라이브러리 클래스를 활용하여 데이터를 정렬할 수 있음.
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(al);
		Collections.sort(al); //오름차순으로 정렬
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder()); //내림차순으로 정렬
		System.out.println(al);
		
		
		String user[]= {"허대회","신범석","권하민","김고운","박순수","김동완","김예빈"};
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(user)); //원시배열을 클래스 배열로 만들어버림
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
		
		
		ArrayList<Long> all = new ArrayList<Long>();
		long w=0L; //long은 L 붙여야함
		while(w<100) {
			all.add(w);
			w++;
		}
		System.out.println(all);
		
		
		
	}

}
