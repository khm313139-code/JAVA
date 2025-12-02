package dto;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 응용문제 1
 * 예외처리를 이용하여 다음사항에 필요한 프로세서 코드를 작성합니다.
 * 사용자가 은행에 입금을 시도 합니다.
 * 
 * [실행]
 * 금액을 입력하세요: 1000
 * 금액을 입력하세요: 500
 * 금액을 입력하세요: 6000
 * "종료"라고 입력시 다음과 같이 결과가 나오면 됩니다.
 * 
 * [결과]
 * [1000,500,6000]
 * 
 * 단, 사용자가 금액을 입력시 문자로 입력할 경우 예외처리 발생하여 다시 처음부터 실행 되도록 합니다.
 */
public class excp3_pr {

	public static void main(String[] args) {
		excp3_pr_box epb=new excp3_pr_box();
		epb.aaa();
	}

}


class excp3_pr_box{
	Scanner sc = new Scanner(System.in);
	ArrayList<Object> ar=new ArrayList<>();
	
	public void aaa() {
		
		while(true) {
		System.out.println("금액을 입력하세요: ");
		String a=this.sc.next();
		if(a.equals("종료")) {
			break;
		}
		try {
			int num = Integer.parseInt(a);
			ar.add(num);
		}catch(Exception e) {
			System.out.println("잘못된 접근입니다. 숫자만 입력 바랍니다.");
		}
		} 
		System.out.println("결과: "+ar);
		sc.close();
	}
}

