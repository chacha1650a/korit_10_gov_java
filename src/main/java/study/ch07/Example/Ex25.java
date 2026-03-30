package study.ch07.Example;

public class Ex25 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i += 2;
        }
    }
} // 실행 결과 : 해당 while 반복문은 i = 1;로 초기화 된 값이
  // 5이상일때 실행되며 반복문 안에서 i값 출력과 i += 2; 가 실행되기에
  // 짝수를 제외한 홀수 값 : 1 , 3 , 5가 출력이 된다.
