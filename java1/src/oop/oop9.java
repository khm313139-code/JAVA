package oop;

import java.util.Scanner;

//반복문

public class oop9 {
	public static void main(String[] args) {
		oop9_box ob = new oop9_box();
		//ob.abc();
		//ob.bbb();
		//ob.ccc();
		ob.ddd();
	}
}

class oop9_box { // 외부 클래스
//	int a;
//	int b;
//	int sum=0;
//	
	
	
	/*응용편 2  - ddd
	 * 5~45까지 숫자 반복 (반복문 1개) - (조건문 1개)
	 * [실행]
	 * [1.짝수, 2.홀수] 선택
	 * 
	 * [결과]
	 * 5
	 * 7
	 * 9
	 * 11
	 * ...
	 * 45
	 * */
	
//	public void ddd() {
		Scanner sc= new Scanner(System.in);
//		System.out.println("짝수, 홀수 중 선택하시오.(짝수 1, 홀수 2): ");
//		int choice=sc.nextInt(); //입력값은 바뀌면 안되므로 반복용 변수와 분리하여 생각을 해야한다.
//	
//		for(int i=5; i<=45; i++) {
//			if(choice==2 && i%2==1){
//			System.out.println(i);
//			}
//			else if(choice==1 && i%2==0){
//				System.out.println(i);
//			}
//		}
//	}
//}
	
	
	//ddd- 강사님 코드
	public void ddd() {
		System.out.println("[1.짝수, 2.홀수]: ");
		byte part = this.sc.nextByte();
		byte w=5;
		while(w<=45) {
			if(w%2==(part-1)) { //part입력에 따라서 홀, 짝 구분 가능
				System.out.println(w);
			}
			w++;
		}
		this.sc.close();
	}
	
}
	
	
	
	
	
	
	
	/*응용편-ccc()
	 [실행화면] 
	 첫번째 숫자를 입력하세요 : 5
	 보고 싶은 구구단을 입력하세요: 2
	 [결과]
	 2*1=2
	 2*2=4
	 2*3=6
	 2*4=8
	 2*5=10
	 **/
	
	
//	public void ccc() {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("첫 번째 숫자를 입력하세요: ");
//		this.a=sc.nextInt();
//		System.out.println("보고 싶은 구구단을 입력하세요: ");
//		this.b=sc.nextInt();
//		
//		for(int i=1; i<=a; i++) {
//				System.out.println(b+"*"+i+"="+(b*i));
//			
//		}
//		sc.close();
//	}
//}
	
	
	
	
//	public void bbb() { //반복문 + if문
//		do {
//			if(this.b%8==0) {
//				this.sum+=this.b;
//			}
//			
//			this.b++;
//		}while(this.b<=100);
//		
//		System.out.println(this.sum);
		
		
	
	
	
	//public void abc() { //for~do/while문 까지 사용하는걸 보여줌
		/*for (a = 10; a >= 0; a--) {
			System.out.println(a);*/
		/*
		 * while(b<=10) { System.out.println(b); b++; }
		 */
		
		/*
		 * do { System.out.println(this.b); //전역변수 가져오기 this.b++; //전역변수 가져오기
		 * }while(this.b<=10); //전역변수 가져오기
		 */	
	



