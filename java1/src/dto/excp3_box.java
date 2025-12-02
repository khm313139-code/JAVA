package dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	class excp3_box{
		private Scanner sc = null; //사용자 입력 프로세서
		private List<Integer> bank = null; //입금한 내역 저장
		String user = null; //사용자가 입력한 값
		public excp3_box() {
			this.sc=new Scanner(System.in);
			this.bank = new ArrayList<Integer>();
			this.abc();
		}
		private void abc() {
			try {
				while(true) { //몇 번 입금할지 모르므로 무한 반복으로 작동 시킴
					System.out.println("입금할 금액을 입력하세요: ");
					this.user = this.sc.next();
					if(this.user.equals("종료")) { //프로세서 종료
						System.out.println(this.bank);
						this.sc.close();
						System.exit(0);
					}
					else { //입금사항을 저장하는 공간
						Integer r = bank_money(this.user); //1. bank_money 메소드의 결과값을 return 처리
						
						if(r==null) { //숫자를 문자로 변환시 오류 발생 시 메세지 출력 후 반복문 가동 //6. 여기서 조건 검토
							System.out.println("금액은 숫자만 입력 가능합니다.");
						}
						else { //정상적인 입력사항일 경우만 배열로 저장 //7. 배열에 순차적으로 입력값을 추가함.
							this.bank.add(r);	
							}
						}
					}
				
			}
			catch(Exception e) {
				System.out.println("접근이 잘못 되었습니다.");
			}
		}
		
		//이 메소드 역할 - 사용자가 입력한 값을 매개변수로 받아서 자료형을 변환함 단, 변환시 오류가 발생할 경우 null로 회신함.
		private Integer bank_money(String m){ // 2. 매개변수로 값을 받음. 메소드 하나 더 작성하는 부분
			Integer result = 0; //지역변수
			
			try {
				result = Integer.valueOf(m); //3.자료형 변환
				
			}catch(Exception e) {
				result = null; //4. 자료형 변환 오류 발생 시 null로 적용
			}
			return result; //자료형이 integer니까 null 쓸 수 있다. //5. 최종 결과 값을 return 시킴 integer 자료형으로 
		}
	}

