package oop;

public class oop5 {

	public static void main(String[] args) {
		oop5_box ob=new oop5_box(); //새로운 메모리 영역 생성
		ob.user="홍길동"; //외부 클래스에 있는 field 영역에 전역변수 값을 변경할 수 있음.
		ob.abc();
//		ob.abc(); //이렇게 되면 중첩해서 쌓이게 됨. 
		oop5_box ob2=new oop5_box();//새로운 메모리 영역 생성
		ob2.abc();
		ob2.user="강감찬"; //먼저 선언안해주고 돌리면 null값이 뜬다.
//		new oop5_box().abc(); //객체를 만들지 않고 새로운 클래스를 호출한다.
		
		
	}

}

class oop5_box {
	
	//public은 외부에서 해당되는 변수 값을 변경할 수 있음.
	public String user; //변수만 make 값은 비어있음. / private는 외부 클래스에서 해당되는 변수 값을 변경하지 못함.
	int a=0; // 초기화가 됨. new를 새롭게 인스턴스를 생성 할때마다 무조건 초기화가 됨. 
	static int b=0; // 초기화 안됨 - 메모리라 heaps 영역에서 저장된 값을 유지한다.
	// static이 많아지면 메모리 차지 공간이 많이 늘어난다.
	public void abc() {
		this.a=this.a+1;
		this.b=this.b+1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.user);
	}
}
