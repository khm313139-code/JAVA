package method;

import java.util.Arrays;

//method6.java와 method7.java 연계 작업
public class method7 {

	public static void main(String[] args) {
		method6_box mb = new method6_box();
		String pw=mb.password();
		//System.out.println(pw);
		
		
		int data[]= {10,20,30,40,50}; //메인에서 배열 데이터 생성 
		method7_arr ma= new method7_arr();
		ma.abc(data); //해당 클래스에 abc 메소드에 배열을 전달
		
		
		
		String re[]=ma.bbb(); // 받는 형태도 보내는 형태와 동일하게 작성하여 사용해야함. 자료형, 배열 기호 맞춰야함.
		//System.out.println(Arrays.toString(re));
	}
//protected 같은 패키지에서는 메소드를 공유해서 사용할 수 있지만 다른 패키지에서는 사용할 수가 없다.

}

	
class method7_arr{
	/*
	 * 응용편
	 * 매개변수 a에 대한 배열 값을 이용하여 해당 배열의 모든 총 합계 결과를 출력하는
	 * 코드를 작성하시오.
	 */
	
	public void abc(int a[]) { //void는 빈공간 return이 필요 없다. - 매개변수 배열 형태로 값을 받음.
		//System.out.println(Arrays.toString(a));
		//System.out.println(a.length);
//		int sum=0;
//		for(int i=0; i<a.length; i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		
		//응용편 강사님 코드
		int w = 0;
		int sum=0; //배열에 결과 합계 누적 변수
		do {
			sum=sum+a[w];
			w++;
		}while(w<a.length);
		
		System.out.println(sum);
	}
	
	
	
	public String[] bbb() { //메소드를 배열 메소드로 만들어서 배열 값을 return 시키겠다.(문자 원시 배열 return 메소드)
		String user[] = {"국어","영어","수학"};
		return user;//배열 변수 값을 return 시킴
	}
	
}