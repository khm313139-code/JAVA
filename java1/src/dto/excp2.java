package dto;
//예외처리로 버그 발생시 수정 후 프로세서를 최종 설정


//unboxing(언박싱), boxing(박싱)

/*
int => Integer클래스(박싱 상태) - heap 영역 메모리
int box = 500;
Integer box = null;

Integer => itn(언박싱 상태) - stack 영역

int랑 integer랑 완전히 다름 int는 자료형 integer는 클래스 전혀 다르다.
완전히 영역이 다름.
*/


public class excp2 {

	public static void main(String[] args) {
		int b=0;
		String a=null; //이런 변수들을 필드에 올려놔야 예외처리 가능
		
		
		Integer it = new Integer(500); //Integer는 클래스니까 new 때릴 수 있음. Integer많이 쓰면 성능적으로는 느려질 수 있다.
		//Integer는 주로 null값 때리거나 ArrayList<Integer>여기에는 써야만 한다.
		//int unbox = it.intValue(); //int value로 클래스->자료형으로 수동으로 바꾼거고(수동-언박싱)
		int unbox = it; //이렇게쓰면 클->자로 자동으로 변환시켜주는 것.(auto-언박싱)
		System.out.println(unbox);
		
		
		
		try {
			a = "50a00bb";
			b =1000;
			b=b+Integer.parseInt(a); //1.  오류 발생 //기본 타입이 int(기본 정수를 사용)
			//b=b+integer.valuof(a); 위 아래 둘 중에 하나 쓰면 됨. //캐시메모리를 쓰면서 객체 타입이 바뀐다. 그래서 parseint를 쓰는게 좀 더 효율적
			//b=b+integer.valuof(a).intvalue(); //얘는 사실 .intvalue()이게 뒤에 찍혀있음. b가 만약 int라면 parseInt를 쓰는게 효율적
			//valueof는 b가 만약 integer일 경우 쓰는게 효율적
		}
		catch (NumberFormatException ne) {
			a=a.replaceAll("[a-zA-Z]", ""); //[a-zA-Z] 정규식 코드 -> 소문자 대문자 A-Z까지 문자 중 하나라도 있으면 ""으로 대체해라
			//만약 replace만 사용하면 50a00bb여기서 a까지만 검사를 함 뒤에 bb는 검사를 안함. 그러니까 또 오류 발생해서 catch(Exception e) { 여기로 넘어감.
			//2. 정규식 코드 [a-zA-Z]: 사용자가 입력한 값을 수정
			//3. 재실행
			b =1000;
			b=b+Integer.parseInt(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//finally { // finally는 무조건 실행이 됨. :try 상태도 작동, catch 상태에서도 작동
		//but 구문에서는 finally를 안써도 상관이 없다.
			
		
		
		System.out.println(b); //최종 결과 //b를 선언하면 출력이 안되는데 b가 지금 try 안에 있으니 지역변수가 되어버려 활용할 수 없음.

	}

}
