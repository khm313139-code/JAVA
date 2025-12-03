package oop_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
응용문제1
class2.java를 상속받아서 다음에 조건 맞는 프로세서를 개발 하시오.
data 정보
hong / a1234
park / bb004
han / cdefg


[실행]
사용자 아이디를 입력하세요 :
패스워드를 입력하세요 :

사용자 아이디 및 패스워드를 입력시 해당 data 정보에 있는 값과 비교하여 맞을경우
"로그인 되었습니다." 라고 출력하시고 id는 맞지만 패스워드가 틀릴 경우 "패스워드를 확인하세요"라고 출력합니다.
아이디도 해당 data 정보에 없는 경우는 "회원정보를 확인하지 못하였습니다." 라고 출력 합니다.
*/

public class oop_class3 {
	
	public static void main(String[] args) {
		new member_ship();

	}

}

class member_ship extends class2{
	//강사님 코드
	public member_ship(){
		
		this.sc=new Scanner(System.in);
		this.lls = new ArrayList<List<String>>();
		datas("hong,a1234");
		datas("park,bb004");
		datas("han,cdefg");
		logins();
		
	}
	
	public void datas(String a) {
		this.sdata=a.split(",");
		this.ls = new ArrayList<String>(Arrays.asList(this.sdata));
		this.lls.add(this.ls);
	}
	
	public void logins() {
		System.out.println("아이디를 입력하세요: ");
		String uid = this.sc.next();
		System.out.println("패스워드를 입력하세요: ");
		String upw = this.sc.next();
		int w = 0;
		while(w<this.lls.size()) {
			if(this.lls.get(w).get(0).equals(uid) && this.lls.get(w).get(1).equals(upw)) {
				System.out.println("로그인 하셨습니다.");
				break;
			}
			else if(this.lls.get(w).get(0).equals(uid) && !this.lls.get(w).get(1).equals(upw)) {
				System.out.println("패스워드를 확인하세요.");
				break;
			}
			
			
			w++;
		
		}
		if(w==this.lls.size()) {
			System.out.println("회원정보를 확인하지 못하였습니다.");
		}
		this.sc.close();
	}
}
	
	
	
	
	/* 내코드
	public member_ship() {
		ls=new ArrayList<>();
		ls.add("hong");
		ls.add("a1234");
		ls.add("park");
		ls.add("bb004");
		ls.add("han");
		ls.add("cdefg");
		//System.out.println(ls);
		
		login();
	}
	
	@Override
	public String box3() {
		
		return super.box3();
	}
	
	public String box3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 패스워드를 입력하세요: ");
		return sc.nextLine();
	}
	
	public void login() {
		String id=box3();
		String pw=box3_1();
		
		boolean found = false;
		for(int i=0; i<ls.size(); i+=2) {
			if(ls.get(i).equals(id)) {
				found = true;
				String pw2=ls.get(i+1);
				if(pw2.equals(pw)) {
					System.out.println("로그인 되었습니다.");
				}
				else {
					System.out.println("패스워드를 확인하세요.");
				}
				break;
			}
		}
	
	
	if(!found) {
		System.out.println("회원정보를 확인하지 못하였습니다.");
	}
	}*/
	
	
	
	
