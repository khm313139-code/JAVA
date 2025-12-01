package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//interface: list 부모 배열(arraylist, linkedlist, Vector) - 자식 클래스
//



public class array13 {

	public static void main(String[] args) {
		
		//ArrayList, LinkedList: 단일 thread
		List<String> al = new ArrayList<String>();//list는 ArrayList,LinkedList의 부모
		List<String> al2 = new LinkedList<String>();//list는 ArrayList,LinkedList의 부모
		
		//vector: 멀티 thread - 속도가 어레이 링크드에 비해 빠르다
		List<String> al3 = new Vector<String>(); //arraylist 배열에 가속화
		
		
		al3.add(null);
		
		array13_box ab = new array13_box();
		ab.aaa();
		ab.bbb();
	}

}

class array13_box{
	List<String> all = null; //부모 밑에 선언하면 자식 클래스를 아무거나 사용할 수 있음. 필드에 선언해 놓으니까 어떤 배열 클래스를 써도 상관이 없는것임.
	//부모 interface를 활용하면, 자식 클래스를 원하는 형태로 구현이 가능하다.
	
	List<List<String>> alldata = null; // list안에 list도 넣어서 2차 배열도 만들 수 있음.
	
	public void aaa() {
		this.all = new ArrayList<String>();
	}
	public void bbb() {
		this.all = new LinkedList<String>();
	}
}