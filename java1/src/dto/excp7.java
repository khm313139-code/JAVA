package dto;
//controller
import java.util.ArrayList;
import java.util.Scanner;

/*
응용문제 2
메인에서는 다음과 같이 실행이 되어야 합니다.
[실행]
"숫자를 입력해 주세요: " => 총 6회

해당 6회 숫자를 모두 입력 시 해당 배열의 데이터를 excp7_box에 전달합니다.
해당 숫자를 모두 더한 값에서 짝수일 경우 "짝수의 값 입니다." 라고 출력하며, 홀수 값이 발생 하였을 경우
올바른 값이 아닙니다." 라는 메세지를 출력합니다.
단, 숫자가 아닌 문자로 처리 되었을 경우 예외처리가 발생 해야 합니다.

[힌트]
1. excp7에서 scanner 및 빈 클래스 배열이 적용
2. excp7에서 사용자가 총 6회 질문에 숫자를 입력함
3. 6개의 배열 데이터가 완료 되었을 경우 excp7_box에 메소드로 전달(클래스 배열)
4. 해당 배열 중 모든 배열 값을 더함.
5. 짝수, 홀수에 대한 결과값을 출력
6. 숫자가 아닌 문자로 사용자가 입력한 값은 예외처리 해야함.
http://mekeyace.kbsn.or.kr/excp.txt
*/

public class excp7 {
	// 강사님 코드
	//int ar[]; - 내 코드에서 사용
	public static void main(String[] args) {
		excp7_box eb = new excp7_box(); //new excp7_box(); 메소드가 2개니 얘를 아예 필드에 둬버림
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
	
		try {
			for(;;) {
				
				if(data.size()<6){ //최대 클래스 배열에 값이 6개 까지 반복 조건
				System.out.println("숫자를 입력해 주세요 : ");
				String userkey = sc.next();
				Integer ckno = eb.user_check(userkey); //해당 메소드로 전달
			
				if(ckno!=null) {
					data.add(ckno);
				
					}
				}
				else {
					break;
				}					
			}
		}
		
		catch (Exception e) {
			System.out.println("해당 컨트롤로 코드 문제 발생!!");
		}
		
		finally { //얘는 무조건 실행됨.
			sc.close();
			
		}
		
		eb.result(data); //배열을 던질거다. result로 
		//excp7_box.java에 있는 result 메소드로 클래스 배열값을 전달
		
		
		
		
		
		
		
		
		/*
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		
		
		while(true) {
			System.out.println("숫자를 입력해라(종료:-1입력): ");
			String input = sc.next();
			if(input.equals("종료")||input.equals("-1")) {
				break;
			}
			
			try {
				int num = Integer.parseInt(input);
				ar.add(num);	
			}catch(NumberFormatException a){
				System.out.println("잘못된 입력 숫자만 입력");
			}
		}

		excp7_box eb=new excp7_box();
		eb.input(ar);
		*/
	}

}



