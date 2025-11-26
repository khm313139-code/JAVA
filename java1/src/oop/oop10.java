package oop;

import java.util.Scanner;

//더블 반복문
public class oop10 {

	public static void main(String[] args) {
		oop10_box ob=new oop10_box();
		//ob.aaa();
		ob.bbb();

	}

}


class oop10_box{
	Scanner sc=new Scanner(System.in);
	int w;
	int ww;
	int sum=0;
	/*응용문제 1
	 [실행]
	 구구단 시작 단수를 입력하세요: 3
	 구구단 끝 단수를 입력하세요: 8
	 
	 [결과]
	 3단부터 8단까지의 모든 홀수의 결과 총 합계는 : 
	 */
	
	public void bbb() {
		System.out.println("구구단 시작 단수를 입력하세요: ");
		this.w=this.sc.nextInt();
		System.out.println("구구단 끝 단수를 입력하세요: ");
		this.ww=this.sc.nextInt();
		
		
		for(int i=this.w; i<=this.ww; i++) {
			for(int j=1; j<=9; j++) {
				int result=(i*j);
				//System.out.println(result); - 결과 확인용
				if(result%2==1) {
					//System.out.println(i+"*"+j+"="+result);
					this.sum+=result;
				}
				//System.out.println(i+"*"+j+"="+(this.w*this.ww));
			}
		}
		System.out.println(this.w+"단부터"+this.ww+"단까지의 모든 홀수 결과 총 합계는: "+this.sum);
	}
}

	
	
	
	
	
	
	
	

	
//	public void aaa() {
//		this.w=1;
//		while(this.w<=9) {
//			this.ww=1;
//			do {
//				if(this.ww<=5) { //5까지만 출력되도록 각 구구단 별로
//				System.out.printf("%d*%d=%d \n\n", this.w, this.ww, this.w*this.ww);
//				}
//				else {
//					break; //해당 조건이 맞을 경우 반복문 강제 종료
//				}
//				this.ww++;
//			}while(this.ww<=9);
//			this.w++;
//		}
//	}
//}












