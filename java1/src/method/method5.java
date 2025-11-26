package method;
/*
 * 응용문제 2
 * 외부 클래스를 이용하여 사용자가 입력한 값을 처리 후 return 결과를 받은 후 출력하는 코드를 작성합니다.
 * 
 * [실행]
 * 숫자1 입력해 주세요 : 3
 * 숫자2 입력해 주세요 : 7
 * 3*7에 대한 정답은 : 22
 * 
 * [결과]
 * 오답입니다. 또는 정답입니다. 라고 출력 되도록 합니다.
 */
import java.util.Scanner;
public class method5 {
	public static void main(String[] args) {
		method5_box mb=new method5_box();
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 1을 입력하세요: ");
		int num1=sc.nextInt();
		System.out.println("숫자 2을 입력하세요: ");
		int num2=sc.nextInt();
		System.out.println(num1+"*"+num2+"에 대한 정답은: ");
		int num3=sc.nextInt();
		
		String re=mb.bbb(num1, num2, num3);
		System.out.println(re);
	}
}
		
		
		
class method5_box{
	String msg="";
	public String bbb(int num1, int num2, int answer) {
	int correct = num1 * num2;
	if(answer==correct) {
		msg = "정답입니다.";
		}
	else {
		msg="오답입니다.";
		}
	return msg;
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		method5_box mb=new method5_box();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("숫자 1 입력해 주세요: ");
//		int num1=sc.nextInt();
//		System.out.println("숫자 2 입력해 주세요: ");
//		int num2=sc.nextInt();
//		System.out.println(num1+"*"+num2+"에 대한 정답은: ");
//		int num3=sc.nextInt();
//		String result=mb.bbb(num1, num2, num3);
//		System.out.println(result);
//		sc.close();
//	}
//		
//
//}
//
//class method5_box{
//	String msg="";
//	public String bbb(int num1, int num2, int answer) {
//		int correct=num1*num2;
//		if(answer==correct) {
//			msg ="정답입니다.";
//		}
//		else {
//			msg ="오답입니다.";
//		}
//		return msg;
//	}
//}