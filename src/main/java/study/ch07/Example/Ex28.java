package study.ch07.Example;

public class Ex28 {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
} // 실행 결과 : 해당 코드는 num에 초기화 된 값을 num이 0보다 큰 값인 경우일 때만 실행하는 코드로
  // num / 10;을 실행 뒤에 count라는 int 타입 변수에 저장을 한다.(num이 0보다 작아지면 실행 종료)
  // 그렇게 저장된 count값은 num이 0보다 작아지면 반복문의 실행이 종료되며 자릿수를 출력한다.
