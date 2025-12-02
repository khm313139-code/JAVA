package dto;
//throws, throw 모두 사용
public class excp6 {

	public static void main(String[] args) {
		try {
			new excp6_box().abc("ok");
		}catch (Exception a) {
			if(a.getMessage()==null) {
				System.out.println(a.getMessage());
				//a.printStackTrace();
				System.out.println("코드 오류가 발생하였습니다.");
				}
			}
		}
	}



class excp6_box{
	Exception ep = null;
	public void abc(String a) throws Exception{
		try { //정상적으로 처리가 되었을 경우 기본은 null로 처리가 됨
			if(a=="ok") {
				String key = "134";
				int keycode = Integer.parseInt(key); //강제로 오류가 발생
				System.out.println(keycode);
			}
			else if (a=="no"){
				System.out.println("정상적으로 처리 완료!!");
			}
		}
		catch (Exception e) {
			this.ep = new Exception(); //=> null이 아닌 문제 사항이 발생됨.
			throw this.ep; //자신을 호출한 메소드에 결과값을 전송
			//throw e; //위 두줄 안쓰고 이렇게 써도 됨.
			
		}
	}
}

