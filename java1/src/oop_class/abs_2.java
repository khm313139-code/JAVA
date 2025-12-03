package oop_class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class abs_2 {
	public abstract String userinfo();
	
	
	//현재 시간 출력 메소드를 로드해봐라
	public String today() {
		Date day = new Date(); //PC에 있는 시간 라이브러리를 이용하여 로드
		//SimpleDateFormat: 현재 Date라는 라이브러리 표현 단어를 자신이 원하는 형태로 변경
 		/*
		yyyy: 년도, MM: 월, dd: 일
		HH: 24시간, hh: 12시간
		mm: 분, ss: 초
		E: 요일
		Locale: 언어셋을 변경할 때 사용하는 라이브러리
		*/
		SimpleDateFormat sf=new SimpleDateFormat("yy-MM-dd");
		//SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		
		//SimpleDateFormat sf=new SimpleDateFormat("E",Locale.KOREA);
		String date = sf.format(day);
		//System.out.println(day);
		return date;
	}
}
