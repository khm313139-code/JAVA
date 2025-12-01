package dto;
//사용자 정보 및 로그인 파트(DTO) - 데이터를 전달 및 반환하는 역할의 class
//vo - value object / get(return 메소드가 없음) - set 메소드만 있음.

import java.util.ArrayList;

//dto - setter(값을 받는 역할), getter(값을 반환 역할)
public class user_dto {
	private String usernm, userid, userpw;
	private int userage;
	public String getUserem() {
		return userem;
	}
	public void setUserem(String userem) {
		this.userem = userem;
	}

	private String userem;
	
	public String getUsernm() {
		return usernm;
	}
	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	
	//1차 배열을 생성하여 반환하는 메소드
	public ArrayList<Object> users(){ //2차 클래스 반환하기 위한 하나의 정보
		ArrayList<Object> u = new ArrayList<Object>();
		//getter 형태로 1차 배열에 값을 추가하는 코드
		u.add(getUserid());
		u.add(getUsernm());
		u.add(getUserpw());
		u.add(getUserage());
		return u; //1차 배열을 2차 배열에 사용할 수 있도록 반환하는 작업
	}
	
	
}
