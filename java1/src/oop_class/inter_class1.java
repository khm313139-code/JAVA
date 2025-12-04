package oop_class;

import java.util.*;

public class inter_class1 {

	public static void main(String[] args) {
		
		new inter_box1().point();
	}

}

//interface를 직접 class 파일에 사용하기 위해서는 implements 사용해야함

class inter_box1 implements inter1{ //인터페이스는 계속 붙여서 쓸 수 있음.
	

	
	@Override
		public String userid(String a, String b) {
			return null;
		}
	 //이거 풀어야함 inter_class2 때문에 잠궈놓음
	//@Override
		public void point() {
		//this.all = new ArrayList<String>(); //인터페이스에 선언이 되어 있으니 초기화를 못한다.
		//this.no=60000; //인터페이스는 abstract처럼 생각하고 필드에 값을 두면 아무것도 못함 interface는 초기화 못함.
		System.out.println(this.no);
		
		new abc();
		abc iabc=new abc();
		System.out.println(iabc.aaa);
		iabc.aaa=60000;
		System.out.println(iabc.aaa);
		}
	
	@Override
	public Integer age() {
		return null;
	}
	
	@Override
	public String names() {
		return null;
	}
	

}
