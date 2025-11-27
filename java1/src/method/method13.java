package method;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 제공된 배열을 상수로 적용하여 다음과 같은 결과가 나오도록 코드를 작성합니다.

[배열 데이터]
{"hong","kim","park","jang"},
{"a1234","b1234","c1234","abc1234"},
{"1000","1500","2000","4500"}

Scanner을 이용하여 다음과 같이 출력되도록 합니다.

[실행]
아이디를 입력하세요 : 
패스워드를 입력하세요 : 

[결과]
[실패일 경우]
아이디 와 비밀번호를 다시한번 확인 하세요!

[성공일 경우]
포인트 2000 점 있습니다.
 */

public class method13 {

	public static void main(String[] args) {
		method_box13 mc=new method_box13();
		//mc.bbb();
		mc.myinfo();
	}


}



class method_box13{
		final String data[][]= { //상수로 처리해버려서 외부에서 수정하지 못하도록 고정시켜 버림
		
		
//강사님 코드 - 외부 class에서 void에 return 메소드를 활용하여 출력하는 코드로 작성
		 
				{"hong","kim","park","jang"},
				{"a1234","b1234","c1234","abc1234"},
				{"1000","1500","2000","4500"}
		};
		private Scanner sc=null;
		String id,pw; //사용자 아이디 및 패스워드를 받는 변수
		
		public void myinfo() { //사용자 정보를 입력 후 포인트 결과를 받는 메소드
			this.sc=new Scanner(System.in);
			System.out.println("아이디를 입력하세요: ");
			this.id=this.sc.next();
			System.out.println("패스워드를 입력하세요: ");
			this.pw=this.sc.next();
			String result = this.point(); //id,pw를 전역변수로 사용해서 바로 point로 보낼 수 있음.
			System.out.println(result);
			this.sc.close();
		}
		
		private String point() { //포인트를 조회해서 결과를 return 시킴
			String msg=""; //return 하기 위한 변수
			
			//foreach(배열 전용) - 배열 노드 번호가 없음.
			/* 2차 배열에 더블 foreach 형태 적용한 방식
			for(String[] a :this.data) { //2차 배열에 그룹이 3개니 그룹으로 반복이 된다.
				//System.out.println(Arrays.toString(a));
				for(String b: a) { //그룹에 해당되는 데이터 만큼
					System.out.println(b);
				}
			}
			*/
			
			//2차 배열 기준 하나의 그룹에서 사용하는 foreach 형태
			int no=0; // 배열 노드 번호가 없어서 카운트 해줘야 하는 변수를 만들어야 함.
			for(String a :this.data[0]) { //그룹으로 반복
				if(a.equals(this.id) && this.data[1][no].equals(this.pw)){
					msg=this.data[2][no]; //포인트 그룹에 내용을 msg 변수에 삽입
					break;
				}no++;
			}
			//System.out.println(no);
			if(no>this.data[0].length-1) {
				msg="아이디와 비밀번호를 다시한번 확인 하세요!";
			}
			
			return msg;
		}
		
		
//		Scanner sc=new Scanner(System.in);
//		public void bbb() {
		
//		String login[][]= {
//				{"hong","kim","park","jang"},
//				{"a1234","b1234","c1234","abc1234"},
//				{"1000","1500","2000","4500"}
//		};
//		String id;
//		String pw;
//		System.out.println("아이디를 입력하세요: ");
//		id=sc.next();
//		System.out.println("비밀번호를 입력하세요: ");
//		pw=sc.next();
//		
//		for(int i=0; i<login[0].length; i++) {
//		//System.out.println(i);
//		if(login[0][i].equals(id)&&login[1][i].equals(pw)) {
//			System.out.println("로그인 성공! 포인트: "+ login[2][i]);
//			break;
//		}
//		
//		if(i==login[0].length-1) {
//			System.out.println("아이디와 비번 다시 확인");
//		}
//		}
//		
//		}
	}

		
		
	

