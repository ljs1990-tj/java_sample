package B_변수;

public class 예시코드 {
	public static void main(String[] args) {
		// 1. 정수형 (int): 소수점이 없는 숫자를 저장합니다.
        
		// [선언]
		int age; 
		// [할당]
		age = 25; 
		
		// [선언과 할당을 동시에 하는 예시]
        int score = 100;

        // 2. 실수형 (double): 소수점이 있는 숫자를 저장합니다.
        double height = 175.5;
        double pi = 3.141592;

        // 3. 논리형 (boolean): 참(true) 또는 거짓(false)만 저장합니다.
        // 주로 "로그인 했는가?", "시험에 합격했는가?" 같은 상태를 나타낼 때 씁니다.
        boolean isStudent = true;
        boolean isGraduated = false;

        // 4. 문자형 (char): 딱 한 글자만 저장하며, 작은따옴표('')를 사용합니다.
        char grade = 'A';
        char gender = 'M';

        // 5. 문자열 (String): 여러 글자(문장)를 저장하며, 큰따옴표("")를 사용합니다.
        // 자바에서 가장 많이 쓰이는 타입 중 하나입니다.
        String name = "홍길동";
        String message = "자바 프로그래밍은 재미있어요!";

        // ---------------------------------------------------------
        // 결과 출력하기 (System.out.println 활용)
        // ---------------------------------------------------------
        System.out.println("=== 학생 정보 출력 ===");
        System.out.println("이름: " + name);         // 문자열과 변수를 + 기호로 연결할 수 있습니다.
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");
        System.out.println("성적: " + grade);
        System.out.println("학생여부: " + isStudent);
        System.out.println("응원메시지: " + message);

        // ---------------------------------------------------------
        // 6. 변수의 값 변경해보기
        // 변수는 '변할 수 있는 수'입니다. 새로운 값을 넣으면 이전 값은 지워집니다.
        // ---------------------------------------------------------
        age = 26; // 25였던 age 상자에 26을 덮어씌웁니다. (다시 선언할 필요 없이 이름만 씁니다)
        System.out.println("\n[정보 수정] 1년이 지나 나이가 " + age + "세가 되었습니다.");

        // 7. 주의사항: 자료형에 맞지 않는 값을 넣으면 에러가 발생합니다.
        // 예: age = "스물여섯"; // 정수 상자(int)에 글자(String)를 넣을 수 없어서 빨간 줄이 뜹니다.
        // 예: isStudent = 1;  // 논리 상자(boolean)에 숫자(int)를 넣을 수 없습니다.
	}
}
