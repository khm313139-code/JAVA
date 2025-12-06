package week_broadcast1206;

//http://mekeyace.kbsn.or.kr/week.zip

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class week1 {
	//오름차순, 내림차순
	public static void main(String[] args) {
		Integer data[] = {3,6,1,5,9,12,8,16};
		Arrays.sort(data);
		Arrays.sort(data,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(data));
		/*
		ArrayList<Integer> data_all = new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(data_all);
		System.out.println(data_all);
		Collections.sort(data_all,Collections.reverseOrder());
		System.out.println(data_all);
		*/
	}

}
