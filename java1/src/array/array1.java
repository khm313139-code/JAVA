package array;
//추가 자료형 및 형 변환 방법
public class array1 {

	public static void main(String[] args) {
		String a="1000"; //문자 자료형
		Integer b=Integer.valueOf(a); //문자 자료형을 숫자로 변환(형변환) 
		//int b=Integer.parseInt(a);
		System.out.println(b);
		
		
		
		int c=123456; //숫자 자료형
		//Integer c = 0123456; 
		
		
		
		//String.valueOf: 만약 0123456으로 시작하는 숫자일 경우 8진수 형태로 간주 주의해야함*****
		//String d= String.valueOf(c);//숫자 자료형을 문자로 변환(형변환) 
		//System.out.println(d);
		
		
	
		int aa=0; //int: 0부터만 사용가능 (null x)
		//하위 int는 값이 없으면 0으로 찍어야 하지만 int보다 상위 object인 Integer는 null까지 찍을 수 있다.
		//int=0; - 빈 공간에 0만 찍을 수 있음. / Integer=0,null - 빈 공간에 0, null 찍을 수 있음.
		Integer bb=null; //Interger (숫자 클래스): null을 사용할 수 있음.
		//int sum=aa+bb;
		//System.out.println(sum);
		System.out.println(bb);
	
		
		
		Object ff=123456;
		String zz=ff.toString(); //(toString) => Object 형태에서는 단어를 바로 형변환을 진행할 수 있음.(강제 형변환)
		//변환하고자 하는 데이터 자료형이 Object일 때
		System.out.println(zz);
		
		
		int kk = 123456;
		String kkk=Integer.toString(kk); //Integer.toString => 숫자를 문자로 변환
		//System.out.println(kk.get); //getclass 형변환이 안된다 => 숫자라서 안되는 것
		System.out.println(kkk.getClass()); //getClass: 클래스 자료형 Type 확인이 가능하다.
	}

}
