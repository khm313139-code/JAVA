package method;

import java.util.Arrays;
import java.util.Scanner;

//응용편 (원시배열+반복문)

/*
응용편
응용문제 1.
사용자가 최대 다섯 번을 입금할 수 있습니다.
입금된 입금 금액은 모두 배열에 추가 되어야 하며 최종 합계 입금 금액을
출력하고, 또한, 입금내역 또한 배열로 결과를 출력 할 수 있도록 코드를 작성하시오.

[실행]
"입금하실 금액을 입력하세요: 5000"
"입금하실 금액을 입력하세요: 4000"
"입금하실 금액을 입력하세요: 10000"
"입금하실 금액을 입력하세요: 8000"
"입금하실 금액을 입력하세요: 4000"

[결과]
총 입금한 금액은 31000
[5000, 4000, 10000, 8000, 4000]
 * */



public class method9 {

	public static void main(String[] args) {
		method9_box mb=new method9_box();
		mb.ccc();

	}

}




class method9_box{
	Scanner sc=null;
	int data[]=new int[5];


public void ccc() {
	this.sc=new Scanner(System.in);
	
	
	
	int i=0;
	int user=0;
	int sum=0;
	for (i=0; i<data.length; i++) {
		System.out.println("입금하실 금액을 입력하세요: ");
		user=this.sc.nextInt();
		this.data[i]=user;
		sum=sum+this.data[i];
		}
	System.out.println("총 입금 금액: "+sum);
	System.out.println(Arrays.toString(this.data));
	this.sc.close();
	}

}

