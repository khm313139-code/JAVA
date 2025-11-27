package method;

import java.util.Arrays;

//foreach 배열 반복문
public class method14 {

	public static void main(String[] args) {
		//1차 배열
		int number[]= {90,22,11,6}; //숫자 원시배열
		
		for(int a : number) { //1차 원시 배열일 경우 [] 배열 기호 없이 사용
			System.out.println(a);
		}
		//2차 배열 반복문: 그룹 단위에 오름차순, 내림차순으로 사용은 없는 상황 / 단점: 역순이 없다.
		Object data[][]= {
				{"park","박순수",1000},
				{"hur","허대회",6000},
				{"kwon","권하민",60000}
		};
		
		//2차 배열을 foreach 그룹 단위로 반복시킴
		for(Object b[]: data) { //2차 배열을 각각의 1차 배열로 분해
			System.out.println(Arrays.toString(b)); //1차 배열 전체 데이터를 출력
		}
	}

}
