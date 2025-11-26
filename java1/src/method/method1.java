package method;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class method1 {

	public static void main(String[] args) {
		method1_box mb=new method1_box();
			//mb.aaa();
		
		
		/* void 메소드 외에는 모두 return을 활용합니다. 
		   return 메소드를 사용시 주의사항은 결과 값을 받는 자료형과 메소도를 생성하는 자료형 및 return 자료형
		   세 가지 모두 동일한 자료형이 사용되어야 합니다.
		   
		   - 매개변수는 return에 결과 값에 대한 자료형과는 별개 입니다.
		   - 단, return에 대한 최종 결과 값은 자료형이 일치 해야함.
		*/
		
		
			String result = mb.ccc(25); //보내는 값이 string
			System.out.println(result);
			int no=mb.ddd();
			System.out.println(no);
			
			double money=mb.zzz();
			System.out.println(money);
	}
}


class method1_box{
	private Scanner sc=null; //외부에서 아예 접근 못하게 private를 걸어버리는게 보안에 좋다.
	final int no=1000; //const처럼 상수로 쓰임 final(상수) / final 설정 시 해당 값은 고정값이 된다. (상수)
	
	//new가 아니라 null이라고 써야함. / 라이브러리만 호출한거임 작동은 안 시킨 것 작동 시키려면 Scanner sc=new Scanner(System.in); 해야 실행됨.
	
	public void aaa() {//void 외 자료형 메소드는 return이 있다. void는 return 없다.
		this.sc=new Scanner(System.in);
		this.bbb(); //필터(aaa)를 거쳐서 bbb(private)를 실행시킴 //프라이빗 메소드를 호출(외부에서는 접근이 안되는 메소드)
	}
	
	private void bbb() { //private 는 외부 접근 불가
		System.out.println("나이를 입력하세요: ");
		int age= this.sc.nextInt();
		System.out.println(age);
	}

	public double zzz(){
		float a= 0.23f; //double이니까 뒤에 있는 데이터까지 다나온다.
		return a;
	}
	
	public String ccc(int n) { //받는 값도 string / 문자 자료형 메소드 //매개변수는 자료형과 관련이 없다 형이 달라도 된다.
		String user=""; 
		if(n==25) { //조건문 또는 반복문에서 변수를 생성한 값은 return을 하지 못한다. ?왜냐 조건문 반복문 안에서 선언된 값은 지역변수 이므로
			user = "미국";
		}
		else {
			user = "대한민국";
		}
		return user; //if라는 지역 안에서만 생성이 되어 있어서 return을 받을 수가 없다. if 밖에서는
		//그래서 외부에 먼저 user를 선언하고 if 함수 안에서 사용하면 해결된다.
	}
	
	public int ddd() {
		int n = 5000;
		return n;
	}
}


