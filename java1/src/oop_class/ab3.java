package oop_class;
//응용문제 abs_3과 연결

import java.util.ArrayList;
import java.util.Scanner;

/*
응용문제 2

abs_3.java를 상속 받아서 다음과 같이 진행되는 프로세서 및 결과를 출력하는 코드를 작성하시오.

 
 [실행]
 "숫자를 입력하세요 : "
 "숫자를 입력하세요 : "
 "숫자를 입력하세요 : "
 "숫자를 입력하세요 : "
 "숫자를 입력하세요 : exit" => 입력시 프로세서는 종료 됩니다. 
 단, 종료와 동시에 숫자 입력한 모든 값을 배열로 출력
 
 만약, 사용자가 숫자가 아닌 문자를 입력 시 "숫자만 입력해야 합니다." 라는 메세지 출력시 동일한 질문사항("숫자를 입력하세요 : ")을 출력해야 합니다.
 (오버로딩 금지)
*/
public class ab3 extends abs_3{

	public static void main(String[] args) {
		new ab3();
		

	}
	@Override
	public void userin() {
		this.arr = new ArrayList<>();
		while(true) {
		System.err.println("숫자를 입력하세요: ");
		String input = sc.nextLine();
		if(input.equals("exit")) {
			System.out.println("프로세서를 종료합니다.");
			break;
		}
		Integer result = check_no(input);
		if(result==null) {
			System.out.println("문자가 포함되어 있습니다. 다시 입력하세요: ");
			continue;
		}
		arr.add(result);
		
		}
		
	}
	
	@Override
	public Integer check_no(String data) {
		try {
			return Integer.parseInt(data);
		}
		catch(NumberFormatException e){
			return null;
		}
		
	}
	
	
	public ab3() {
		
		
	
		System.out.println(arr);
	}
}


