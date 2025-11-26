package oop;

import java.util.Scanner;

/*
응용문제
사용자가 숫자 입력한 데이터를 가지고 입금, 출금 처리하는 프로세서를 구현 하십시오.
[실행]
[1. 입금, 2. 출금]:1

[입금]
입금하실 금액을 적어주세요: 8000
최종 잔액은 : 58000입니다.

[출금]
출금하실 금액을 적어주세요: 40000
최종 잔액은 : 10000입니다.

단, 출금 금액이 50000 이상일 경우 다음과 같이 메세지를 출력합니다. "잔액이 부족합니다."

*/



//public class oop8 {
//
//	public static void main(String[] args) {
//		oop8_box ob=new oop8_box();
//		ob.bank();
//	}
//
//}
//

//class oop8_box{
//	int base=50000;
//	int se=1;
//	int a;
//	int b;
//	public void bank() {
//		
//		System.out.println("입금인지 출금인지 선택하세요: ");
//		Scanner sc=new Scanner(System.in);		
//		this.se=sc.nextInt();
//		if(this.se==1) {
//			System.out.println("입금하실 금액을 입력하세요: ");
//			int a=sc.nextInt();
//			base=base+a;
//			
//			System.out.println("입금이 완료되었습니다. 현재 잔액: "+base);
//		}
//		
//		else if(this.se==2) {
//			System.out.println("출금하실 금액을 입력하세요: ");
//			int b=sc.nextInt();
//		
//			if(b>base) {
//			base=base-b;
//			System.out.println("잔액이 부족합니다.");
//		}
//	
//		else {
//			base=base-b;
//			System.out.println("출금이 완료되었습니다. 현재 잔액: "+base);
//		}
//		
//		
//		}
//	}
//}






// 강사님 코드

public class oop8{
	public static void main(String[] args) {
		oop8_bank ob = new oop8_bank();
		ob.part();
	}
}

class oop8_bank{
	private int money = 50000;
	Scanner sc=new Scanner(System.in); //이 라이브러리 필드에 올릴 수 있음.
	int bank_part=0; //사용자가 선택하는 메뉴코드
	int usermoney=0; //사용자가 입력하는 금액코드
	
	public void part() {
		
		
		System.out.println("[1.입금, 2.출금] : ");
		this.bank_part = this.sc.nextInt();
		if(this.bank_part==1) {
			this.in_bank(); //해당 클래스에 있는 메소드 호출
		}
		else {
			this.out_bank();
		}

	}
	

	public void in_bank() {
		System.out.println("입금하실 금액을 적어주세요: ");
		this.usermoney= this.sc.nextInt();
		this.money=this.money+this.usermoney;
		//System.out.println("총 잔액은: "+this.money+ "입니다. ");
		System.out.printf("총 잔액은: %d원 입니다.", this.money);
		this.sc.close();
	}
	
	public void out_bank() {
		System.out.println("출금하실 금액을 적어주세요: ");
		this.usermoney= this.sc.nextInt();
		if(this.usermoney > this.money) {
			System.out.printf("잔액이 부족합니다.");
		}
		else {
			this.money=this.money-this.usermoney;
			System.out.printf("총 잔액은: %d원 입니다.", this.money);
		}
		this.sc.close();
	}
}




