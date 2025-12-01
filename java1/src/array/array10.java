package array;

import java.util.ArrayList;
import java.util.Arrays;



//2차 클래스 배열 => 1차 클래스 배열 => 데이터를 추가하는 형태
//public class array10 {
////
//public static void main(String[] args) {
//   Integer a[][] = {
//           {10,20,30}, //0번 그룹
//           {100,200,300} //1번 그룹
//
//   };




		/* 책에서 나온 배열 for문
      // 2차 클래스
      ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
      
      int f, ff;
      for(f=0; f<a.length; f++) {
          // 1차 클래스
          ArrayList<Integer> al = new ArrayList<Integer>(); // 반복문이 작동하면서 초기화가 되도록 하는 형태
          for(ff=0; ff<a[0].length; ff++) {
              al.add(a[f][ff]); // 원시 배열에서 1차 클래스로 값을 전달
          }
          all.add(al); // 1차 클래스 배열값을 2차 클래스 배열로 삽입
      }
      
      System.out.println(all);
      
	}
}*/
		
		
		
		/* 실무 환경 원시배열 => 클래스 배열로 변환
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		int f;
		for(f=0; f<a.length; f++) {
			ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a[f]));
			all.add(al);
		}
		System.out.println(all);
	}

}*/



/*
응용문제 1
{
{"권하민","김고운","김동완","김예빈"},
{1000,1500,2200,3300},
{"A형","AB형","B형","O형"}
};

해당 원시 배열의 데이터 중 포인트가 2000 이상인 고객 정보만 2차 배열로 저장되도록 코드를 작성하시오.

[결과]
[[김동완,김예빈],[2200,3300],[B형,O형]]
*/

/*
//(강사님 코드 예시2)
public class array10 {
	
	// 원시 데이터 배열: 이름, 포인트, 혈액형
	
    private Object data[][] = {
        {"권하민","김고운","김동완","김예빈"},
        {1000,1500,2200,3300},
        {"A형","AB형","B형","O형"}
    };

    private ArrayList<ArrayList<Object>> all = null;
    private ArrayList<Object> al = null;

    public static void main(String[] args) {
        array10 obj = new array10();
        obj.ccc();
    }

    public void ccc() {
        this.all = new ArrayList<ArrayList<Object>>();

        int w = 0;
        while (w < data.length) { // 4 반복
                this.al = new ArrayList<Object>();
                int ww = 0;
                while (ww < this.data[0].length) { // 4번 반복 고객명, 포인트, 혈액형
                	if (Integer.parseInt(this.data[1][ww].toString()) >= 2000) {
                	//System.out.println(this.data[w][ww]);
                	this.al.add(this.data[w][ww]);
                }
                ww++;
            }
            this.all.add(this.al);
            w++; // 바깥 while에서만 증가
        }

        System.out.println(this.all);
    }
}
*/


//(강사님 코드 예시1)
//	public void bbb() {
//		this.all=new ArrayList<ArrayList<Object>>(); //2차 빈배열을 생성
//		int f;
//		for(f=0; f<this.data[0].length; f++) { //데이터 갯수만큼 반복문 반복
//			this.al=new ArrayList<Object>();
//			//if((int)this.data[1][f]>=2000) {
//			
//			// 배열 기준 1번 그룹의 값을 조건문에 체크
//			if(Integer.parseInt(this.data[1][f].toString())>=2000) {
//				this.al.add(this.data[0][f]);
//				this.al.add(this.data[1][f]);
//				this.al.add(this.data[2][f]);
//				this.all.add(this.al);
//			}
//		}
//			System.out.println(all);
//	}
	
	
	


// 문자와 숫자가 섞여있는 Object 설명

//	public void aaa() {
//	    //Object 배열은 문자로 변환후 숫자로 검토를 하는 형태의 구조를 적용해야만 사용 가능하다.
//	    Object a[] = {"문자", 23, "test@nate.com"};
//	    System.out.println(Arrays.toString(a)); //오브젝트는 문자화로 적용을 해야지 값이 나온다.
//	    if (Integer.parseInt(a[1].toString()) < 25) {
//	        //System.out.println(a[0]);
//	    if (a[2].equals("test@nate.com")) {
//	         System.out.println("정상적인 이메일");
//	        }
//	    }
//	}




	

//(응용문제 내가 푼 것)
//			public static void main(String[] args) {
//	        Object a[][] = {
//	            {"권하민","김고운","김동완","김예빈"},
//	            {1000,1500,2200,3300},
//	            {"A형","AB형","B형","O형"}
//	        };
//
//	        ArrayList<Object> names = new ArrayList<>();
//	        ArrayList<Object> points = new ArrayList<>();
//	        ArrayList<Object> bloods = new ArrayList<>();
//	        
//	        for (int i = 0; i < a[0].length; i++) { // 열 기준 4번
//	           //System.out.println(i);
//	        	int point=(int)	a[1][i];
//	        	
//	        	if(point>=2000) {
//	        		names.add(a[0][i]);   // 이름
//	                points.add(a[1][i]);  // 포인트
//	                bloods.add(a[2][i]);  // 혈액형
//	        	}
//	        }
//	        System.out.println(names);
//	        System.out.println(points);
//	        System.out.println(bloods);
//	    }
//	}


