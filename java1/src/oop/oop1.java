package oop;

import java.math.BigInteger;

//package 단위명 => project 디렉토리 구분 패키지는 자바라는 파일이 oop 라는 패키지 안에서 이파일이 작동이 되게 하는 것 / 하나의 그룹

public class oop1 { //class 큰 단위 => 같은 이름의 class는 생성할 수 없다.

/*
1. package를 먼저 생성합니다.(동일한 이름은 안됨)
2. java class 파일을 생성
3. 제작할 method를 생성
*/
	
	
	public static void main(String[] args) { 
		//method javascript로 치면 이 부분이 function과 같은 역할 / main method이며 단 한번만 사용
		//무조건 class 사용하고 method를 만들어야함
		
		/*
		전체 주석 한번에 ctrl+shift+/		 
		*/	
		
		//method 맘대로 바꾸면 안된다.
		
		String user = "에이핑크"; //문자형(class) 변수 선언 및 데이터 이관
		//String은 class 자료형 일반 자료형이 아님.
		
		
		//System.out.print: 한줄에 모든 결과를 출력
		//System.out.println: ln은 line이며 결과를 출력할 때 한 줄 한칸 내려쓰는 역할
		//System.out.printf: f는 format을 의미하며, %s는 문자를 의미한다. %d는 숫자를 의미한다. %n은 줄바꿈을 의미한다.
		
		System.out.print(user); //console에 임의의 결과값을 출력하는 역할 / ln은 줄바꿈 역할
		System.out.println("자바"); //문자 출력할 경우는 바로 출력시켜버림
		System.out.printf("%s 님 %n %d 포인트%n","오나영",3000); //%s와 %d는 무조건 printf에 적용해야함. / f는 format을 의미
		
		byte data =110; //byte는 숫자 -128~127 까지임. / 숫자(정수)
		
		short no= 32000; //-32768~32767 / 2 byte임.
		
		long nu=922337203612345123L; //약 ±9.22e18 / 8바이트(64bit)
		System.out.println(nu);
		
		BigInteger data2 = new BigInteger("1234568799745642313"); //가장 큰 단위의 숫자 class형태임.
		//java에서 정수 중에 가장 큰 단위임. 100경 1000경의 범위까지 가능
		
		int age=999999999; //정수형(숫자) / int의 한계점: 2의 31승까지임 그 이상은 못 받음.
		System.out.println("당신의 나이는 "+ age);
		
		float point=25.24123456789f; //실수형(숫자-실수) - 4바이트(32bit)
		System.out.println(point);
		
		double money = 0.13123456789123457789; //소수,실수 사용가능 - 8바이트(64bit) / 지수 붙을 수 있음.
		System.out.println(money);
		
		char agree='Y'; //char(문자형)는 최대 2byte(한글기준)라 외따옴표 써야한다. 
		//한글이면 무조건 한글자만 사용 char는 무조건 한글자 여러문자면 string 써야함.
		System.out.println(agree);
		
		boolean ck = true; //boolean 형 - (true / false) 만 사용이 가능하다.
		
	}

}

	