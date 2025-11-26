package oop;

import method.method6_box;

public class test {

	public static void main(String[] args) {
		method6_box mb = new method6_box();
		String pw=mb.password();
		System.out.println(pw);
		//int m=mb.money //method6_box에 있는 메소드는 이 클래스는 접근할 수 없음 왜냐 패키지가 다르기 때문에
	}

}
