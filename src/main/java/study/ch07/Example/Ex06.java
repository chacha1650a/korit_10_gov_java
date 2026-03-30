package study.ch07.Example;

public class Ex06 {
    public static void main(String[] args) {
        int num = 12;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("양수이면서 짝수");
            } else {
                System.out.println("양수이면서 홀수");
            }
        } else {
            System.out.println("0 이하");
        }
    }
} // 실행 결과 : 양수이면서 짝수 (num % 2 == 0) 조건 충족
