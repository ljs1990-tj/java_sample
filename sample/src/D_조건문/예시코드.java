package D_조건문;

public class 예시코드 {
	public static void main(String[] args) {
		// ---------------------------------------------------------
        // 1. 단순 if 문: 특정 조건이 맞을 때만 "보너스"로 실행하는 개념
        // ---------------------------------------------------------
        int age = 22;

        System.out.println("--- [1. 단순 if 문 실습] ---");
        // if 뒤의 (괄호) 안에는 결과가 참(true) 또는 거짓(false)인 식이 들어갑니다.
        if (age >= 20) {
            // 이 블록{ } 안의 내용은 age가 20 이상일 때만 실행됩니다.
            System.out.println("성인 인증에 성공했습니다.");
        }
        // 조건과 상관없이 항상 실행되는 문장
        System.out.println("프로그램을 계속 진행합니다.");
        System.out.println();


        // ---------------------------------------------------------
        // 2. if-else 문: 반드시 한 쪽으로만 가야 하는 "양갈래 길"
        // ---------------------------------------------------------
        int score = 55;

        System.out.println("--- [2. if-else 문 실습] ---");
        if (score >= 60) {
            // 조건이 '참'일 때 실행
            System.out.println("축하합니다! 합격입니다.");
        } else {
            // 위 조건이 '거짓'일 때 실행 (60점 미만인 모든 경우)
            System.out.println("아쉽습니다. 불합격입니다.");
        }
        System.out.println();


        // ---------------------------------------------------------
        // 3. else if 문: "여러 갈래 길" 중 딱 하나만 선택하기
        // ---------------------------------------------------------
        int hour = 14; // 현재 시간 (오후 2시)

        System.out.println("--- [3. else if 문 실습] ---");
        if (hour < 11) {
            // 11시 전이라면 실행
            System.out.println("굿 모닝! 상쾌한 아침입니다.");
        } else if (hour < 15) {
            // 11시 이후이면서 15시 전일 때 실행 (오후 2시인 현재 여기가 실행됨)
            System.out.println("점심 맛있게 드셨나요? 나른한 오후네요.");
        } else if (hour < 18) {
            // 15시 이후이면서 18시 전일 때 실행
            System.out.println("곧 퇴근 시간입니다. 조금만 힘내세요!");
        } else {
            // 위 모든 조건에 해당하지 않는 밤 시간일 때 실행
            System.out.println("좋은 밤 되세요.");
        }
        System.out.println();


        // ---------------------------------------------------------
        // 4. switch 문: 값이 "정확히 일치"하는 지점으로 순간이동하기
        // ---------------------------------------------------------
        int month = 4;

        System.out.println("--- [4. switch 문 실습] ---");
        // switch는 (괄호) 안의 값과 동일한 'case'를 찾아 바로 점프합니다.
        switch (month) {
            case 3: case 4: case 5: // 여러 케이스를 묶을 수도 있습니다.
                System.out.println("현재 계절은 [봄] 입니다.");
                break; // break를 만나야 switch 문 밖으로 탈출합니다! (중요)
            case 6: case 7: case 8:
                System.out.println("현재 계절은 [여름] 입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절은 [가을] 입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("현재 계절은 [겨울] 입니다.");
                break;
            default:
                // 어떤 case에도 해당하지 않는 값이 들어왔을 때 실행 (else와 비슷함)
                System.out.println("잘못된 월 입력입니다.");
        }
	}
}
