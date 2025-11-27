package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//클래스 배열 응용편1

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
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(al);
		//System.out.println(al);
		for(int i = 0; i<al.size(); i++) {
			if(al.get(i)%2==1) { //get은 class 배열 / 원시배열은 번호로 찍어서 가져옴.
				System.out.println(al.get(i));
			}
		}		
	}

}
