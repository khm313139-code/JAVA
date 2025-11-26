package oop;

import java.util.Scanner; //외부에서 사용하는 라이브러리를 호출 (class도 가능)

public class oop6 {

	public static void main(String[] args) {
		oop6_box ob=new oop6_box();
		ob.if_oop();

	}

}


class oop6_box{ //외부 클래스 생성
	//필드 영역
	int a,b; //전역변수 선언
	String id = "";
	
	
	public void if_oop(){
		
		//Scanner: 자바에서 console로 사용자가 입력하는 값을 실행시켜주는 라이브럴
		Scanner sc= new Scanner(System.in); //System.in : 시스템에서 직접 입력함.
		System.out.println("아이디를 입력하세요: ");
		this.id = sc.next(); //사용자가 입력해서 엔터치기 전까지는 밑에 코드 실행 안함.
		//next(): 한글 즉, 문자를 받는 method
		
		
		//equals: 문자만 비교 검토할 수 있는 method이며, 사용자가 입력한 값을 비교할 수 있음.
		//==: 개발자가 직접 입력한 문자는 사용가능 but 사용자가 직접 입력한 것은 불가능
		if(this.id.equals("apink")) { //연산기호 쓰면 error 발생 / 숫자는 가능 but 문자는 불가능 문자일때는 equals 써줘야함.
			System.out.println("로그인 하셨습니다.");
		}
		else if(!this.id.equals("apink")){ //같지 않을 경우는 !
			System.out.println("확인되지 않은 아이디 입니다.");
		}
		
		//연산기호(==,!=,>=,<=,<,>), 문자연산(equals, !this.id.equals)
		
		
		/*
		this.a=; //전역변수에 값을 이관시킴
		this.b=;
		*/
		
		System.out.println("첫 번째 숫자를 입력하세요: ");
		this.a=sc.nextInt(); //자료형을 맞춰줘야함. this.a의 변수 자료형에 맞게 next를 선택해야함.
		
		System.out.println("두 번째 숫자를 입력하세요: ");
		this.b=sc.nextInt(); //자료형을 맞춰줘야함.
		
		if(a<b) { //비교
			System.out.println("b값이 큽니다.");
		}
		else if(a>b) {
			System.out.println("a값이 큽니다.");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
	}
	
	
	
	
	
	
	
	
}