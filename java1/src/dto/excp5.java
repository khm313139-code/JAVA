package dto;
//exception 예외처리 클래스
public class excp5 {

	public static void main(String[] args) {
		try {
		new excp5_box().abc("123");
		}catch(Exception e) {
			System.out.println("메인 코드 : "+ e);
			//e.printStackTrace();
		}
	}

}

/*
throws: 예외가 발생할 수 있는 오류를 미리 선언(호출자 잘못)
throw: 예외처리가 발생 되었을 때 해당 호출한 메소드로 return 결과로 보냄(호출 받은 사람 잘못)
*/

class excp5_box{
	public void abc(String a) throws Exception{ //throws 쓰는 순간 main에서는 try-catch써야함
		Integer k = Integer.valueOf(a)+ Integer.valueOf("200");
		System.out.println(k);
		
		throw new Exception(); //밑에 내용 실무코드
		
		
		
		
		
		/*
		//throw 사용시 메소드에서 throws를 사용해야만 합니다.
		Exception ep = new Exception(); //exception 클래스 호출
		//throw == return - 예외처리 결과를 return하는 것과 같은 의미 throws랑은 다르다.
		throw ep; //이렇게 작성하면 내 코드의 모든 오류는 상대방 catch로 날라가서 상대방이 내 오류코드를 볼 수 있음.
		//코드에 가장 아래에 적용하게 된다. 오류 발생시 자신을 호출한 클래스 메소드에 오류 메세지를 전송함.
		//throw 쓰면 웬만해서 내 코드에서는 try-catch 안쓴다.
		*/
	}
}