package re_java;
//클래스 배열 응용편1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
응용문제1

다음 배열 데이터를 확인 후 홀수 데이터만 출력을 해야 합니다.  
단, 홀수 데이터는 올림차순 정렬로 결과가 출력 되도록 코드를 작성하시오.

Integer data[] = {10,16,9,7,31,45,27,94,86,87,112,100,3};

[결과]
3,7,9,27,31,45,87
*/


public class array7 {

	public static void main(String[] args) {
		Integer data[] = {10,16,9,7,31,45,27,94,86,87,112,100,3};
		array7_box ab=new array7_box();
		ab.aaa(data);
	}

}



class array7_box{
	ArrayList<Integer> all =null; //객체명만 사용
	public void aaa(Integer b[]) {
		//System.out.println(Arrays.toString(b));
		this.all = new ArrayList<Integer>(); //new 숫자 배열 생성
		for(Integer c:b) { //foreach 배열 전용 반복문
			//System.out.println(c);
			if(c%2==1) {
				this.all.add(c);
			}
		}
		//System.out.println(this.all);
		Collections.sort(this.all); //Collections: 클래스배열 정렬
		Collections.sort(this.all,Collections.reverseOrder());
		System.out.println(this.all);
	}
}


