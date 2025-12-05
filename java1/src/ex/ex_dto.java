package ex;
//DTO : 필드, getter/setter, constructor
//VO: 필드, getter만 있음.
//ex6와 연계

import java.util.ArrayList;

/*
 getter 메소드 : return이 무조건 있는 메소드
 setter 메소드 : 필드에 있는 값에 데이터를 이관 (void)
*/
public class ex_dto {
	
	String username,corp,age,email,tel;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//1차 클래스 배열을 자동으로 생성하는 DTO
	public ArrayList<String> arrdata() {
		ArrayList<String> a = new ArrayList<String>();
		a.add(this.getUsername());
		a.add(this.getCorp());
		a.add(this.getAge());
		a.add(this.getEmail());
		a.add(this.getTel());
		return a;
		
	}	

}
