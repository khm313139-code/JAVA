package oop_class;
/*응용문제에 사용되는 추상 클래스
  
  
 */

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class abs_3 {
	Scanner sc = null;
	List<Integer> arr = null;
	List<String> sdata = null; //라이브러리를 여기서만 불러오기 위해 애초에 초기화를 시켜버리고 시작함.
	List<List<String>> sdata2=null; //이차배열에서 안쪽부분은 list를 때리지말고 arraylist라던가 lickedlist라던가 둘 중 하나 배열을 맞춰서 넣어줘야 자식에서 로딩을 해도 오류가 안난다.
	
	ArrayList<Integer> data = null;
	ArrayList<ArrayList<Integer>> alldata = null;
	Map<String, String> keydata = null;
	Date today = new Date();
	
	
	int sum = 0;
	String user;
	String val1, val2, val3, val4, val5;
	Integer nval1, nval2, nval3;
	
	
	public abs_3() {
		this.sc = new Scanner(System.in);
		this.userin();
	}
	
	public abstract void userin();
	public abstract Integer check_no(String data); //얘는 리턴이 나온다. integer 이므로 
	public abstract void result() throws Exception;
	public ArrayList<String> arr_method(){ return null;};

	public String todays() {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		return sim.format(this.today);
	}
}


//ctrl+o를 누르면 각각 자료형이나 사용되는 메소드들을 확인할 수 있다.
//abs_3에 c가 붙어있는데 constructer 임(즉시실행 메소드)