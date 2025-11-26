package method;

import java.util.Scanner;

/*
 * 제공된 배열을 상수로 적용하여 다음과 같은 결과가 나오도록 코드를 작성합니다.

[배열 데이터]
{"hong","kim","park","jang"},
{"a1234","b1234","c1234","abc1234"},
{"1000","1500","2000","4500"}

Scanner을 이용하여 다음과 같이 출력되도록 합니다.

[실행]
아이디를 입력하세요 : 
패스워드를 입력하세요 : 

[결과]
[실패일 경우]
아이디 와 비밀번호를 다시한번 확인 하세요!

[성공일 경우]
포인트 2000 점 있습니다.
 */

public class method13 {

	public static void main(String[] args) {
		method_box13 mc=new method_box13();
		mc.bbb();
	}


}



class method_box13{
	Scanner sc=new Scanner(System.in);
	public void bbb() {
		
		String login[][]= {
				{"hong","kim","park","jang"},
				{"a1234","b1234","c1234","abc1234"},
				{"1000","1500","2000","4500"}
		};
		String id;
		String pw;
		System.out.println("아이디를 입력하세요: ");
		id=sc.next();
		System.out.println("비밀번호를 입력하세요: ");
		pw=sc.next();
		
		for(int i=0; i<login[0].length; i++) {
		//System.out.println(i);
		if(login[0][i].equals(id)&&login[1][i].equals(pw)) {
			System.out.println("로그인 성공! 포인트: "+ login[2][i]);
			break;
		}
		
		if(i==login[0].length-1) {
			System.out.println("아이디와 비번 다시 확인");
		}
		}
		
		}
	}

		
		
	

