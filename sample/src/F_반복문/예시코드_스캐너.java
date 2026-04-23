package F_반복문;

/**
 * [Scanner 클래스 학습 예제]
 * 사용자가 키보드로 입력한 값을 읽어와 변수에 저장하는 법을 공부합니다.
 * 이 코드를 실행하면 콘솔창에 글자를 입력할 수 있는 상태가 됩니다.
 */
import java.util.Scanner; // [중요] 외부 도구를 가져오는 명령입니다. 없으면 Scanner를 쓸 수 없습니다.

public class 예시코드_스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Scanner 도구 생성
        // System.in은 '키보드 입력을 받겠다'는 뜻입니다.
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 사용자 정보 입력 받기 ===");

        // 2. 문자열 입력 받기 (공백 전까지)
        // 사용자가 이름을 치고 엔터를 누를 때까지 기다립니다.
        System.out.print("1. 이름을 입력하세요: ");
        String name = sc.next(); 

        // 3. 정수 입력 받기
        System.out.print("2. 나이를 입력하세요: ");
        int age = sc.nextInt(); 

        // 4. 실수 입력 받기
        System.out.print("3. 키를 입력하세요(예: 175.5): ");
        double height = sc.nextDouble();

        // ---------------------------------------------------------
        // [주의사항] 엔터 키 버그 해결하기 (Buffer Flush)
        // nextInt()나 nextDouble()은 숫자만 가져가고 '엔터 키'는 메모리에 남겨둡니다.
        // 그 다음에 바로 nextLine()을 쓰면 이 남은 엔터 키가 입력으로 인식되어
        // 입력을 받지 않고 그냥 넘어가버리는 현상이 발생합니다.
        // ---------------------------------------------------------
        sc.nextLine(); // 메모리에 남은 엔터 키(줄바꿈 문자)를 깨끗하게 비워줍니다.

        // 5. 문자열 입력 받기 (한 줄 전체)
        System.out.print("4. 좌우명을 한 줄로 입력하세요: ");
        String motto = sc.nextLine(); // 이제 정상적으로 한 줄 전체를 입력받을 수 있습니다.

        // ---------------------------------------------------------
        // 결과 출력
        // ---------------------------------------------------------
        System.out.println("\n=== 입력된 정보 확인 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
        System.out.println("키: " + height + "cm");
        System.out.println("좌우명: " + motto);

        // 6. Scanner 닫기
        // 사용이 끝난 도구를 반납하여 컴퓨터 자원을 아낍니다.
        sc.close();
	}

}
