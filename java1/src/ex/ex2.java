package ex;

import java.util.ArrayList;
import java.util.Arrays;

import oop_class.inter1;

public class ex2 {

	public static void main(String[] args) {
		String word = "1,2,3,4,5";
		String arr[] = word.split(","); //단어 기준으로 배열화 시킴
		System.out.println(Arrays.toString(arr));
		
		
		//replace: 문자를 다른 단어로 변경(찾을 단어, 변경할 단어)
		String address = "서울 특별시 마포구 마포동";
		String result = address.replace("마포", "mapo");
		System.out.println(result);
		
		String code="010abcd12k4";
		String result2 = code.replaceAll("[a-zA-Z]", "*");
		System.out.println(result2);
		
		String name = "shin서하";
		String result3 = name.replaceAll("[ㄱ-ㅎㅏ-ㅣ가-힣]",""); //이렇게 하면 가능하다.
		System.out.println(result3);
		
		
		//^: 부정을 말하며 해당 배열 외에 단어를 말한다.
		String id = "홍吉dong*";
		String result4 = id.replaceAll("[^a-zA-Z0-9]", ""); //^는 이거 외에는 다 지우라는 의미
		System.out.println(result4);
		
		
		
		//박싱과 언박싱 속도 비교
		//boxing, unboxing 상태의 속도 차이
		long start = System.currentTimeMillis();
		//long sum = 0L;
		Long sum = 0L;
		for(long i =0; i<10000000; i++) {
			sum +=i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		//Integer.valueOf(0);
		//Integer.parseInt();
		
		int no = 55;
		//String Munja = String.valueOf(no);
		String Munja = Integer.toString(no); //이거는 속도가 현저히 느려진다.
		System.out.println(Munja);
		
		
		
		ArrayList<Integer> all = null;
		Integer no1 =all.get(0); //형을 맞춰줘야 깔끔해지는 부분이다.
		
		
	}

}
