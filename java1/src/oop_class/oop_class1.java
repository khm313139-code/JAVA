package oop_class;

import java.util.ArrayList;
import java.util.LinkedList;

//oop_class1 => class1.java 연계작업 => 상속
//controller
public class oop_class1 extends class1{ //부모 클래스를 로드
	/*
	 extends를 사용시 부모 클래스 안에 있는 모든 필드에 객체를 활용할 수 있으며, 또한 모든 메소드를 활용할 수 있다.
	 단, 부모 클래스에 있는 메소드를 자식 클래스에서 강제 변경은 불가능하다.
	 */
	
	/*
	 @override: 부모 클래스에서 해당 메소드를 직접 로드하여 출력하는 형태
	 overloading: 부모 클래스와 동일한 이름 이지만 성격이 다른 형태로 구성할 경우 또는 매개변수 자료형이 다를 경우
	 */
	
	
	
	
	LinkedList<Integer> all3 = null; //오버로딩이 된 것 이거는 ArrayList<Integer> all2 =null; //이렇게 있을때 이게 링크드는 못 받으니 새롭게 오버로딩을 시킨 것
	//그니까 여기서 만들어서 쓰겠다는 거지 얘는
	
	
	
	//외부에 super 클래스를 로드하게 되면 해당 class에 있는 메소드를 가져온다는 뜻 (메소드 사항을 수정 불가)
	@Override //여기 안에서는 변수 만들어서 핸들링 할 수 없음.
	public void class1_abc() { //올라온거 받아서 여기 실행
		Integer aaa = 5000; //이렇게 변수 사용해서 핸들링은 할 수 있다.
		System.out.println(this.class1_bbb()); //여기서 sysout 시킬 수 있음.
		//this.all3 = new LinkedList<Integer>(); //super에 있으면 또 선언할 필요 없음. 근데 얘랑 LinkedList<Integer> all3 = null; 얘가 동시에 살아있으면 자식에 필드에 있는게 먼저 실행됨.
		//그리고 사실 super에 linked를 두면 그냥 add 때리면 되는거지 굳이 이렇게 또 만들일이 없지.
		this.all3.add(500);
		System.out.println(this.all3);
		super.class1_abc();
	}
	
	@Override
		public String class1_bbb() { //이미 아래에 같은 이름으로 오버로딩 된게 있어도 이렇게 새롭게 오버라이드 할 수 있다.
			String user_email = "hong@nate.com"; //super클래스에 있는걸 안쓰고 이걸 쓰고 싶다.
			return user_email; //이렇게 쓰면 슈퍼에 있는거 안쓰고 이메일로 사용 가능
		}
	
	
	//overloading - 다른 파일에 같은 이름이 있는데 로드를 안하고 내 마음대로 쓰고 싶을 때 사용.
	//만약에 다른 파일인데 같은 메소드이름이지만 (int a)라는 매개변수를 받고 위에서 sysout 시키면 이 메소드가 아니라 다른 파일(슈퍼 클래스)에 있는 파일이 작동을 한다.
	//위와 같은 상황이면 그래서 hong이 뜬다. 이걸 은닉화라 한다. 이미 override 되어 있으니 굳이 또 오버라이드 할 필요는 없다.
	
	public String class1_bbb(int a) { //이름이 같은 메소드가 양쪽 파일에 있어도 override가 안되었으면 다른 메소드임. 그래서 위에 sysout 시킬 수 있음.
		this.all=new ArrayList<String>(); //이렇게도 쓸 수 있는게 super에 필드에 꺼내놨고 이걸 extends로 class1꺼를 가져오니 오버로딩 된 상태에서도 사용할 수 있음.
		String pw = "a12345";
		return pw;
	}
	
	public oop_class1() { // 이 메소드를 활용해서 class1_abc()를 즉시 실행시켜버림 올라가고 이걸 만든 이유는 static이라 static에서 class1_abc를 활용할 수 없음.
		class1_abc(); 
	}
	
	public static void main(String[] args) {
		new oop_class1(); //생성자 실행하면 oop_class1() 이 메소드 실행 올라가고
	}
}
