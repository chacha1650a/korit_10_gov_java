package study.ch07.Example;

public class Ex04 {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 60) {
            System.out.println("D");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 90) {
            System.out.println("A");
        }

    }
} // 실행 결과 : D, 그러나 처음 조건문에서 60이상이면 D라는 조건 순서 때문에
  // int score는 95이나 D가 출력 됨.
