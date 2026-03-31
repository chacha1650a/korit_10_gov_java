package study.ch08;

public class OBJ02 {
    public static void main(String[] args) {
        class Addition {
            int defaultNumber = 10; // 정수형 변수 10 생성 + defaultNumber에 초기화(저장)

            // 함수 사용 목적

            // 1. 중복 코드 제거
            // 반복 작업에서 이미 지정된 함수만 있으면 '호출' 행위로
            // 기존에 여러줄 적어야 하는 작업을 대체 할 수 있기 때문이다.

            // 2. 기능별로 코드를 나눌 때
            // 기능별로 코드를 나누지 않으면 코드의 가독성이 떨어지며
            // 알아보기 어렵기에 기능별로 코드를 나눠 주어야 한다

            Addition() {
                System.out.println("성상자 호출");
            }

            int add(int a, int b) {
                System.out.println("변수 a: " + a); // 매개변수로 받은 값(100) 출력
                System.out.println("변수 b: " + b); // 매개변수로 받은 값 (200)출력
                System.out.println("기본 값: " + defaultNumber); // 클래스 초반에 선언해둔 defaultNumber(10) 출력
                return a + b + defaultNumber; // 매개변수 값 + 매개변수 값 + 변수 값 (int형 자료) 리턴
            }


        }

        Addition add1 = new Addition(); // 새로운 객체 생성
        int num  = 1000; // num에 리터럴 1000값 대입
        int num2 = add1.add(100, 200); // add1객체에 add 메서드를 참조해서 매개변수 대입 후 리턴 된 값을 num2에 저장
        System.out.println(num + num2); // 정수형 변수 num , num2에 담긴 값을 산술 연산(+) 후 출력.
    }
}
