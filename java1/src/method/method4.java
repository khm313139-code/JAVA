package method;

import java.util.Scanner;

/*
응용편 - return 메소드 필수이며, 결과는 메인 메소드에서 출력

[실행]
"고객명을 입력하세요: "

[결과]
김우빈 => 일반회원
송중기 => 실버회원
김옥빈 => VIP회원
유해진 => 탈퇴회원
그 외에 이름을 입력시 "미가입 회원" 출력하면 됩니다.
*/

public class method4 {

	public static void main(String[] args) {
		method4_box mb=new method4_box();
		Scanner sc=new Scanner(System.in);
		System.out.println("고객명을 입력하세요: ");
		String name=sc.next();
		String msg=mb.aaa(name);
		System.out.println(msg);
		sc.close();
	}

}



class method4_box{
	String msg="";
	public String aaa(String name) { //고객명을 입력을 받으니 매개변수는 하나만 필요
		if(name.equals("김우빈")) {
		msg = "=> 일반회원";
		}
		else if(name.equals("송중기")) {
		msg = "=> 실버회원";
		}
		else if(name.equals("김옥빈")) {
			msg = "=> VIP 회원";
		}
		else if(name.equals("유해진")) {
			msg = "=> 탈퇴회원";
		}
		else {
			msg = "미가입 회원";
		}
		return msg;
	}
	
}





