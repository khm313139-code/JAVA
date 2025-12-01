package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//클래스 배열 => LinkedList (push: 배열 기준으로 맨 앞에 데이터 추가)
//ArrayList => 순차적으로 데이터 값을 적용할 경우 빠름 - 데이터 출력(순방향)
//LinkedList => 배열에 특정 노드 사이사이에 검색 또는 추가 할 경우 빠름. (순방향, 역순 검색) - 밑에 속도 비교 있음.
public class array11 {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();//클래스배열
		al.add(10);
		al.add(20);
		al.add(30);
		//System.out.println(al);
		
		Integer data[]= {100,200,300};
		LinkedList<Integer> al2 = new LinkedList<Integer>(Arrays.asList(data));
		//System.out.println(al2);
		al2.push(500); //LinkedList에만 적용되는 특정 메소드
		al2.addFirst(1000); //배열 기준 맨 앞
		al2.addLast(2000); //배열 기준 맨 마지막
		al2.pop(); //배열 기준 맨 앞에 있는 데이터 삭제
		//System.out.println(al2);
		//removeLast(): 데이터 기준 맨 뒤에서 부터 삭제
		
		al2.removeLast(); //remove는 first: 데이터 기준 맨 앞에서 부터 삭제 , last가 있다.
		//System.out.println(al2); //무조건 배열의 앞에 삽입이 된다.
		al2.getLast(); //배열에 맨 마지막 값을 가져온다.
		al2.getFirst(); //배열에 맨 앞에 있는 값을 가져온다.
		
		
		
		ArrayList<Integer> al3 = new ArrayList<Integer>(); //얘는 add가 기준이라 addfirst나 addlast는 없다.
		al3.add(100);
		al3.add(150);
		al3.add(200);
		//System.out.println(al3.get(0));
		arr_check ac= new arr_check();
		ac.checked();
	}

}




class arr_check{
	public void checked() {		
	LinkedList<Integer> data1 = new LinkedList<Integer>();
	ArrayList<Integer> data2 = new ArrayList<Integer>();
	

	/* 순차적으로 데이터를 적용한 사항 */
	// 링크드는 노드 사이사이가 빠름
	// 어레이는 순차적으로 찍는게 빠름
	//시작시간
	long start = System.currentTimeMillis();
	Integer w =0;
	do {
		//data1.add(w);
		data2.add(w);
		w++;
	}while(w<=150000);
	
	//종료시간
	long end = System.currentTimeMillis();
	long timer=end-start; //시간차 확인
	System.out.println(timer);
	
	
	/*데이터를 랜덤하게 노드 사이사이에 값을 적용할 경우 */
	long start2 = System.currentTimeMillis();
	
	Integer w2 =0;
	int no2 = 0;
	do {
		//data1.add(no2,w2);
		data2.add(no2,w2);
		no2+=2; //중간 데이터를 삽입하기 위한 변수
		w2++;
	}while(w2<=500);
	
	long end2 = System.currentTimeMillis();
	long timer2=end2-start2; //시간차 확인
	System.out.println(timer2);
	
	
	
	/*출력결과
	 * 7 => data1 open
	 * 0
	 * 
	 * 
	 * 8 => data2 open
	 * 19
	 */
	
	
	
	
	
	
	}
}


