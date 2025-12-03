package oop_class;
/*응용문제에 사용되는 추상 클래스
  
  
 */

import java.util.List;
import java.util.Scanner;

public abstract class abs_3 {
	Scanner sc = null;
	List<Integer> arr = null;
	int sum = 0;
	String user;
	
	public abs_3() {
		this.sc = new Scanner(System.in);
		this.userin();
	}
	
	public abstract void userin();
	public abstract Integer check_no(String data); //얘는 리턴이 나온다. integer 이므로 
}
