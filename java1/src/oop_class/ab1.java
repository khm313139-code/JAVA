package oop_class;

import java.util.Scanner;

//추상 클래스 - 규격화하여 사용하려고 abstract를 사용

/*
추상 클래스를 왜 사용하나?
1. 프로세서를 구현시 메소드를 일관화 시키기 위한 규격
2. 구현 시 강제로 오버라이드를 사용해서 구현하는 형태
3. 표준화 및 다형성을 규칙적으로 사용하기 위함
*/

public class ab1 {

	public static void main(String[] args) {
		ab1_box ab=new ab1_box();
		ab.ab_method1();

	}

}

//외부 클래스
class ab1_box extends abs1{ //실제 존재 클래스 추상 클래스 사용시 무조건 추상클래스 오버라이드 해야한다.
	@Override
	public void ab_method1() {
		this.userid = "hong";
		
			System.out.println(this.userid);
			System.out.println(this.ab_method2());
	}
	@Override
		String ab_method2() {
			String aaa ="홍길동";
			return aaa; //string이니 return이 있다.
		}
	@Override
		String ab_method2(String a, Integer b) {
			
			return null;
		}
}


//abs1은 추상 클래스를 선언
abstract class abs1 { //실제로 존재하지 않고 가상의 클래스 실제 존재 클래스랑은 완전히 다른 것 얘는 아웃라인만 만든다 if, 반복문 못씀
	String userid = null; //추상 클래스에 전역변수 설정 필드에는 abstract 적용 불가 무조건 메소드 안에서만 사용 가능
	Scanner sc= null;
	final String corp = "중앙정보처리학원";
	
	public abstract void ab_method1(); //추상 클래스는 메소드 만들기와 필드에서 선언만 할 수 있다.
	//abstract 선언 사항이 있을 경우 외부 클래스에서는 무조건 오버라이드 사용
	//여기서 abstract 사용했으면 무조건 class ab1_box extends abs1{ 여기서 오버라이드 하라는 얘기
	
	abstract String ab_method2(); //public 사용 안해도 된다. but abstract 붙으면 무조건 오버라이드 해서 사용하라는 얘기
	
	abstract String ab_method2(String a, Integer b);
	
	public Integer ab_method3(){return 0; }; //이렇게 작성할 수도 있는데 얘는 abstract가 안 붙어서 얘는 써도 되고 안써도 되는 메소드가 되는 것임.
	//abstract 선언이 없을 경우 외부 클래스에서 사용 유무를 결정
}








