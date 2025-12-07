package ex;

import java.util.ArrayList;

/* http://mekeyace.kbsn.or.kr/muser.txt
응용문제 2번 stirng data[][] 자료형에 있는 원시배열 데이터를 활용하여
다음과 같이 출력되는 클래스 배열 구조를 코드로 제작합니다.
[결과]
[[대한민국,40],[일본,35],[중국,70],[베트남,55],[태국,32]]
*/
public class ex_혼자해보기2 {

	public static void main(String[] args) {
		new ex_혼자해보기2_box().abc();

	}

}

class ex_혼자해보기2_box{
	public void abc() {
		String data[][] = {
				{"대한민국","일본","중국","베트남","태국"},
				{"40","35","70","55","32"}
		};
		
		ArrayList<ArrayList<String>> al2 = new ArrayList<ArrayList<String>>();
		for(int i=0; i<data[0].length; i++) {
			ArrayList<String> al = new ArrayList<String>();
			for(int ii=0; ii<data.length; ii++) {
				al.add(data[ii][i]);
				
			}
			al2.add(al);
			
		}
		System.out.println(al2);				
	
	
	}
}









