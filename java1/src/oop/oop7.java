package oop;

import java.util.Scanner;

/*응용문제1
외부 클래스를 사용하여 로그인이 가능한 조건문 코드를 작성하시오.
단, 외부 클래스 명은 user_login 입니다.

[실행]
아이디를 입력하세요:
패스워드를 입력하세요:

로그인 하셨습니다. or 회원정보가 맞지 않습니다.

id: java
pass: a123456
*/

public class oop7 {

	public static void main(String[] args) {
		user_login ob=new user_login();
		ob.problem();
	}

}




//class user_login{
//	String id="";
//	String pass="";
//	public void problem() {
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("아이디를 입력하세요: ");
//		this.id=sc.next();
//		
//		
//		if(this.id.equals("홍길동")) {
//			System.out.println("비밀번호를 입력하세요: ");
//			this.pass=sc.next();
//			//System.exit(0);
//			if(this.pass.equals("a123456")){
//				System.out.println("로그인처리 되셨습니다.");
//			}
//	
//			else {
//				System.out.println("비밀번호 재입력");
//			}
//			
//		}	
//		else {
//			System.out.println("회원정보가 맞지 않습니다.");
//		}
//	}
//}
//강사님 코드	
class user_login{
	private String id, pass;
	
	public void problem() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요: ");
		this.id=sc.next(); //사용자가 직접 입력한 값을 userid라는 변수 전달
		
		System.out.println("비밀번호를 입력하세요: ");
		this.pass=sc.next();
		
		if(this.id.equals("java") && this.pass.equals("a123456")) {
			//System.exit(0);
			System.out.println("로그인처리 되셨습니다.");
			}
	
		else {
			System.out.println("회원정보가 맞지 않습니다.");
		}
		sc.close(); //해당 라이브러리를 종료
	}
}	
		
		
