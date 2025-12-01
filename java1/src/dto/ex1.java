package dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//http://mekeyace.kbsn.or.kr/product_arr.txt
//응용문제 1
//해당 상품 원시배열에서 클래스 배열로 전환 후 사용자가 다음과 같이 상품명을 검색 하였을 경우
//해당 상품 정보가 출력되는 코드를 작성합니다.
//[실행]
//검색할 상품명을 입력하세요: 보노하우스 맥스 서랍장 2단

//[결과]
//상품명:보노하우스 맥스 서랍장 2단
//상품가격: 141000
//할인가격: 54900
//추천수: 61
//수량: 120

//[실행2]
//검색할 상품명을 입력하세요: 스피드랙 업그레이드형 홈던트하우스 철제 선반

//[결과]
//상품명:스피드랙 업그레이드형 홈던트하우스 철제 선반
//상품가격: 30400
//수량: 33

//[실행3]
//검색할 상품명: 삼성
//[결과]
//해당 상품은 확인되지 않습니다.


public class ex1 {

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
		
		
		
		ex1_dto dtoArr[][]=new ex1_dto[product.length][1];
		
		for(int i=0; i<product.length; i++) {
			dtoArr[i][0] = new ex1_dto();
				dtoArr[i][0].setPrnm(product[i][0]);
				dtoArr[i][0].setDcok(product[i][1]);
				dtoArr[i][0].setPrpr(product[i][2]);
				dtoArr[i][0].setDcpr(product[i][3]);
				dtoArr[i][0].setReco(product[i][4]);
				dtoArr[i][0].setEa(product[i][5]);
		
		    }
		 Scanner sc = new Scanner(System.in);
	        System.out.print("검색할 상품명을 입력하세요: ");
	        String search = sc.nextLine();

	        boolean found = false;
	        for (int i = 0; i < dtoArr.length; i++) {
	            ex1_dto dto = dtoArr[i][0]; // 0번째 열
	            if (dto.getPrnm().equals(search)) {
	                System.out.println("상품명: " + dto.getPrnm());
	                System.out.println("상품가격: " + dto.getPrpr());
	                if (!dto.getDcpr().isEmpty()) {
	                    System.out.println("할인가격: " + dto.getDcpr());
	                    System.out.println("추천수: " + dto.getReco());
	                }
	                System.out.println("수량: " + dto.getEa());
	                found = true;
	                break;
	            }
	        }
	}
}

	
		

