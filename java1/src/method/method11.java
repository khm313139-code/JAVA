package method;

import java.util.Arrays;

//배열을 선언하는 방식(실무위주)

public class method11 {

	public static void main(String[] args) {
		int arr[] = {10,20,30};
		int arr2[] = new int[2];
		String data[] = new String[] {"kbs","sbs","mbc","jtbc","채널A"};
		load_data ld = new load_data();
		ld.aaa();
		ld.bbb();
		ld.ccc();
	}

}


class load_data{
	String info[]=null; //필드에 선언해놨다. 빈공간을 만들어 놨다. 그걸 메소드 안에서 사용해야함.
	//해당 배열 변수는 모든 메소드에서 활용할 수 있도록 설정
	
	public void aaa() {
		this.info = new String[] {"A","B","C"}; 
		//그걸 가져와서 쓰려면 이렇게 빈공간을 만들고 사용해야함. / 필드에 선언된 배열 변수를 활용시 다음과 같이 적용하는 방식
	}
	
	public void bbb() {
		//this.info = new {"AA","BB","CC"}; //이건 필드꺼를 쓰는게 아니라 내가 생성해서 사용하는 것
		System.out.println(Arrays.toString(this.info));
		
	}
	
	
	
	//1차 원시 배열을 2차 원시 배열로 결합
	
	public void ccc() {
		String area[]= {"서울","경기도","인천"};
		String people[]= {"120000","6500","3200"};
		String total[][]= new String[area.length][2]; //2차 배열 크기 생성 3 2
		String total2[][]= new String[2][area.length];// 2 3
		
		for(int a=0; a<area.length; a++) {
			total[a][0] = area[a];
			total[a][1] = people[a];
		}
		
		/* 1차 배열을 2차 배열로 변환시 반복문 1개로 설정하여 변환함 */
		for(int i=0; i<area.length; i++) {
			/* 2차배열에 1차 배열 값을 알맞게 저장하는 공간 */
			total2[0][i] = area[i];
			total2[1][i] = people[i];
		}
		System.out.println(Arrays.deepToString(total));
		System.out.println(Arrays.deepToString(total2));
		
		
		

		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}