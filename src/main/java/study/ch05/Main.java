package study.ch05;

public class Main {
    public static void main(String[] args) {
        int num = 10; // 변수 선언 & 초기화
        boolean result = num % 2 == 0; // result에 true값 반환

        // num의 값이 짝수면 num에 10을 곱하고 짝수가 아니면 20을 곱하여 결과를 출력
//        if (result) System.out.println(num * 10);
//        if (!result) System.out.println(num * 20);
        if (result) { // true 일때 조건 실행
            System.out.println(num *  10);
            System.out.println("짝수");
        } else { // false일때 조건 실행
            System.out.println(num * 20);
            System.out.println("홀수");
        }

        int num2 = 1;

        // if문을 사용할 때는 갑자기 조건이 추가 되어야 하거나
        // 가독성의 문제로 가급적 중괄호 사용을 권장한다.

        if (num2 % 8 == 0)  {
            System.out.println("8의 배수입니다");
        } else if (num2 % 7 == 0) {
                System.out.println("7의 배수입니다");
        } else if (num2 % 6 == 0) {
            System.out.println("6의 배수입니다");
        } else {
            System.out.println("8, 7, 6의 배수가 아닙니다.");
        }
    }
}
