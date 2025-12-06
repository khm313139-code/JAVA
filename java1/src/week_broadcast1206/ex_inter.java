package week_broadcast1206;

import java.util.*;

public interface ex_inter { //사수가 이렇게 만들어 놨으면 무조건 오버라이드 해야한다.
	//이렇게 써놓으면 무조건 사용하세요가 된다.
	public <T> Object user(T data);
	public <T> ArrayList<T> box(T data); //String, Integer, Double => 다 사용가능하다.
	public <T> LinkedList<T> box2(T data);
	public <T> List<T> box3(T data);
	public <T> Map<T, T> box4(); //이렇게도 작성가능
	
}
