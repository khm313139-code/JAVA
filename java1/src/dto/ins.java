package dto;

import java.util.*; //같은 쪽 라이브러리는 무조건 이렇게 쓰는게 좋다.
//해당 라이브러리를 모두 관리하는 형태의 구조


public class ins {

	public static void main(String[] args) {
		//ins_box ib=new ins_box(); //해당 클래스에서 즉시 실행 메소드를 호출(객체x, 클래스x)
		ins_box ib=new ins_box("aa11"); // 매개 변수가 있는 즉시실행 메소드
	}

}

class ins_box{
	Scanner sc =null;
	List<String> ls =null;
	LinkedList<Object> ll=null;
	ArrayList<ArrayList<String>> aa= null;
	
	//public ins_box(String key) { // ins_box() 얘하고는 다른 것 매개변수가 있고 없고 차이. 만약 ins_box ib=new ins_box(); 여기서 ins_box ib=new ins_box("aa11"); 이런식으로 매개변수 주면 얘 실행 가능
		
	//}
	
	
	public ins_box(String key) { //즉시 실행 메소드(class 명과 같아야함. 무조건!!!) //해당 즉시실행 메소드에서 인자값을 받은 후 조건 처리 함.
		if(key.equals("aa11")) {
			this.ins_abc();
		}
		else {
			System.out.println("올바른 접근이 아닙니다.");
			System.exit(0);
		}
		this.sc = new Scanner(System.in);
		this.ls = new ArrayList<String>();
		this.aa = new ArrayList<ArrayList<String>>();
		this.ins_abc(); //즉시실행 메소드에서 접근하도록 함.
		
	}
	private void ins_abc() { //외부 클래스에서 접근 금지 private
		System.out.println("사용자 입력사항 : ");
		String aa = this.sc.next();
		System.out.println(aa);
	}
}
