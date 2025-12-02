package dto;

import java.util.*;
//dto 없이 코드 짜는 내용
//git에 강사님 코드 있음.

public class ex2 {

	public static void main(String[] args) {
		ex1_box eb = new ex1_box();

	}

}

class ex1_box{
	Scanner sc =null;
	List<String> al = null; //1차 배열 구성 / 이거 링크드도 잡을 수 있으니까 list로 잡아둔 것(인터페이스)
	ArrayList<List<String>> all = null; //2차 배열 구성
	
	/* list를 2차 배열로 잡아두면 linkedlist로 핸들링할 수 있다.
	ArrayList<Integer> no=null;
	List<ArrayList<Integer>> all2 =new LinkedList<ArrayList<Integer>>(); 
	*/
	
	String product[][] = {
			{"솔브리빙 논슬립 내구성 좋은 고급형 옷걸이","Y","37000","30400","17","250"},
			{"코끼리리빙 문걸이 전신거울","Y","265740","258120","2","310"},
			{"리빙스타 스탠드 행거 트리","Y","46700","35900","23","16"},
			{"스피드랙 업그레이드형 홈던트하우스 철제 선반","N","35900","","","33"},
			{"보노하우스 슬림서랍장 4단","N","30400","","","70"},
			{"보노하우스 맥스 서랍장 2단","Y","141000","54900","61","120"},
			{"스피드랙 업그레이드형 홈던트하우스 철제 선반 3단","Y","144160","132740","7","44"},
			{"스피드랙 업그레이드형 홈던트하우스 조립식 행거","N","30400","","","57"},
			{"리빙스타 모던 스탠드 행거 화이트","Y","29900","23900","20","314"}
	};
	
	public ex1_box() { //즉시 실행 코드
		this.sc = new Scanner(System.in);
		this.all = new ArrayList<List<String>>(); //2차 빈 배열
		
		//원시 배열 형태를 => 1차 배열로 만들고 => 2차 배열에 전달 / 이 밑에 코드는 재귀 메소드 실행을 위해서 여기에 삽입해서 돌림
		//이거를 abc안에 넣어버리면 돌릴때마다 밑에 코드를 도는데 효율적으로 좋지 않다.
		int f;
		for(f=0; f<this.product.length; f++) {
			this.al = new ArrayList<String>(Arrays.asList(product[f])); //하나의 그룹에 하나로 묶어서 넣어버림
			this.all.add(this.al);
			//System.out.println(al);
		}
		
		this.abc();
		
	}
	
	public void abc() {
		//System.out.println(this.all.get(4).get(2)); //2차 클래스에서 해당 그룹에서 데이터를 출력
		//System.out.println(all);
		System.out.println("검색할 상품명을 입력하세요 (종료:exit): ");
		String pdnm = this.sc.nextLine(); //nextLine() 이거는 한칸 띄어쓰기 입력까지 받는 역할임 / 스페이스 바를 입력 후 적용된 단어도 포함.
		
		if(pdnm.equals("exit")) {
			System.out.println("프로세스 종료");
			this.sc.close();
			System.exit(0);
		}
		
		//2차 클래스에 있는 그룹단위로 반복문을 이용하여 데이터를 검토하는 코드
		boolean found = false;

		for(int i=0; i<all.size(); i++) {
		    List<String> item = all.get(i); // i번째 상품 리스트
		    
		    if(item.get(0).equals(pdnm)) { // 상품명 비교
		        System.out.println("상품명 : " + item.get(0));
		        
		        // 할인 여부에 따라 출력
		        if(item.get(1).equals("Y") && !item.get(3).isEmpty()) {
		            System.out.println("상품가격 : " + item.get(2));
		            System.out.println("할인가격 : " + item.get(3));
		        } else {
		            System.out.println("상품가격 : " + item.get(2));
		        }

		        // 추천수와 수량이 있으면 출력
		        if(!item.get(4).isEmpty()) System.out.println("추천수 : " + item.get(4));
		        if(!item.get(5).isEmpty()) System.out.println("수량 : " + item.get(5));
		        
		        found = true;
		        break;
		    }
		}
		//배열 클래스에 반복문으로 검토 하였을 경우 배열에 동일한 상품이 없을때 아래처럼 뜰 수가 있다.
		if(!found) {
		    System.out.println("해당 상품은 확인되지 않습니다.");
		}
		this.abc();
	}
	
}

