package ex;

import java.util.Scanner;

public class ex_혼자해보기4 {

	public static void main(String[] args) {
		ex_혼자해보기4_box eb = new ex_혼자해보기4_box();
		
		eb.menu();
	}

}


class ex_혼자해보기4_box extends ex_ab{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void add_subject(String word) {
		boolean ex=false;
		
		for(int i = 0; i<subject.size(); i++) {
		if(subject.get(i).equals(word)) {
			ex=true;
			break;
			
		}
	}
		if(ex==true) {
			System.out.println("해당과목은 이미 있습니다.");
		}
		else {
			subject.add(word);
			System.out.println("해당 과목을 정상적으로 추가하였습니다.");
			//System.out.println(subject);
		}
}
	@Override
	public void del_subject(String word) {
			if(subject.remove(word)) {
			System.out.println("정상적으로 삭제 되었습니다.");
			}
			else {
			System.out.println("삭제할 과목이 없습니다.");
			}
	}
		
	
	@Override
	public void all_subject() {
		System.out.println(subject);
		
	}
	
	public void menu() {
	while(true) {
	System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 선택 해주세요 : ");
	String choice = sc.next();
	
	switch (choice) {
	case "1":
		System.out.println("과목명을 입력하세요: ");
		String add= sc.next();
		add_subject(add);
		break;

	case "2":
		System.out.println(subject);
		System.out.println("삭제할 과목명을 입력하세요: ");
		String del= sc.next();
		del_subject(del);
		break;
		
	case "3":
		all_subject();
		break;
		
	default:
		System.out.println("잘못된 입력입니다.");
		break;
	}
	}
	
	}

}
	
	
	
	
	