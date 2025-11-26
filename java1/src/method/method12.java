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
		method12_box mb=new method12_box();
		mb.aaa();

	}

}

/*Scanner을 이용하여 다음과 같이 출력되도록 합니다.
[실행]
통신사 이름을 입력하세요 : KT

[결과]
KT : 서은진, 강휘 */


class method12_box{
	Scanner sc=new Scanner(System.in);
	
	public void aaa() {
		
		String info[][]={
				{"김민지","서은진","김선숙","명동건","강휘"},
				{"A","B","AB","O","B"},
				{"SKT","KT","LGT","LGT","KT"}
				};
		
		
		System.out.println("통신사 이름을 입력하세요: ");
		String input=sc.next();
		
		System.out.println(input+" : ");
		//System.out.println(Arrays.deepToString(user));
		
		boolean first=true;
		for(int i=0; i<info[0].length; i++) {
			if(info[2][i].equals(input)) {
				if(!first) System.out.printf(",");
				System.out.println(info[0][i]);
					first=false;
				}
			}
		}
	}



