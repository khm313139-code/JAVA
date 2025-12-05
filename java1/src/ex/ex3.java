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
public class ex3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요: ");
		
		ex3_box eb = new ex3_box();
		String a = eb.box1(sc.next());
		System.out.println(a);
		eb.box3();
		sc.close();
		
	}

}

class ex3_box{

	static Integer a=10; //얘는 heaps 영역 (this 사용 유무 갈림) / static 붙으면 초기화가 안됨
	Integer b=15; //얘는 stack 영역 //얘는 계속 초기화 시킬 수 있음.
	// 위 두 영역은 차이가 있으므로 static 이 붙으면 this를 쓸 수 없음
	
	public void box2() {
		System.out.println(this.a); //이상태는 외부에서 접근하는 것이니 가능하다.
	}
	
	//but
	public static void box3() { //메소드에 static 붙으면 this 절대 불가능
		System.out.println(a); //이상태(static 에서는 절대 불가능하다.) 그냥 a로 접근
		//static이 되어버리면 필드에 있는 b 사용 불가능
		//정 쓰고 싶다면 아래처럼 접근하면 사용가능
		System.out.println(new ex3_box().b);
		
	}
	
	public void box4() { //static 안붙으면 얼마든지 this 접근 가능
		//일반 메소드: this 적용이 가능.
		System.out.println(this.a); 
		System.out.println(this.b);
		System.out.println(a);
	}
	
	
	//강사님 코드
	public String box1(String pw) {
		String msg = "";
		if(pw.length()<=4) {
			msg= "패스워드는 4자리 이상 입력하셔야 합니다.";
		}
		else {
			msg= "패스워드가 올바르게 등록 되었습니다.";
		}
		return msg;
	}
}






	


