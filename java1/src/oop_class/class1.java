package oop_class;

import java.util.ArrayList;
import java.util.LinkedList;

//model - 상속을 해버리면 model이 아니라
//superclass가 됨.
public class class1 {
	
	String userid = null;
	ArrayList<String> all = null;
	ArrayList<Integer> all2 =null; //이렇게 있을때 
	LinkedList<Integer> all3 = new LinkedList<Integer>();
	
	public void class1_abc() {
		String user = "홍길동";
		System.out.println(user + "class1에 사용되는 abc 메소드");
		
	}
	
	
	public String class1_bbb() { //string이니 return이 있다.
		this.userid = "hong";//이 메소드를 안쓸거면 오버라이드 안하면 됨.
		return this.userid;
	}
}
