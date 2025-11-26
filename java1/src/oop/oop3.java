package oop;

//파일명과 public class 명은 동일해야 합니다. **동일안하면 작동불가**
public class oop3 {

	public static void main(String[] args) {
		oop3_box ob=new oop3_box();
		ob.box(10, "정은지");
		ob.box("LG냉장고", 50);
		
	
	}

}

class oop3_box{ //다른 파일에서 만든거를 이 파일에서 사용 못함 - java는 파일 공유를 함 파일들끼리
//외부 클래스를 생성 시 다른 파일에 해당 클래스 명을 사용할 경우 동일한 이름을 사용하지 못함. - 파일들끼리 공유를 하므로
	
	int point = 5000; //field 영역에 전역변수 자료형을 선언
	
	
	public void box(int a, String b) { //매개변수 선언시 자료형도 함께 적용해야 함
		System.out.println(a);
		System.out.println(b);
	}
	
	public void box(String c, int b) { //같은 이름 쓸 수 있다. 자료형이 다를 경우 메소드도 b 사용할 수 있음. 자료형이 다르니
		//매개변수 선언 자료형이 다를경우, 갯수가 다를경우 사용가능
		//동일한 이름의 method를 생성할 수 있음.
		
		System.out.println(c);
		int point = 1000; // 이렇게 내부에 선언할 경우 밑에 point를 실행시키면 1000이 출력이 되고 this를 쓰면 전역변수 5000이 출력이 된다.
		System.out.println(point); // 지역변수 값 1000 호출
		System.out.println(this.point); //this는 필드를 가르킨다. 전역변수 호출시 사용 this를 사용하면 전역변수 5000값 출력가능
		this.box(); //같은 class 영역에 있을 경우 해당 메소드를 호출시 this를 이용하여 호출 가능
		this.box(100,"포인트"); //형을 똑같이 날려줘야함 같은 class에 있는
	
	}
	
	public void box() { //매개변수가 없는 box도 다른 box임 사용할 수 있음.
		System.out.println("오하영님의 포인트는: " + this.point);
		
	}
}