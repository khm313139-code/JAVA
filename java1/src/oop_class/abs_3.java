package oop_class;
/*응용문제에 사용되는 추상 클래스
  
  
 */

import java.util.*;

public abstract class abs_3 {
	Scanner sc = null;
	List<Integer> arr = null;
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
}
