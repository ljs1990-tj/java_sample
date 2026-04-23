package F_반복문;

import java.util.Scanner;

public class 예시코드_반복문심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * == 아래 예시코드는 '스캐너' 내용을 먼저 선행하시고 참고하시기 바랍니다.
		 * [심화 반복문 학습 예제]
		 * 중첩 반복문(이중 for문)과 무한 루프 탈출 패턴을 Scanner와 함께 실습합니다.
		 */
		
		Scanner sc = new Scanner(System.in);

		
		// ---------------------------------------------------------
        // 1. 중첩 반복문 (Nested Loop) 실습: 구구단 전체 출력
        // 바깥쪽 루프(i)가 1번 돌 때, 안쪽 루프(j)는 처음부터 끝까지 다 돕니다.
        // ---------------------------------------------------------
		
        System.out.println("=== [1. 이중 for문: 구구단 출력] ===");
        
        for (int i = 2; i <= 9; i++) { // 바깥쪽 루프: 2단부터 9단까지 반복
            System.out.println("[" + i + "단 시작]");
            
            for (int j = 1; j <= 9; j++) { // 안쪽 루프: 각 단의 1부터 9까지 곱셈 반복
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // 한 단이 끝나면 줄바꿈
        }


        // ---------------------------------------------------------
        // 2. 무한 루프와 break 실습: 사용자 선택형 프로그램
        // while(true)는 조건이 항상 참이므로 내부에서 break를 만나기 전까지 영원히 돕니다.
        // ---------------------------------------------------------
        System.out.println("=== [2. 무한 루프와 메뉴 선택 시스템] ===");
        
        while (true) {
            System.out.println("\n--- 메뉴를 선택하세요 ---");
            System.out.println("1. 원하는 구구단 출력");
            System.out.println("2. 프로그램 종료");
            System.out.print("선택: ");
            
            int choice = sc.nextInt();

            if (choice == 1) {
                // 특정 단을 입력받아 출력하는 로직
                System.out.print("출력할 단(2~9)을 입력하세요: ");
                int target = sc.nextInt();
                
                if (target >= 2 && target <= 9) {
                    System.out.println("--- " + target + "단 출력 ---");
                    for (int k = 1; k <= 9; k++) {
                        System.out.println(target + " * " + k + " = " + (target * k));
                    }
                } else {
                    System.out.println("잘못된 입력입니다. 2에서 9 사이의 숫자를 입력하세요.");
                }

            } else if (choice == 2) {
                // 루프 탈출 조건
                System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
                break; // 이 명령을 만나는 순간 가장 가까운 반복문(while)을 즉시 빠져나갑니다.

            } else {
                System.out.println("잘못된 번호입니다. 다시 선택해 주세요.");
            }
        }

        // Scanner 자원 반납
        sc.close();
	}

}
