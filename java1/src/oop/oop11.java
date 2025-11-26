package oop;

import java.util.Scanner;

public class oop11 {

	public static void main(String[] args) {
		oop11_box ob=new oop11_box();
		//ob.aaa();
		ob.bbb();
	}

}



/* 응용편
 * 
 * 결과에 대한 System.out.println는 해당 코드에서 한번만 사용합니다.
 * [실행]
 * [1.하나은행, 2.신한은행 3.국민은행] : 
 * 
 * 
 * 
 * 
 * [결과]
 * 하나은행
 * 잔액 0원
 * 
 * 신한은행
 * 잔액 900000원
 * 
 * 국민은행
 * 잔액 68000원
 * 
 * */




class oop11_box{
	Scanner sc=new Scanner(System.in);
	int a;
	String money;
	String name;
	
	
	public void bbb() {
//강사님 코드
		
		System.out.println("[1.하나은행, 2.신한은행, 3.국민은행]: ");
		int part = this.sc.nextInt();
		String bank="";
		int money=0;
		switch (part) {
		case 1:
			bank="하나은행";
			money=0;
			break;
		case 2:
			bank="신한은행";
			money=900000;
		case 3:
			bank="국민은행";
			money=68000;
			break;
			
		default:
			bank="해당 코드는 1~3까지만 이용하세요";
			break;
		}
		
		
		System.out.printf("%s %n잔액 %d 원", bank, money); // %n은 printf 형태의 줄바꿈=\n하고 같은 쓰임과 의미임.
		
		
		
		
		
		
		
		
		
		
//	System.out.println("은행을 선택하세요: ");
//	this.a=this.sc.nextInt();
//	
//	
//	switch(this.a) {
//	case 1:
//		this.name="하나은행";
//		this.money="0원";
//		break;
//	case 2:
//		this.name="신한은행";
//		this.money="900000원";
//		break;
//	case 3:
//		this.name="국민은행";
//		this.money="68000원";
//		break;
//	default:
//		this.money="선택 오류";
//	}
//	sc.close();
//	
//	
//	System.out.println(this.name+"\n잔액: "+this.money);
//	
	
	
	
	
	
	
	
	
//	public void aaa() {
//		String card="하나";
//		switch(card) {
//		
//		case "신한카드":
//		case "신한":
//			System.out.println("신한카드 선택");
//		break;
//		case "하나":
//			System.out.println("하나카드 선택");
//		break;
//		default:
//			System.out.println("서비스 준비중 입니다.");
//		break;
//		}
		
		
		
		/* 이 코드는 jdk -17 버전 코드임 이거를 11에서 돌리면 버전으로 인해 오류가 발생함.
		 * String card = "신한"; switch(card) { case "신한" ->
		 * System.out.println("신한카드 선택"); case "하나" -> System.out.println("하나카드 선택");
		 * default -> System.out.println("서비스 준비중 입니다."); }
		 */
		
	}
}

















