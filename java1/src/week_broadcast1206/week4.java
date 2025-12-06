package week_broadcast1206;
//test_ab와 연계
/*
class => 일반클래스, 중첩클래스, 메소드 핸들링 클래스, 추상클래스
class => public, abstract, default
*/
public class week4 {

	public static void main(String[] args) {
		week4_box wb = new week4_box();
		wb.abc();
		
		/*//이미 인스턴스화 되어있는 상황에는 이렇게 사용할 수 있다.
		week4_box.box_class wb2=wb.new box_class(); //이런식으로 작성하면 무조건 중첩 클래스라는 걸 알아두면 좋다.
		wb2.data();
		wb.zzz("유관순");
		*/
		
		
		
		//이거 접근하려면 무조건 public class 이어야함.
		//week4_box.box_class wb = new week4_box().new box_class(); 
		//wb.data();
	}

}


class week4_box{ //외부 클래스
	public void abc() { //일반 void 메소드
		box_class bc=new box_class();
		bc.data();
		//this.zzz(null); -> 이렇게 메소드 핸들링 클래스를 만들면 이것만 주석처리 하면 되니까
		//이런 식으로도 많이 사용한다.
		this.zzz("이순신");
	}
	private class box_class extends test_ab{ //보안이 중요할때 //중첩 클래스를 만들때만 사용가능
		String user = "홍길동";
		
		public void data() {
			System.out.println(this.user + "내부에서만 로드한 클래스 메소드");
		}
	}
	void zzz(String user) { //얘는 메소드 안에 클래스 때린 것 이거는 메소드 안에서만 클래스가 작동됨.
		//메소드 안에 핸들링 클래스 - 메소드 안에서 작동하는 클래스
		//클래스 안에 클래스가 아니라 메소드 안에 전용 메소드 핸들링 클래스
		class load_data { //이안에서는 private은 못 건다.(이게 메소드 핸들링 클래스임.)
			//메소드 안에 클래스 잔뜩 모아놓기도 한다.
			public void member_data() {
				System.out.println("고객명: "+user);
				System.out.println("메소드 안에 클래스 호출 데이터");
			}
		}
		load_data ld = new load_data(); //이 두줄은 항상 클래스를 만들고 작성을 해줘야 한다. 
		//코드는 위에서부터 읽어내려오기 때문에 안만들어진 상태에서 실행시키려고 하면 오류 발생
		//클래스 인스턴스화 객체 생성(ld)
		ld.member_data(); //메소드 호출
	}
	
	
}