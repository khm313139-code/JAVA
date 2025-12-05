package ex;

import java.util.*;


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
public class ex6 {
	public static void main(String[] args) {
		ex6_box eb = new ex6_box();
		//eb.aaa();
		new ex6_box();
	}
}



class ex6_box{
	final String member[][] = {
			{"홍길동","SKT","45","hong@nate.com","01012234556"},
			{"이순신","LGT","55","lee@gmail.com","01022309544"},
			{"강감찬","KT","25","kang@gmail.com","01036601688"},
			{"홍길동","LGT","37","gildong@gmail.com","01033965531"}
	};
	Scanner sc = null;
	ArrayList<ArrayList<String>> arr2= new ArrayList<ArrayList<String>>();
	ex_dto ed = new ex_dto(); //1차 클래스 생성 및 setter를 이용하여 해당 java 필드에 값을 이관
	
	public ex6_box () { //즉시 실행
		int z =0; //인덱스 번호 찍으려고 해놈
		for(String i[]:this.member) { //정확하게 4바퀴 돈다.
			//DTO setter 메소드를 각 배열에 맞게 호출
			this.ed.setUsername(i[0]);
			this.ed.setCorp(i[1]);
			this.ed.setAge(i[2]);
			this.ed.setEmail(i[3]);
			this.ed.setTel(i[4]);
			this.arr2.add(this.ed.arrdata()); //ex_dto.java => arrdata() 1차 클래스 메소드 값을 이관
		}
		//System.out.println(this.arr2);
		this.ex6_search();
	}
	public void ex6_search() { //사용자를 검색해서 해당 데이터를 수정하는 메소드
		this.sc = new Scanner(System.in);
		
		System.out.println("고객명을 입력하세요: ");
		String sh_user = this.sc.next();
		System.out.println("이메일을 입력하세요: ");
		String sh_email = this.sc.next();
		int w = 0;
		while(w<this.arr2.size()) {
			if(this.arr2.get(w).get(0).equals(sh_user)) { //고객명
				if(this.arr2.get(w).get(3).equals(sh_email)) { //이메일
					System.out.println("변경할 휴대폰 번호를 입력하세요:");
					String tel = this.sc.next();
					this.arr2.get(w).set(4, tel);
					break;
				}
			}
		w++;
		}	
		if(w>=this.arr2.size()) {
			System.out.println("해당 고객 정보가 확인되지 않습니다.");
		}
		
	System.out.println(this.arr2);
	this.sc.close();
	}
	
}
	
	
	








//내꺼 dto 코드
//	public void aaa() {
//	ArrayList<ArrayList<String>> arr2 = new ArrayList<ArrayList<String>>();
//	for(int i = 0; i<member.length; i++) {
//		ArrayList<String> arr1 = new ArrayList<String>();
//		for (int j = 0; j<member[i].length; j++) {
//			arr1.add(member[i][j]);
//		}
//		arr2.add(arr1);
//	}
//		//System.out.println(arr2);
//	
//		
//	Scanner sc = new Scanner(System.in);
//	System.out.println("고객명을 입력하세요: ");
//	String usernm=sc.next();
//	System.out.println("이메일을 입력하세요: ");
//	String userem=sc.next();
//	
//	int find = -1;
//	
//	for(int i=0; i<arr2.size(); i++) {
//	if(arr2.get(i).get(0).equals(usernm)&&arr2.get(i).get(3).equals(userem)) {
//		find = i;
//		break;
//		}
//	}
//	if(find==-1) {
//		System.out.println("등록된 사용자가 없습니다.");
//		return;
//	}
//	
//	System.out.println("변경할 전화번호을 입력하세요: ");
//	String usertel=sc.next();
//	arr2.get(find).set(4, usertel);
//	System.out.println(usernm+"고객님 휴대전화 번호가 변경되었습니다.");
//	System.out.println(arr2);
//	}
//	
//}










