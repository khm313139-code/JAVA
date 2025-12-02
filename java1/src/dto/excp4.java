package dto;
//throws

public class excp4 {
	public static void main(String[] args) {
		try {
		new excp4_box().abc(1000,null); //즉시실행은 아님 즉시실행은 excp4_box 같은 클래스명으로
		//위 코드는 해당 클래스에 abc()라는 메소드를 선언과 동시에 실행.
		}
		
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}


//throws Exception: 외부 클래스에서 무조건 try-catch를 사용해야함. 또한 받는 데이터 값이 잘못되었을 경우
//외부 클래스에서 보내준 값이 잘못되었다고 외부 catch로 반환함.

class excp4_box{
	public void abc(int no, String z) throws Exception,NumberFormatException { //throws는 보내는 쪽 try-catch를 써서 잘잘못 가리자
		try {
			//int sum = no + Integer.parseInt(z); //int로 받으니 parseint
			String sum = no + String.valueOf(z);
			
			int test = Integer.parseInt(sum);//쓰면 안되는 코드
			System.out.println(test);
		}catch(Exception e) {
		
			System.out.println("에러발생:"+e);
		}
	}
}
