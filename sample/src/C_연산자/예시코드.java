package C_연산자;

public class 예시코드 {
	public static void main(String[] args) {
		// 1. 산술 연산자 (사칙연산)
        int a = 10;
        int b = 3;

        System.out.println("=== 1. 산술 연산 ===");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (정수끼리 나누면 소수점은 버려집니다!)
        System.out.println("a % b = " + (a % b)); // 1 (10을 3으로 나눈 나머지)
        System.out.println();


        // 2. 복합 대입 연산자
        int c = 10;
        System.out.println("=== 2. 복합 대입 연산 ===");
        c += 5; // c = c + 5와 같음
        System.out.println("c += 5 결과: " + c); // 15
        c *= 2; // c = c * 2와 같음
        System.out.println("c *= 2 결과: " + c); // 30
        System.out.println();


        // 3. 비교 연산자 (결과는 항상 true 또는 false)
        System.out.println("=== 3. 비교 연산 ===");
        System.out.println("a == b : " + (a == b)); // false (같은가?)
        System.out.println("a != b : " + (a != b)); // true (다른가?)
        System.out.println("a > b  : " + (a > b));  // true (a가 큰가?)
        System.out.println();


        // 4. 논리 연산자 (조건 결합)
        System.out.println("=== 4. 논리 연산 ===");
        boolean x = true;
        boolean y = false;

        // && (AND): 둘 다 참이어야 참
        System.out.println("x && y : " + (x && y)); // false
        // || (OR): 하나만 참이어도 참
        System.out.println("x || y : " + (x || y)); // true
        // ! (NOT): 결과를 반대로 뒤집음
        System.out.println("!x     : " + !x);       // false
        System.out.println();


        // 5. 증감 연산자 (전위 vs 후위)
        System.out.println("=== 5. 증감 연산 ===");
        int val = 10;

        // 전위 연산: ++가 앞에 있으면 '먼저' 더하고 출력합니다.
        System.out.println("++val 결과: " + (++val)); // 11 출력, 현재 val은 11

        // 후위 연산: ++가 뒤에 있으면 '출력 후에' 더합니다.
        System.out.println("val++ 결과: " + (val++)); // 11 출력 (하지만 내부적으론 12가 됨)
        System.out.println("최종 val 값: " + val);     // 12 확인
	}
}
