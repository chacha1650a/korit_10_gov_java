package study.ch07.Example;

public class Ex22 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
} // 해당 코드에서 바깥 for문은 "단"을 담당 안쪽 for문은 "숫자"를 담당하는 for문으로
  // 바깥 for문을 시작으로 내부의 for문의 값이 3이 될때까지 반복해서 순회하면서
  // 3단까지 1 ~ 3을 곱한 값이 출력 될 것이다.
