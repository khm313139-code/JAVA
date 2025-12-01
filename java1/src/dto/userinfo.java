package dto;

import java.util.ArrayList;
import java.util.Scanner;

public class userinfo {
//dto+사용자 정보 입력 기초 코드
	public static void main(String[] args) {
		userinfo_box ub = new userinfo_box();
		ub.user();

	}

}

class userinfo_box{
	private Scanner sc = null;
	user_dto dto = new user_dto(); //외부에 class를 호출하여 필드에 적용한 상황
	
	public void user() {
		this.sc=new Scanner(System.in);
		System.out.println("아이디를 입력하세요: ");
		this.dto.setUserid(this.sc.next()); //set역할은 값을 이관받는 것, 즉 사용자 입력값을 set이 처리함.
		System.out.println("고객명을 입력하세요: ");
		this.dto.setUsernm(this.sc.next()); //사용자가 입력한 값을 setter에 이관
		System.out.println("패스워드를 입력하세요: ");
		this.dto.setUserpw(this.sc.next());
		System.out.println("나이를 입력하세요: ");
		this.dto.setUserage(this.sc.nextInt());
		System.out.println("이메일 입력하세요: ");
		this.dto.setUserem(this.sc.next());
		
		ArrayList<Object> userinfo = new ArrayList<Object>();
		userinfo.add(this.dto.getUserid()); //입력된 값을 getter로 반환
		userinfo.add(this.dto.getUsernm());
		userinfo.add(this.dto.getUserpw());
		userinfo.add(this.dto.getUserage());
		userinfo.add(this.dto.getUserem());
		System.out.println(userinfo);
	}
}