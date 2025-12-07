package ex;

import java.util.Scanner;

/*
외부 클래스를 이용하여 다음과 같이 작동되는 코드를 작성하시오.
[실행]
"패스워들 입력하세요: "

[결과] - return 메소드 활용
1. 패스워드가 4자리 이하일 경우: "패스워드는 4자리 이상 입력하셔야 합니다."
2. 패스워드가 5자리 이상일 경우: "패스워드가 올바르게 등록 되었습니다.
*/
public class ex_혼자해보기 {

	public static void main(String[] args) {
		ex_혼자해보기_box eb = new ex_혼자해보기_box();
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요: ");
		String pw= sc.next();
		System.out.println(eb.aaa(pw));

	}

}

class ex_혼자해보기_box {
	public String aaa(String pw) {
		String msg="";
		if(pw.length()<=4) {
			msg="패스워드는 4자리 이상 입력하셔야 합니다.";
		}
		else {
			msg="패스워드가 올바르게 등록 되었습니다.";
		}
		return msg;
		
	}
}