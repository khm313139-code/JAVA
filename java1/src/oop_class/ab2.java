package oop_class;

import java.util.ArrayList;

//외부 추상 클래스 로드
public class ab2 extends abs_1{ //abs_1은 가상의 클래스

	public static void main(String[] args) {
		new ab2(); //외부 추상 클래스에서 즉시실행 메소드를 발동
		new aabb(); //즉시실행 메소드가 없습니다.(abs_2.java)
		

	}
	
	@Override
		public String userinfo() { //abs_2.java에 있는 추상 메소드를 로드함
			
			return null;
		}
	
	@Override
	void abs_main() { //abs_1.java에 있는 추상 메소드를 로드함
		this.arr = new ArrayList<>();
		//System.out.println("test");		
	}
}

class aabb extends abs_2{ //얘는 둘다 상속받을 수 있다. //abs_2.java에 있는 추상 메소드를 로드함
	public aabb() { //즉시실행 메소드가 없으면 적어야 한다.
		System.out.println(this.today());
	}
	@Override
	public String userinfo() {
		
		return null;
	}
}

class bbbs extends abs_1{ //abs_1이 abs_2를 상속받으면 둘다 override를 해줘야(메소드를) 사용가능 하다. 
	
	@Override
	public String userinfo() {
		
		return null;
	}
	
	@Override
	void abs_main() {
		String result = this.today();
		//System.out.println("외부 클래스2 추가!!");
		System.out.println(result);
	}
}

