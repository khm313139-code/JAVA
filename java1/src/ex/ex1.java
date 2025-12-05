package ex;

import java.util.Arrays;
import java.util.Random;

public class ex1 {
	/*
	//자료형 안배운 부분만
	byte - 정수형
	char - 문자형 ' '
	boolean - 논리형
	long => 10000L
	
	//클래스 모음
	string
	integer
	double
	float
	boolean 
	long
	*/
	public static void main(String[] args) {
		String str = "a1b2c3"; //얘를
		byte[] bt = str.getBytes(); //byte로 바꿔버림
		//System.out.println(Arrays.toString(bt)); //아스키 코드
		String str2 = new String(bt);
		System.out.println(str2);

		String a ="a1234"; //얘는 스택 영역으로 들어간다.
		String b ="a1234";
		String c = new String("a1234").intern(); //new 때리는 순간 heap 형식으로 메모리 공간에 들어가고
		//intern을 붙이면 값만 비교하게 되면 heap에서 값만 가져오게 되니 true가 뜨게 된다.
		String d = new String("a1234"); //여기도 new를 때렸으니 다른 공간임.
		
		/*
		 같은 자료형 또는 자료형 클래스라고 할지라도 new가 붙은 상황이면 인스턴스 영역(메모리)으로 변경 되므로 비교하는 상황이 달라질 수 있음.
		 */
		
		System.out.println(a==b); 
		System.out.println(a==c); //a랑 c가 결과 값이 같다고 해서 같은게 아님
		//System.out.println(a.equals(c));
		System.out.println(c==d); //절대 같은 거 아님 값은 같음 // ==은 영역까지 비교
		
		
		
		//StringBuilder, StringBuffer - 문자열을 효율적으로 상속받아서 처리하는 형태에 사용
		
		StringBuilder sb = new StringBuilder(); //new가 들어가면 heaps 영역 - 단일 쓰레드를 이용
		//얘의 최대 단점은 동기화가 안된다.
		//웹 브라우저 상태에서는 builder를 사용하는게 맞다.
		//속도가 빠르지만 안정성은 떨어진다. 데이터 로스가 날 수도 있음.
		sb.append("김고운");
		sb.append("님 환영합니다.");
		sb.insert(3, "(kimkowoon)"); //원하는 자리에 INSERT 가능하다. / 버퍼 빌더 상관없이 다 있음
		sb.delete(0, 5);
		System.out.println(sb);
		
		
		//앱 모바일 같은 앱을 개발할때는 버퍼를 사용하는게 맞다.
		//브라우저로 갔을때 버퍼를 잘못 사용하면 속도가 확연하게 느림을 체감할 수 있다.
		//장점은 안정성이 좋다.
		StringBuffer sf = new StringBuffer(); //장문의 글 같은 거 한번에 받을때 버퍼를 주로 사용 - 멀티 쓰레드를 이용
		sf.append("김예빈");
		sf.append(" 포인트는 0 입니다.");
		System.out.println(sf);
		
	
		
		
		//random 클래스를 활용한 부분
		int no = (int)(Math.ceil(Math.random()*10)); //이건 parseint 안된다.
		System.out.println(no);
		int no2 = (int)(Math.floor(Math.random()*10));
		System.out.println(no2);
		int no3 = (int)(Math.round(Math.random()*10));
		System.out.println(no3);
		
	
		Random rd = new Random();
		System.out.println(rd.nextInt(10)); //0~9까지 출력이 가능
		
		//if 1~10까지 나와야한다 그러면 아래처럼 만들면 된다.
		System.out.println(rd.nextInt(10)+1);
		//5~10
		System.out.println(rd.nextInt(6)+5);
		
		String alg="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; //보안 문자 난수 생성 random 이용하면 보안문자를 만들수가 있음.
		//웹이니 단일 쓰레드 사용
		StringBuilder password = new StringBuilder();
		
		for(int f = 0; f<8; f++) {
			int idx = rd.nextInt(alg.length());
			password.append(alg.charAt(idx));
		}
		System.out.println(password);
		
		
		
//		//새로운 클래스 ex 설명 예시
//		new bbx(); //이거 각각 서로다른 heap공간에 생성이 된다. 이런거 잘못 반복 돌리면 난리난다.
//		new bbx();
//		new bbx();
//		new bbx();
		
		
	}	

}


class bbx{
	
}
