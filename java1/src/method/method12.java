package method;

import java.util.Arrays;
import java.util.Scanner;

//배열을 이용한 최종 응용편
//http://mekeyace.kbsn.or.kr/java_arr.txt
/*
{"김민지","서은진","김선숙","명동건","강휘"},
{"A","B","AB","O","B"},
{"SKT","KT","LGT","LGT","KT"}

Scanner을 이용하여 다음과 같이 출력되도록 합니다.
[실행]
통신사 이름을 입력하세요 : KT

[결과]
KT : 서은진, 강휘 
*/

public class method12 {

    public static void main(String[] args) {
        method12_box mb = new method12_box();
        StringBuilder r = mb.result();  // 수정된 부분
        System.out.println(r);
    }
}

/*Scanner을 이용하여 다음과 같이 출력되도록 합니다.
[실행]
통신사 이름을 입력하세요 : KT

[결과]
KT : 서은진, 강휘 */


class method12_box{
	
		//강사님 코드
		private String data[][]={
		{"김민지","서은진","김선숙","명동건","강휘"},
		{"A","B","AB","O","B"},
		{"SKT","KT","LGT","LGT","KT"}
		
	};
	
	//외부를 void가 아니라 StringBuilder로 선언을 했으니 반드시 외부 클래스에 return이 있어야 하고, 본 클래스에 
	//sysout을 시켜야한다.
		
				
	private Scanner sc=null;
	private String corp=null; //통신사 이름
		
	public StringBuilder result() { //method12_arr에서 메소드 배열 및 인터페이스 라이브러리 작동
			this.sc=new Scanner(System.in);
			System.out.println("통신사 이름을 입력하세요: ");
			this.corp=this.sc.next().intern();
			//intern(); => equals 없이 비교연산기호(==) 사용 가능
			
			//StringBuilder: 문자열을 이어붙이기 할 수 있는 클래스
			StringBuilder sb= new StringBuilder();
					
			int w=0;
			while(w<this.data[0].length) {
				if(this.data[2][w]==this.corp) {
					sb.append(this.data[0][w]+","); //append: 문자열 노드 형태로 추가(+=) / 복합연산자랑 비슷한 형태
				}
				w++;
		}
			
		sb.delete(sb.length() -1, sb.length()); 
		// sb.delete: 문자열을 삭제하고자 하는 클래스(삭제 하고자 하는 문자열 갯수, 삭제 후 문자열 갯수)(start,end-1)
		// 그 파이썬에 슬라이싱하고 같은 맥락
		// -1이면 전체 sb 갯수에 맨 마지막꺼(,)를 삭제하겠다.
		
		//System.out.println(sb);
		this.sc.close();
		return sb; //toString() => 문자로 바꿔버리는 역할 / 배열이나 문자열(StringBuilder)을 String으로 변환
	}
}



// 내코드
//		String info[][]={
//				{"김민지","서은진","김선숙","명동건","강휘"},
//				{"A","B","AB","O","B"},
//				{"SKT","KT","LGT","LGT","KT"}
//				};
//		
//		
//		System.out.println("통신사 이름을 입력하세요: ");
//		String input=sc.next();
//		
//		System.out.println(input+" : ");
//		//System.out.println(Arrays.deepToString(user));
//		
//		boolean first=true;
//		for(int i=0; i<info[0].length; i++) {
//			if(info[2][i].equals(input)) {
//				if(!first) System.out.printf(",");
//				System.out.println(info[0][i]);
//					first=false;
//				}
//			}
//		}
//	}



