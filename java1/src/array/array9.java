package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array9 {

	public static void main(String[] args) {
		array9_box ab=new array9_box();
		ab.bbb();

	}

}



class array9_box{
	public Scanner sc= new Scanner(System.in);
	String menu[] = {"햄버거", "피자", "치킨", "라면", "김밥", "커피" };
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(menu));
	
	public void bbb() {
		//System.out.println(al);
		ArrayList<String> al2 = new ArrayList<String>();
		//System.out.println(al2);
		for(;;) {
		System.out.println("1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료\r\n"
				+ "\"주문하고자 하는 음식을 선택해 주세요? \"");
		int input=sc.nextInt();
		
		
		if(input>=1 && input<=6) {
			al2.add(al.get(input-1));
			System.out.println("주문한 메뉴: " +al2);
		}else if(input==7) {
			System.out.println("주문 종료!");
			break;
			}
		}
		sc.close();
	}
}
