package oop_class;

import java.util.ArrayList;
import java.util.Scanner;

public class ab5 {
//상품등록 페이지 프로세서
	/*
	abs_3.java를 상속시켜서 상품등록 페이지를 제작합니다.
	
	[실행]
	"상품명을 입력하세요: "
	"상품가격을 입력하세요: "
	"할인율을 입력하세요: "
	
	[출력]
	[냉장고,30000,10,27000,2025-12-04]
	*/
	public static void main(String[] args) {
		//할인율 적용하는 코드
		int money = 50000; //판매금액
		double sales = 0.1; //할인율
		int sales_money = money-(int)(money*sales); //할인금액
		//System.out.println(sales_money);
		new ab5_box();

	}

}

class ab5_box extends abs_3 {
	
	@Override
	public Integer check_no(String data) {
		
		return null;
	}
	@Override
	public void result() throws Exception {
		
		
	}
	@Override
	public void userin() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("상품명을 입력하세요: ");
		String pr=sc.nextLine();
		System.out.println("상품가격을 입력하세요: ");
		String pri=sc.nextLine();
		System.out.println("할인을 입력하세요: ");
		String dis=sc.nextLine();
		
		int price = Integer.parseInt(pri);
		int discount = Integer.parseInt(dis);
		
		int sale=price-(price*discount/100);
	
		
		sdata=new ArrayList<>();
		sdata.add(pr);
		sdata.add(pri);
		sdata.add(dis);
		sdata.add(String.valueOf(sale));
		this.sdata.add(this.todays());
		System.out.println(sdata);
	}
	
	
}