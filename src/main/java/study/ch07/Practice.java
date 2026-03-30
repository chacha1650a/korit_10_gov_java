package study.ch07;

public class Practice {
    public static void main(String[] args) {

        // 구구단 프로그램 : 1 ~ 9단

        int dan = 9;
        int num = 9;

        for (int i = 0; i + 1 < dan; i++) { // i값이 9가 될 때 까지 반복
            if (i == 0) { // 0단은 없기에 continue;로 0단 생략
                continue;
            }
            System.out.println("=== " + i + "단 시작!" + " ===");
            for (int j = 0; j < num; j++) { // j 값이 9가 될 때 까지 반복
                int result = i * (j + 1); // i * j(+1)를 result 값에 초기화
                System.out.println("   " + i + " * " + (j + 1) + " = " + result); // 구구단 결과 출력
            }
            System.out.println("=== " + i + "단 종료!" + " ===\n");
        }
    }
}
