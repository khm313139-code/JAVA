package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
응용문제 3
다음 프로세서 실행 화면 형태처럼 결과가 진행되는 코드를 작성하시오.

[실행]
고객명을 입력하세요: 강감찬
이메일을 입력하세요: kang@gmail.com
--> 단, 고객명과 이메일을 확인 하였을 경우 사용자가 없을 경우 "등록된 사용자가 없습니다."

변경할 휴대폰 번호를 입력하세요: 01012345678


[결과]
강감찬 고객님 휴대폰 번호가 변경되었습니다.
전체 고객 배열 값 출력
*/
public class ex_혼자해보기3 {

	public static void main(String[] args) {
		new ex_혼자해보기3_box().aaa();

	}

}

class ex_혼자해보기3_box{
	final String member[][] = {
			{"홍길동","SKT","45","hong@nate.com","01012234556"},
			{"이순신","LGT","55","lee@gmail.com","01022309544"},
			{"강감찬","KT","25","kang@gmail.com","01036601688"},
			{"홍길동","LGT","37","gildong@gmail.com","01033965531"}
	};
	Scanner sc = new Scanner(System.in);

	
	public void aaa(){
		ArrayList<ArrayList<String>> al2 = new ArrayList<ArrayList<String>>();
		for(int i = 0; i<member.length; i++) {
			ArrayList<String> al = new ArrayList<String>();
			for(int ii = 0; ii<member[0].length; ii++) {
				al.add(member[i][ii]);
				
			}al2.add(al);
		}//System.out.println(al2);
		
		
		
		System.out.println("고객명을 입력하세요: ");
		String usernm = this.sc.next();
		System.out.println("이메일을 입력하세요: ");
		String userem = this.sc.next();
		
		boolean found = false;
		for(int j = 0; j<al2.size(); j++) {
		if(usernm.equals(al2.get(j).get(0))&&userem.equals(al2.get(j).get(3))) {
			System.out.println("변경할 휴대폰 번호를 입력하세요: ");
			String tel = sc.next();
			al2.get(j).set(4,tel);
			System.out.println(al2.get(j).get(0)+" 고객님 휴대폰 번호가 변경되었습니다.");
			found =true;
			break;
			}
		}
		
		if(found) {
		System.out.println(al2);
		}
		else {
			System.out.println("등록된 사용자가 없습니다.");
			
		}
	}
}






