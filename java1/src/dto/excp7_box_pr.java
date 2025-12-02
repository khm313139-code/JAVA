package dto;

import java.util.ArrayList;

public class excp7_box_pr {
	public void input(ArrayList<Integer> a) {
		int sum = 0;
		for(int i=0; i<a.size();i++) {
			sum=sum+a.get(i);
		}
		//System.out.println(sum);
		if(sum%2==0) {
			System.out.println("합계는 짝수입니다.");
		}
		else {
			System.out.println("합계는 홀수입니다.");
		}
	}
}

