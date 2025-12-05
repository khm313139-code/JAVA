package ex;

import java.util.ArrayList;

//무조건 해당 추상 클래스는 외부 클래스에 상속 형태로만 운영됩니다.
/*
응용문제 4번
과목을 추가 생성하는 프로세서를 제작해야 합니다.
다음과 같이 진행되는 프로세서를 코드 작성 하시오.

[실행]
"과목추가[1], 과목삭제[2], 과목리스트 확인[3] 선택 해주세요: "

[1번 선택시] - 과목 추가
과목명을 입력하세요: 자바 
"해당 과목을 추가 하였습니다."

"과목추가[1], 과목삭제[2], 과목리스트 확인[3] 선택 해주세요: "
[1번 선택시] - 과목 추가
과목명을 입력하세요: 자바 
"이미 등록된 과목 명입니다."

[2번 선택시] - 과목 삭제
[등록된 과목 배열이 출력되어야 함]
삭제할 과목명을 입력하세요: 자바
"정상적으로 삭제 되었습니다."

[2번 선택시] - 과목 삭제
[등록된 과목 배열이 출력되어야 함]
삭제할 과목명을 입력하세요: 자바
"삭제할 과목명이 없습니다."

[3번 선택시] - 등록된 과목을 모두 출력

http://mekeyace.kbsn.or.kr/java_ab.txt


*/
public abstract class ex_ab {
	ArrayList<String> subject =  new ArrayList<String>();
	
	public ex_ab() { //추상 클래스에서 즉시 실행 construct를 구현하면 상속시 즉시 발동 되는 메소드
		
		
	}
	
	public abstract void add_subject(String word);
	public abstract void del_subject(String word);
	public abstract void all_subject();
}


