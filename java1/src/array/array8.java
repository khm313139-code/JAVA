package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//클래스 배열 응용편2
public class array8 {

	public static void main(String[] args) {
		array8_box ab=new array8_box();
		ab.aaa();

	}

}
/*
응용문제2
해당 사용자의 정보 데이터가 있습니다. 해당 메뉴에 맞는 형태로 결과가 출력 되도록 제작합니다.
String user[] = {"박서준","이민호","송중기","공유","지창욱","서인국","박보검"};

[실행] - 해당 메뉴 선택은 4번 입력까지 지속적으로 메뉴가 출력 되어야 합니다.
메뉴를 선택하세요 [1.사용자 추가, 2.사용자 삭제, 3. 등록사용자 인원수, 4. 프로그램 종료] : 

[1을 입력 후 엔터 칠 경우]
추가할 사용자를 입력하세요 : 강하늘
고객리스트 : [박서준,이민호,송중기,공유,지창욱,서인국,박보검,강하늘]  
출력 후 다시 메뉴화면이 나와야함

[2을 입력 후 엔터 칠 경우]
삭제할 사용자를 입력하세요 : 공유
고객리스트 : [박서준,이민호,송중기,지창욱,서인국,박보검,강하늘]
출력 후 다시 메뉴화면이 나와야함

[3을 입력 후 엔터 칠 경우]
등록된 사용자 인원은 : 총 7 명 입니다.
출력 후 다시 메뉴화면이 나와야함

[4를 입력 후 엔터 칠 경우]
프로그램을 종료 합니다.

*/




class array8_box{
	public Scanner sc= null;
	String user[] = {"박서준","이민호","송중기","공유","지창욱","서인국","박보검"};
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(user));
	
	
	public void aaa() {
		this.sc=new Scanner(System.in);
		System.out.println(al);
		for(;;) {
		System.out.println("메뉴를 선택하세요 [1.사용자 추가, 2.사용자 삭제, 3. 등록사용자 인원수, 4. 프로그램 종료] : ");
		int i=sc.nextInt();
		int count=0;
		if(i==1) {
			System.out.println("추가할 사용자를 입력하세요: ");
			String input=sc.next();
			al.add(input);
			System.out.println(al);
		}
		else if(i==2) {
			System.out.println("삭제할 사용자를 입력하세요: ");
			String del=sc.next();
			al.remove(del);
			System.out.println(al);

		}
		else if(i==3) {
			for(int j=0; j<al.size(); j++) {
				count+=1;
			}
			System.out.println("등록된 사용자 인원은 : 총 "+ count+ "명 입니다.");
		}
		else {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	sc.close();
		}
		
	}
}