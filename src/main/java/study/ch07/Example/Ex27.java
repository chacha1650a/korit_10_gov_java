package study.ch07.Example;

public class Ex27 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
        }
    }
} // 실행 결과 : 해당 코드의 문제점은 int i = 10;이라는 변수 선언 & 초기화까진
  // 문제가 없으나 바로 밑의 반복문 속의 조건 (while i > 0)는 i가 0보다 큰 값일때 까지 true인 반복문이다.
  // 하지만 --i;나 --i;같은 증감식이 없기에. 해당 코드는 무한 루프에 걸리게 된다.
