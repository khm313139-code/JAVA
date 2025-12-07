package dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex1_pr_2025_12_07 {

	public static void main(String[] args) {
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
		
		
		ArrayList<ex1_pr_2025_12_07_dto> al = new ArrayList<>();
		
		for(int i = 0; i<product.length ; i++) {
		ex1_pr_2025_12_07_dto dto = new ex1_pr_2025_12_07_dto();
		dto.setPrnm(product[i][0]);
		dto.setDsok(product[i][1]);
		dto.setPrpr(product[i][2]);
		dto.setDspr(product[i][3]);
		dto.setRe(product[i][4]);
		dto.setEx(product[i][5]);
		al.add(dto);
		
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 상품명을 입력하세요: ");
		String input= sc.nextLine();
		
		boolean found =false;
		for(int j = 0; j<al.size();j++) {
			if(al.get(j).getPrnm().equals(input)) {
				found = true;
				System.out.println("상품명: "+al.get(j).getPrnm());
				System.out.println("상품가격: "+al.get(j).getPrpr());
				if(al.get(j).getDsok().equals("Y")) {
				System.out.println("할인가격: "+al.get(j).getDspr());
				System.out.println("추천수: "+al.get(j).getRe());
				}
				System.out.println("상품가격: "+al.get(j).getEx());
			}
			}
		if(found == false) {
			System.out.println("해당 상품은 확인되지 않습니다.");
		}
	}

}
