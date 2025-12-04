package oop_class;


import java.util.*;

//abs_3.java에 상속처리 후 코드를 작성
public class ab4 { //여기에 extends 때리면 밑에 static에서 필드 값을 사용하기 어려워진다.
//메인 안건드리고 클래스 하나 만드는게 쉽다.
	public static void main(String[] args) {
		new ab4_box();

	}

}

//abstract가 붙었다 그러면 추상 클래스
//안붙으면 일반 클래스

//ab4_box는 상품리뷰 관련 프로젝트 :  리뷰내용, 사용자명, 날짜
class ab4_box extends abs_3{ //오버라이드 다 시키기
	
	
	
	
	public ab4_box() { //constructer라고 있는데 (컨트롤 스페이스바 누르면) 이게 즉시실행이다.
		//이건 ab4_box에 대한 constructer임.
		
	}
	@Override
	public Integer check_no(String data) {
		
		return null;
	}
	@Override
	public void result() throws Exception { //출력 메소드
		System.out.println(this.sdata);
		
	}
	@Override
	//next()쓰고 => nextline() 오류 이외에 나머지는 상관없음.
	public void userin() {
		try {
		this.sdata = new ArrayList<String>();
		this.sdata2 = new ArrayList<List<String>>();
		
		System.out.println("사용자명을 입력하세요: ");
		this.sdata.add(this.sc.nextLine());
		System.out.println("리뷰내용을 입력하세요: ");
		this.sdata.add(this.sc.nextLine());
		this.sdata.add(this.todays());
		
		this.result(); //최종 결과를 출력하는 메소드로 이동
		
		}
		catch (Exception e) { //여기서는 날짜 this.sdata.add(this.todays()); 에서 오류가 발생 가능성이 있음.(상속받은 메소드)
			System.out.println("오류발생");
		}
		finally {
			this.sc.close();
		}
		
		
		
		
		
	}
}