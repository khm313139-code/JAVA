package oop;

public class oop4 {
	
	//static : 메모리 영역(heap영역) => stack 영역과는 다른 메모리 영역
	
	static String user = "apink"; //heap 영역
	String user2 = "에이핑크";//stack 영역
	
	public static void main(String[] args) { 
		
		//static이 붙으면 무조건 메모리를 사용하는 구조
		//System.out.println(user); //전역변수를 static으로 설정을 해놓으면 같은 static에서 불러와서 사용할 수 있음.
		//but static으로 설정을 해놓을 경우 this를 절대 사용하면 안됨.
		
		
		String user3="정은지"; //내부에 있는 지역변수는 heap영역에서 만들어짐. 
		//이 안에서는 static을 또 만들어 줄 수 없음. static String user3="정은지"; - 절대 안됨
		//System.out.println(user3); //그냥 써서 불러옴
		
		
		oop4 op=new oop4(); //static에서는 무조건 인스턴스를 생성해서 불러와야함.
		//System.out.println(op.user2); //heap 영역
		op.box();
		
		}
		//stack과 heap영역이 있음. stack은 지역변수와 매개변수, 전역변수를 가지고 / heap은 static과 전역변수만 가짐 static 선언하면 무조건 heap에 쌓임
		//전역변수에는 static을 붙일 수가 있음.
		//시작은 항상 static으로 메모리 공간을 만들어주고 시작을 해야함.
		
	
		public void box() {
			System.out.println(this.user2); //heap 영역 / static이 아니면 this 사용 가능 또한 void는 일반 메소드임.
			System.out.println(oop4.user); //static 일 경우에도 this를 활용할 수 있다. 단, 일반 메소드에 한해서 
			//정식 코드는 oop4.user 이렇게 작성하는게 정식 코드임. -> this 대신 변수명 사용가능
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
