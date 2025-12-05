package ex;

import java.util.Arrays;

public class ex7 extends ex7_class{
	
	@Override //해당 메소드는 직접 상속 받아서 필수조건으로 사용하는 메소드
	public void box() { //this. 가능
		System.out.println(Arrays.toString(this.data));
		String result = this.box3();
		System.out.println(result);
	}
	
	public String box3() { //오버로딩: 직접 개발자가 상속 외에 추가 메소드를 생성한 경우
		this.search = "검색에서 사용하는 변수";
		
		return this.search;
	}
	
	public static void main(String[] args) { //this. 불가능
		new ex7().box();
	}
	
	@Override //이거 오버라이드 안해도 작업은 진행이 된다. 단 한개라도 상속을 받긴 해야함. 하나도 상속 안받으면 오류 발생.
	public String rebox() {
		
		return null;
	}
}




abstract class ex7_class{
	String data[] = {"빨간색", "파란색", "노란색"};
	String search = null;
	public abstract void box(); //abstract는 중괄호 안됨, 추상메소드
	
	public abstract String rebox(); //추가 추상 메소드를 생성하더라도 기존 작동되는 class 에서는 문제가 되지는 않는다.
	//단, abstract가 있는데 하나도 상속을 안받으면 문제 발생
	
	
	public void box2() { //일반 메소드
		
	};
	
}
