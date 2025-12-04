package oop_class;
/*
인터페이스는 부품 느낌임(나사, 바퀴, 키보드 마우스 등등)

*/
import java.util.ArrayList;

public interface inter1 { //interface 안에서 abstract를 로드는 할 수 있음. interface에서는 선언시 public or protected만 사용할 수 있고 밑에 메소드는 public만 선언할 수 있다.
	//인터페이스의 기본은 public
	
	
	public String data[] = {}; //수정 못함. 얘는 보안이 좋다 어차피 상수 개념이니 외부에서 바꿀 수가 없음 그래서 보안에 좋다. 어차피 선언도 public으로 선언할 수 밖에 없음.
	
	//static + final이 되어버림 필드에 선언시
	Integer no = 50000; //인터페이스는 선언하는 순간 상수가 되어버림 public static final integer no =50000; 이거랑 같은 느낌
	ArrayList<String> all = null;//선언하는 순간 초기화 시킬 수 없음
	
	Integer point =1000; //회원가입 시 기본 적립 포인트 //상수
	String domain = "abc.co.kr"; //이런 식으로 선언시 가능
	
	
	//interface 안에 class를 활용하여 외부에서 해당 변수값 및 자료형을 로드할 수 있음.
	class abc{ //인터페이스 안에 클래스 만들어서 변경할 생각
		Integer aaa = 500; //일반 클래스처럼 필드에 값
	}
	
	//인터페이스에서 유일하게 기본 메소드를 활용할 수 있는 선언문(필수는 아니다.)
	default void setbox(String id) { //얘로 핸들링해야하는데 얘는 써도 되고 안써도 되는 것임
		System.out.println(id);
	}
	
	
	
	
	//interface에서 선언한 메소드는 클래스에서 상속받을 경우 무조건 override 적용됨.
	public String names();
	public Integer age();
	public String userid(String a, String b);
	
	/*
	public String userid() { //인터페이스는 이렇게 작성할 수 없음 그냥 메소드 이름만 지정할 수 있음 메소드 기능은 작성 불가.
		return null; 
	}
	*/
	
}

