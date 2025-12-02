package dto;

import java.util.*;



/*
 * 응용문제 1
 * 예외처리를 이용하여 다음사항에 필요한 프로세서 코드를 작성합니다.
 * 사용자가 은행에 입금을 시도 합니다.
 * 
 * [실행]
 * 금액을 입력하세요: 1000
 * 금액을 입력하세요: 500
 * 금액을 입력하세요: 6000
 * "종료"라고 입력시 다음과 같이 결과가 나오면 됩니다.
 * 
 * [결과]
 * [1000,500,6000]
 * 
 * 단, 사용자가 금액을 입력시 문자로 입력할 경우 예외처리 발생하여 다시 처음부터 실행 되도록 합니다.
 */

public class excp3 {

	public static void main(String[] args) {
		new excp3_box(); //excp3_box.java와 연계 작업
	}
	
}










// 내코드
//public class excp3 {
//
//	public static void main(String[] args) {
//		
//		new excp3_box();
//	}
//
//}
//
//class excp3_box{
//	Scanner sc = null;
//    int amount[];
//    int count = 0;   // 입력한 실제 개수
//
//    public excp3_box() {
//
//        sc = new Scanner(System.in);
//        amount = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            while (true) {
//                System.out.print("금액을 입력하세요(종료 시 종료 입력): ");
//                String input = sc.nextLine();
//
//                if (input.equals("종료")) {
//                    System.out.println("입력 종료!");
//                    printResult(); // count 만큼만 출력
//                    return;
//                }
//
//                try {
//                    int value = Integer.parseInt(input);
//
//                    // ★ i가 아니라 count로 저장해야 함
//                    amount[count] = value;
//                    count++;
//                    break;
//
//                } catch (NumberFormatException e) {
//                    System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
//                }
//            }
//        }
//
//        printResult();
//    }
//
//    // copyOf 없이 count 만큼만 출력
//    void printResult() {
//        System.out.print("결과: [");
//        for (int i = 0; i < count; i++) {
//            System.out.print(amount[i]);
//            if (i < count - 1) System.out.print(", ");
//        }
//        System.out.println("]");
//    }
//}












