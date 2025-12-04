package oop_class;

import java.util.Scanner;

public class inter_class2 {

	public static void main(String[] args) {
		new inter_box2();

	}

}

class inter_box2 implements inter2, inter3{
	Scanner sc = new Scanner(System.in);
	
	public inter_box2() { //즉시 실행
		try {
		System.out.println("1. 신한은행 2. 국민은행 3. 종료: ");
		Integer bankno = this.sc.nextInt();
		switch(bankno) {
		case 1:
			this.SH_bank();
			break;
		case 2:
			this.KB_bank();
			default:
				System.exit(0);
				break;
		}
		
	}catch(Exception e){
		System.out.println("숫자만 제발 입력해주세요");
		new inter_box2();
		}
	}
	
	String userpass = ""; //사용자 패스워드를 입력받는 변수
	Integer usermoney = 0; //입금, 출금을 담당하는 변수
	static Integer money = 0;
	//inter2.bankname = interface 이름 중에서 inter2라는 interface에 bankname 변수값을 가져옴
	//inter3.bankname = interface 이름 중에서 inter3라는 interface에 bankname 변수값을 가져옴
	
	@Override
	public void SH_bank() {
		System.out.printf("%s은행 패스워드를 입력하세요: %n",inter2.bankname); //inter 2,3 두 개를 상속 받을 때 this 때리면 같은 bankname을 썼을 때 어떤 거를 가져와야하는지 명확하지가 않다. 그래서 해당 interface이름.메소드 형식으로 불러온다.
		this.userpass = this.sc.next();
		if(inter2.password.equals(userpass)) {
			System.out.println("입금금액을 입력해 주세요 : ");
			this.usermoney = this.sc.nextInt();
			this.money = inter2.money+this.usermoney;
			System.out.println("최종 금액은 "+this.money);
		}
		else {
			System.out.println("계좌 비밀번호가 틀립니다.");
		}
		this.sc.close();
	}
	
	@Override
	public void KB_bank() {
		System.out.printf("%s은행 패스워드를 입력하세요: %n",inter3.bankname); //inter 2,3 두 개를 상속 받을 때 this 때리면 같은 bankname을 썼을 때 어떤 거를 가져와야하는지 명확하지가 않다. 그래서 해당 interface이름.메소드 형식으로 불러온다.
		this.userpass = this.sc.next();
		if(inter3.password.equals(userpass)) {
			System.out.println("입금금액을 입력해 주세요 : ");
			this.usermoney = this.sc.nextInt();
			this.money = inter3.money+this.usermoney;
			System.out.println("최종 금액은 "+this.money);
		}
		else {
			System.out.println("계좌 비밀번호가 틀립니다.");
		}
		this.sc.close();
	}
		
}
	
	
	
	
	
