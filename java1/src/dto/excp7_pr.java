package dto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
응용문제 2
메인에서는 다음과 같이 실행이 되어야 합니다.
[실행]
"숫자를 입력해 주세요: " => 총 6회

해당 6회 숫자를 모두 입력 시 해당 배열의 데이터를 excp7_box에 전달합니다.
해당 숫자를 모두 더한 값에서 짝수일 경우 "짝수의 값 입니다." 라고 출력하며, 홀수 값이 발생 하였을 경우
올바른 값이 아닙니다." 라는 메세지를 출력합니다.
단, 숫자가 아닌 문자로 처리 되었을 경우 예외처리가 발생 해야 합니다.

[힌트]
1. excp7에서 scanner 및 빈 클래스 배열이 적용
2. excp7에서 사용자가 총 6회 질문에 숫자를 입력함
3. 6개의 배열 데이터가 완료 되었을 경우 excp7_box에 메소드로 전달(클래스 배열)
4. 해당 배열 중 모든 배열 값을 더함.
5. 짝수, 홀수에 대한 결과값을 출력
6. 숫자가 아닌 문자로 사용자가 입력한 값은 예외처리 해야함.
http://mekeyace.kbsn.or.kr/excp.txt
*/
public class excp7_pr {

	public static void main(String[] args) {
		excp7_pr_box epb=new excp7_pr_box();
		epb.aaa();

	}

}

class excp7_pr_box{
	ArrayList<Integer> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void aaa() {
		while(true) {
		System.out.println("숫자를 입력해주세요(배열 모두 입력시 -1 입력 하면 종료됨.): ");
		String i= sc.next();
		if(i.equals("-1")) {
			break;
		}
		try {
			int b = Integer.parseInt(i);
			list.add(b);
	
		}catch(NumberFormatException ie) {
			System.out.println("문자는 입력할 수 없습니다. 숫자로 다시 입력하세요");
		}
		}
		
		//System.out.println(list);
		excp7_box_pr eb = new excp7_box_pr();
		eb.input(list);
	}
}





