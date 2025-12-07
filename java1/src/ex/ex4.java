package ex;

import java.util.*;


public class ex4 {

	public static void main(String[] args) {
		Integer a[] = {10,20,30,40}; //원시배열
		ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(a)); //순차 탐색에서 빠름
		LinkedList<Integer> bb = new LinkedList<Integer>(); //양방향 형태의 배열
		Vector<Integer> cc = new Vector<Integer>(); //array와 linked의 중간 느낌
		/*
		 vector : 순차적으로 입력사항 느림(linked 보다도 느림) but 검색, 삽입은 arraylist보다 빠르다.
		 vector는 잘 사용하지 않는다. 오래된 배열 - 레거시 용으로 사용을 했는데 요즘에는 잘 사용하지 않는다.	 
		 */
		
		
		//System.out.println(aa);
		
		//2차 원시 배열 => 2차 클래스 배열로 변화
		ex4_box eb = new ex4_box();
		
	}

}

/* http://mekeyace.kbsn.or.kr/muser.txt
응용문제 2번 stirng data[][] 자료형에 있는 원시배열 데이터를 활용하여
다음과 같이 출력되는 클래스 배열 구조를 코드로 제작합니다.
[결과]
[[대한민국,40],[일본,35],[중국,70],[베트남,55],[태국,32]]
*/

class ex4_box {
	public ex4_box() { //즉시 실행
//		this.data();
//	}
//
//	
        String data[][] = {
            {"대한민국","일본","중국","베트남","태국"},
            {"40","35","70","55","32"}
        };
//        
//        //강사님 코드
//        
//        public void data() {
//        	
//        	
//        	//dto 버전
        	ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
//        	int w = 0;
//        	while(w<data[0].length) {
//        		ArrayList<String> result = this.al(data[0][w], data[1][w]); //return 받을때는 new 쓰면 안됨.
//        		all.add(result); //return 받은 1차 클래스 배열값을 2차 클래스 배열로 삽입
//        		w++;
//        	}
//        	
//        	System.out.println(all);
//        }
//        	
//        	
//        public ArrayList<String> al(String k, String n){ //1차 클래스 배열이 제작되는 메소드
//        	ArrayList<String> a = new ArrayList<String>();
//        	a.add(k);
//        	a.add(n);
//       
//        	return a;
//        	
        	
        	

        	
//        	//1.더블 반복문 안쓰고 돌리기
        	int w=0;
        	while(w<data[0].length) { //5바퀴
        		ArrayList<String> a = new ArrayList<String>();
        		a.add(data[0][w]);//[그룹번호][데이터번호]
        		a.add(data[1][w]);
        		all.add(a);
        		w++;
        	}
        	System.out.println(all);



        	
        	
//        	//2.더블 반복문
//        	int w=0;
//        	while(w<data[0].length) { //5바퀴
//        	ArrayList<String> a = new ArrayList<String>();
//        	
//        	int ww=0;
//        	while(ww<data.length) {
//        		a.add(data[ww][w]);
//        		ww++;
//        	}
//        	all.add(a);
//        	w++;
        
        
        	
        	
        	
          //내코드
//        ArrayList<ArrayList<String>> arr2 = new ArrayList<ArrayList<String>>();
//        for (int i=0; i<data[0].length; i++) {
//        	ArrayList<String> arr1 = new ArrayList<>();
//        	for(int ii=0; ii<data.length; ii++) {
//        		arr1.add(data[ii][i]);
//        	}
//        	//System.out.println(arr1);
//       
//        	arr2.add(arr1);
//     }
//        System.out.println(arr2);
//	}

//	}		System.out.println(all);
        	
        	
    }
}
















