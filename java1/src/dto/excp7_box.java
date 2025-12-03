package dto;
//model - 모델에서는 절대 static void main을 사용하지 않는다.
//play는 무조건 controller에서 써야한다.
//static void main 없는건 실행 자체 시킬 필요도 없고 실행이 되지도 않는다.
import java.util.ArrayList;

public class excp7_box {

	//숫자 또는 문자를 검토하는 메소드
	public Integer user_check(String userkey) throws Exception{
		Integer n = 0;
		try {
			n= Integer.valueOf(userkey);
			
			
		}catch(Exception e) {
			n=null;
		}
		
		return n;
	}
	
	//model - method(result) - 해당 6개의 배열 데이터를 연산처리 하는 메소드
	public void result(ArrayList<Integer> data) {
		System.out.println(data);
		/* 짝수, 홀수에 대한 결과값에 대한 문제집 : http://mekeyace.kbsn.or.kr/excp.txt */
	}
}












/*
public class excp7_box {
	public void input(ArrayList<Integer> a) {
		int sum = 0;
			for (int i=0; i<a.size(); i++) {
				
			//System.out.println(i);
			int num = a.get(i);
			sum+=num;
			
			}
		//System.out.println(sum);
		if(sum%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
			
		}
	}
}*/

