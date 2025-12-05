package ex;

import java.util.*;

public class ex5 {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		
		data.add("권하민");
		data.add("김고운");
		data.add("김동완");
		data.add("김예빈");
		data.add("박순수");
		data.add("신범석");
		data.add("허대회");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 이름을 입력하세요 : ");
		String usernm = sc.next();
		data.add(0,usernm); //add는 두가지 방식(노드번호, 데이터) or (데이터)
		
		int w = 0;
		while(w < data.size()) {
			if(data.get(w).equals(usernm)) {
				data.remove(w);
				
			}
			w++;
		}
		System.out.println(data);
		//data.remove(0); //배열의 노드 번호
	

	
//		// 삭제할 요소를 따로 저장
//        ArrayList<String> toRemove = new ArrayList<>();
//        for (String a : data) { // 포이치 그대로 사용
//            if (a.equals(usernm)) {
//                toRemove.add(a);
//            }
//        }
//
//        // 저장한 요소 제거
//        for (String r : toRemove) {
//            data.remove(r);
//        }
//
//        System.out.println(data);
	
	
		//first, last: add, remove, get
        //LIFO : 후입선출 => offer, poll
        //FIFO : 선입선출 => push, pop
        
		LinkedList<String> info = new LinkedList<String>();
		info.addFirst("신범석");
		info.addLast("김예빈"); //last는 제일 마지막에 추가
		info.addFirst("김동완");
		info.push("허대회"); //push는 맨 앞에 추가
		//info.pop(); //빈칸이면 맨 뒤에 있는 데이터 삭제
		//info.poll(); //poll 사용해도 데이터 삭제
		System.out.println(info);
		
		
		LinkedList<String> aa = new LinkedList<String>(); //fifo
		aa.offer("자바1");
		aa.offer("자바2");
		System.out.println(aa);
		LinkedList<String> bb = new LinkedList<String>(); //lifo
		bb.push("자바1");
		bb.push("자바2");
		System.out.println(bb);
	}
}







class ex5_box{
	

public void aaa() {
	
	}

}