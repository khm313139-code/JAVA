package dto;

import java.util.ArrayList;

public class excp7_box {
	public void input(ArrayList<Integer> a) {
		int sum = 0;
			for (int i=0; i<a.size(); i++) {
				
			//System.out.println(i);
			int num = a.get(i);
			sum+=num;
			
			}
		//System.out.println(sum);
		if(sum%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
			
		}
	}
}

