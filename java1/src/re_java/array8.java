package re_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//클래스 배열 응용편2
public class array8 {

	public static void main(String[] args) {
		array8_box ab=new array8_box();
		ab.cms();

	}

}


class array8_box{
	final String user[]={"박서준","이민호","송중기","공유","지창욱","서인국","박보검"};
	private Scanner sc=null;
	private ArrayList<String> al=null;
	String data = ""; //scanner에 활용
	//메뉴 배열
	private String menu[]={"1.사용자 추가, 2.사용자 삭제, 3. 등록사용자 인원수, 4. 프로그램 종료 : "};
			
	
	
	
	public void cms() { //cms controller
		this.sc=new Scanner(System.in); //scanner 여기서 발동 시키면 밑에서 다 쓸 수 있다. 한번만 작성하면 됨.
		//원시 배열이 클래스 배열로 이관되었다.
		this.al=new ArrayList<String>(Arrays.asList(this.user));
		String msg="";
		
		for(;;) {
		System.out.println("메뉴를 선택하세요. "+Arrays.toString(this.menu));
		this.data=this.sc.next(); //사용자가 미 입력시 일시정지
		switch (this.data) {
		case "1":
			msg=input_data(); //사용자 추가
			break;
		case "2":
			msg=delete_data(); //사용자 삭제
			break;
		case "3":
			msg="총 인원수 : "+String.valueOf(totals()); //총 인원수
			break;
		default:
			this.sc.close();
			System.exit(0);//scanner까지 종료가 되어버림 //프로세스 종료
			
			break;
		}
		System.out.println(msg);
		
		}
	}
	
	public String input_data() { //고객명 추가 메소드
		System.out.println("추가할 사용자를 입력하세요");
		this.data=this.sc.next();
		this.al.add(this.data);
		return this.al.toString(); //tostring 때리면 숫자고 배열이고 뭐고 다 문자로 변환이 된다.
	}
	
	public String delete_data() { //해당 고객 데이터를 삭제하는 메소드
		System.out.println("삭제할 사용자를 입력하세요");
		this.data=this.sc.next(); //사용자가 받는 값
		
		int w = 0; //배열 번호 시작값
		for(String user:this.al) {
			if(user.equals(this.data)) {
				//System.out.println(user);
				this.al.remove(w); //노드번호
				break; //remove를 적용시 실제 배열에서 노드 번호 변경됨
			}
			w++;
		}
		//System.out.println(this.al);
		return this.al.toString();
	}
	
	public int totals() { //고객 전체 수를 확인
		int ea=this.al.size();
		return ea;
	}
}

