package oop_class;

public interface inter2 {
	//public void point();
	//public String names(); //이거는 inter1에 있는 똑같은 이름의 메소드인데 이렇게 똑같이 사용해도 충돌이 일어나지 않는다
	//근데 만약 inter1이 매개변수가 없고, inter2가 매개변수가 있다면 따로따로 오버라이딩을 해야한다.
	//그리고 두개 다 똑같이 매개변수를 가지고 있다면 class inter_box1 implements inter1, inter2 여기서 먼저 선언한 인터페이스를 가져와서 사용한다. 두개다 가져올 수는 없다.
	
	//interface inter1에 동일한 메소드명 및 매개변수 형태가 있더라도, 하나만 로드함.
	
	
	
	
	
	
	//여기서부터 inter_class2에서 사용
	
	/* money, password, bankname: 필드 변수가 inter3에도 동일하게 사용할 수 있음
	 * 해당 데이터값 또한 각각의 interface의 값을 유지할 수 있음. */
	static Integer money = 1000000; //총 입금금액
	String password = "1234"; //비밀번호
	String bankname = "신한"; // 은행명
	public void SH_bank();
}
