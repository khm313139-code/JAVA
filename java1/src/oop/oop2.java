package oop;

public class oop2 {

	public static void main(String[] args) {
		//oop2_box(클래스명)
		//new oop2_box(); (객체)
		//ob는 변수가 해당 인스턴스를 가져오는 형태로 쓰인다(인스턴스 화 시켰다. 라고 보면된다.)
		oop2_box ob = new oop2_box(); //클래스 객체 인스턴스로 구분지어 설명할 수 있음.
		ob.box(); //해당 인스턴스에 저장된 클래스 객체에 box()라는 메소드를 실행시킨 상황
		ob.box2(); //해당 인스턴스에 저장된 클래스 객체에 box()라는 메소드를 실행시킨 상황
		
		oop2_box2 ob2 = new oop2_box2();
		ob2.box();
	}

}

class oop2_box2{ //클래스 명은 절대 같은거 사용할 수 없음. 
	//빈 클래스로 둘 수 없고 안에 메소드를 무조건 넣어줘야 한다.
	
	public void box() { //메소드 명은 같을 수 있음.
		System.out.println("oop2_box2에서 생성된 메소드");
	}
}

//oop2_box: 외부 class 선언
//void: 기본 method 선언 할 때 사용(반환 없는 메소드)
class oop2_box{ //외부 클래스 안에 메소드 하나 생성
	
	public void box() {
		System.out.println("외부 클래스 및 메소드 호출");
	}
	public void box2() {
		System.out.println("box2 메소드 호출!!");
	}
}