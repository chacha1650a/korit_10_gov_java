package study.ch07.Example;

public class Ex29 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
    }
} // 실행 결과 : 이 코드는 int i = 10;로 초기화 된 값을
  // do while문으로 반복문을 실행 시켜서 i값을 출력 시킨 뒤
  // i++; 증감식으로 i 값을 1씩 증가 시킨다.
  // 단 조건이 i가 5 이하일때 10에서 바로 반복문을 종료시키며 10만 출력된다.
