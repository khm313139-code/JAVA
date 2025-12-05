package ex;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		//System.out.println("안녕");
		
		ex8_box box =new ex8_box();
		box.menu();
	}

		
	}
class ex8_box extends ex_ab {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void add_subject(String word) {
		boolean ex=false;
		for(int i=0; i<subject.size(); i++) {
			if(subject.get(i).equals(word)) {
				ex=true;
				break;
			}
		}
		
		if(ex) {
			System.out.println("이미 등록된 과목");
		}
		else {
			subject.add(word);
			System.out.println("해당 과목을 추가했음.");
			
		}
		
		
		
	}@Override
	public void del_subject(String word) {
		
			if(subject.remove(word)) {
				System.out.println("정상적으로 삭제 되었음.");
			}
			
			else {
				System.out.println("삭제할 과목명이 없음");
			}
		
	}
	@Override
	public void all_subject() {
		System.out.println("등록된 과목 출력: "+subject);
	}
	
	public void menu() {
		while(true) {
		System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 선택 해주세요(종료 시 0입력) : ");
		String select = sc.next();
		if(select=="0") break;
		
		switch(select) {
		case "1":
			System.out.println("과목명을 입력해라: ");
			String add=sc.next();
			add_subject(add);
			break;
		case "2":
			System.out.println("과목명을 입력해라: ");
			String del=sc.next();
			del_subject(del);
			break;
		case "3":
			all_subject();
			break;
		
		default:
			System.out.println("잘못 선택했어.");
		}
	}
		System.out.println("프로그램 종료");
	
	
	
	
	
	
	
}
}

