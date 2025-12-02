package dto;

import java.util.*;


//exception: 예외처리(버그 및 오동작 발생)
public class excp1 {

	public static void main(String[] args) {
		//etc) 단어 검색하는 메소드
		String text="보노하우스 맥스 서랍장 2단";
		boolean ck = text.contains("자바"); //true: 단어포함, false: 미포함 단어
		//System.out.println(ck);
		
		/*
		int ck = text.indexOf("맥스"); 
		//양의정수 : 단어가 포함되어 있음.
		//음의정수 : -1(없음)
		//System.out.println(ck);
		if(ck==-1) {
			System.out.println("해당 되는 단어가 없습니다.");
		}
		else {
			System.out.println("해당 되는 단어가 포함되어 있습니다.");
		}
		*/
		//excp1_box eb = new excp1_box(); //이렇게 해도 되는데 즉시실행 때문에 아래처럼 씀
		
		new excp1_box();
	}
	

}



class excp1_box{
	Scanner sc = null;
	public excp1_box() { //즉시 실행시키겠다는 코드
		this.sc = new Scanner(System.in);
		this.abc();
	}
	private void abc() {
		try {
		System.out.println("숫자만 입력하세요: ");
		Integer a = this.sc.nextInt();
		//String a = this.sc.nextLine();
		//Integer b = Integer.parseInt(a);
		System.out.println(a);
		}
		
		//java.lang.NumberFormatException: For input string: "ㄹㅇㄹ"
		//예외처리를 해야하는 코드 내용이 나온다.
		//실무에서는 얘 하나만 때린다.
		//얘 밑으로는 catch 사용 못함
		//얘 하나만 잡아놓으면 예외처리 시킬 수 있는 코드 볼 수 있음.
		//Exception : try ~ catch [try: 정상적인 프로세서 실행, catch: 비정상적인 오류발생]
		//finally: 버그 또는 오류가 발생시 임시 조치를 적용한 구조
		
		/*
		 1. 사용자가 입력실수로 인한 정보전달이 안되는 경우
		 2. 개발자가 프로그램 오류시 정확한 오류 파악을 하기 위한 수단
		 3. 강제 프로세성,ㅣ 대한 정보 수집 및 종료 하기 위한 수단
		*/
		
		catch(Exception ex) { //제일 상위 예외처리 (부모격) exception
			System.out.println(ex);
			ex.printStackTrace(); //오류 발생 시 해당 라인을 확인하는 목적
			//System.exit(0);
		
		/*//Exception의 자식 오류 처리 형태
		catch (NumberFormatException ne) {
			System.out.println("숫자변환 오류");
		}
		catch (InputMismatchException ie) {
			System.out.println("숫자입력 오류");
		}
		
		catch(ex) {
			
		}*/
		
		
		}
		//catch에서 오류 발견시 버그 수정하는 부분 finally
		finally {
			System.out.println("입력 오류가 발생 하였으므로, 프로세서를 재실행 합니다.");
			
			//전체 즉시실행 메소드부터 다시 재실행 하도록 설정
			//new excp1_box(); //일단 오류 발생했으니 다시 실행해
			
		
			
		}
		
	}
}


