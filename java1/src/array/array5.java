package array;

import java.util.ArrayList;
import java.util.Scanner;

//Scanner + ArrayList 사용방법
public class array5 {

	public static void main(String[] args) {
		array5_box ab=new array5_box();
		ab.abc();
		//ab.bbb();
	}

}


class array5_box{
	private Scanner sc= null;
	ArrayList<String> user = null; //필드에 사용될 수 있다. 빈배열 아님 왜냐 new를 안썼기 때문에 
	ArrayList<Integer> no=null;
	//배열의 객체 및 자료형만 생성
	public void abc() {
		this.sc=new Scanner(System.in);
		this.user=new ArrayList<String>();//2. 이렇게 작성해줘야함. //해당 메소드를 실행 시 클래스 빈 배열을 생성함.
//		this.user.add("test");
//		System.out.println(this.user); //1. ArrayList<String> user = null; null 때리면 절대 작동안함
		for(;;) { //해당 반복문은 (무한 루프) - break; 써줘야함.
		//while(true) { / do~while(true) => boolean 형태로 무한루프 사용할 수 있음.
		//do {
			System.out.println("고객명을 등록하세요: ");
			this.user.add(this.sc.next());
			System.out.println("계속 등록 하시겠습니까? Y or N :");
			String aw=this.sc.next();
			
			if(aw.equals("n")||aw.equals("N")) { //사용자가 n 또는 N을 적용시 무한루프 종료시킴.
				break;
			}
		}
		//}while(true);
	
		System.out.println("등록된 고객 리스트: "+this.user);
		sc.close();
	}
	//}
	
	public void bbb() {
		//new 적용시 필드에 있는 배열은 초기화
		this.user = new ArrayList<String>(); //this.user을 가져오려고 했는데 new ArrayList<String>() 써버렸으니 초기화되어 빈배열 발생
		//so, field에 ArrayList<String> user = null; 만들어 두면 여러 개발자들이 new 때리고 사용할 수 있음.
		System.out.println(this.user);
	}
}
