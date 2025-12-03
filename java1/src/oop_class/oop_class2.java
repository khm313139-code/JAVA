package oop_class;

import java.util.ArrayList;
import java.util.List;

public class oop_class2 {

	public static void main(String[] args) {
		oop_class2_box ob = new oop_class2_box();
		//ob.class1_abc(); //상속을 받아서 아무것도 안해도 실행이 가능하다.
	}

}



class oop_class2_box extends class1{ //extends: 상속은 하나의 클래스만 적용된다.
	
	
	List<ArrayList<String>> all2 = null; //자식 클래스에서 생성한 2차 클래스
	//linked든 array든 상관없음.
	
	public oop_class2_box(){
		this.all2 = new ArrayList<ArrayList<String>>();
		this.users();
		
	}
	
	
	
	public void users() { //overloading / 별도(자식 클래스에서 직접 생성함)
		this.all=new ArrayList<String>(); //부모 클래스에 필드에 있는 클래스 배열을 로드 근데 null로 되어있으니 new arraylist~로 작성 1차 클래스
		this.all.add("권하민");
		this.all.add("허대회");
		this.all.add("박순수");
		this.all2.add(this.all);
		System.out.println(this.all2);
	}
}