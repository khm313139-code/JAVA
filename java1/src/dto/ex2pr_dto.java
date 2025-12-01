package dto;

import java.util.*;


class ex2pr_dto_box{
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
}



public class ex2pr_dto{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<ex2_dto> list=new ArrayList<>(); //이거 object로 놓고 해도 되는지 아니면 지금은 string만 다루고 있으니 string만 해야하는지
		ex2pr_dto_box box=new ex2pr_dto_box(); //ex2pr_dto_box 이거 변수명은 아무거나 해도 되는지
		for(int i=0; i<box.product.length; i++) {
			ex2_dto dto=new ex2_dto(); //dto로 넘겨주기 위한 공간 할당
			//System.out.println(i);
			dto.setPrnm(box.product[i][0]);
			dto.setDsok(box.product[i][1]);
			dto.setPrpr(box.product[i][2]);
			dto.setDcpr(box.product[i][3]);
			dto.setRe(box.product[i][4]);
			dto.setEa(box.product[i][5]);
			list.add(dto);
		}
		
		
		
		
		System.out.println("검색할 상품명을 입력하세요: ");
		String prname=sc.nextLine();
		for(int i=0; i<list.size(); i++) {
			ex2_dto dto=list.get(i);
			if(dto.getPrnm().equals(prname)) {
		
				System.out.println("상품명: "+dto.getPrnm());
				if(dto.getDsok().equals("Y")) {
				System.out.println("상품가격: "+dto.getPrpr());
				System.out.println("할인가격: "+dto.getDcpr());
				}
				else {
					System.out.println("상품가격: "+dto.getPrpr());
				}
			if(!dto.getRe().isEmpty()) {
			System.out.println("추천수: "+dto.getRe());
			}
			if(!dto.getEa().isEmpty()) {
			System.out.println("수량: "+dto.getEa());
			}
			}
			
		}
		
	}
}


