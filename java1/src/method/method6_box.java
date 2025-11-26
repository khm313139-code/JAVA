package method;
//이 클래스는 단독으로 실행시킬 수 없음.
//main method가 없는 클래스 이며 단독으로 실행할 수 없다.

/*
public: 모든 package에서 공유하는 자료형
private: 외부 class에서는 접근이 안됨. 내부 class에서만 사용 가능
protected: 같은 package 안에서는 공유할 수 있음
 */


public class method6_box {
	
	private String user(){//보안이 필요하다 하면 private 걸어버림, private 외부 접근 금지
		return null;
	}
	
	
	public String password() { //모든 패키지에서 활용가능
		String pw = "a123456";
		return pw; //나중에 여기가 암호화
	}
	
	protected int money() { //같은 패키지에서만 호출가능
		int a = 50000;
		return a;
	}
}
