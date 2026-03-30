package study.ch07.Example;

public class Ex21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} // 실행 결과 바깥 for문은 줄을 결정하는 for문으로
  // i <= 5;에 의해 5줄로 정해져 있으며 두번째 중첩된 for문에는
  // j < i;에 의해 별이 점점 한개씩 늘어 날 것이다.
  // 결론은 5층 삼각형(별의 갯수가 오른쪽으로 증가)이 나올 것이다.
