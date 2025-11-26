package method;

import java.util.Arrays;
import java.util.Scanner;

//Scanner + 원시배열
public class method8 {

	public static void main(String[] args) {
		method8_box ma=new method8_box();
		//ma.abc();
		ma.bbb();
	}

}


class method8_box{
	Scanner sc = null;
	int data[] = new int[3]; // 숫자 빈 원시배열
	
	
	
	public void bbb() {
		this.sc=new Scanner(System.in);
		//System.out.println(this.data.length); //배열 갯수 확인
		int w=0;
		int user=0;
		while(w<this.data.length) { //필드에 있는 원시배열 갯수만큼 반복
			System.out.println("원하는 숫자를 입력하세요: ");
			user=this.sc.nextInt(); //사용자가 입력한 숫자 데이터를 받음
			this.data[w]= user; //숫자 데이터 값을 빈 원시배열에 순차적으로 저장
			w++;
		}
		this.sc.close();
		System.out.println(Arrays.toString(this.data));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void abc() { //scanner를 반복문에 적용하여 반복 횟수만큼 질문을 적용
		this.sc=new Scanner(System.in);
		int f;
		String pw = "";
		for(f=1;f<6;f++) {
			System.out.println("비밀번호를 입력하세요: ");
			pw=this.sc.next();
			if(pw.equals("a123456")) { //사용자가 직접 입력 하므로 equals 사용
				//사용자가 같은 입력 값을 적용 시 
				break; //반복문 강제 종료
			}
			else { //해당 입력 값이 다를 경우 메세지 출력 후 반복 => 총 5번
				System.out.println("비밀번호를 다시 확인 하세요.");
			}
		}
		this.sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
