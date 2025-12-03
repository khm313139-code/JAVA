package oop_class;

import java.util.List;

/*
추상 클래스에서는 protected, public, default에 대한 메소드만 생성 가능합니다.


*/
public abstract class abs_1 extends abs_2 {
	List<Integer> arr = null;
	final String mid = "apink";
	
	public abs_1() {
		this.abs_main();
	} //즉시 실행에 관련된 부분은 abstract를 못 만든다.
	  //즉시 실행 메소드는 abstract 사용하지 못함.
	abstract void abs_main(); //abstract는 무조건 {} 사용 못함. 그저 메소드를 이거로 시작을 해라 오버라이드 해서 이런 얘기
	// 무조건 오버라이드 해서 사용해라
	// 무조건 처음 시작하는 메소드
	// 만약에 abstract void abs_main(); 기존꺼에 protected abstract void abs_main(); 이렇게 붙으면 ab2도 다시 오버라이딩 해야함.
	
}
