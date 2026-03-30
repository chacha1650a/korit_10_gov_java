package study.ch07.Example;

public class Ex18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
} // 실행 결과 : 15
