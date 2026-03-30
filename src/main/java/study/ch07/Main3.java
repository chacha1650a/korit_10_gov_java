package study.ch07;

public class Main3 {
    public static void main(String[] args) {

        // while (조건 먼저 검사) - 조건이 false면 한 번도 실행 되지 않음
        // do-while (실행 먼저, 조건 나중) - 최소 1번은 반드시 실행
        // while문의 초기 값은 항상 밖에 정의

//        int i = 1;
//        while (i <= 9) {
//            System.out.println(i);
//            i++;
//        }
//
//        for (int j = 0 ; j < 10;) {
//            j++;
//            System.out.println(j);
//        }

        int i = 0;
        while(i < 5) {
            int j = 0;
            while (j < 5 - 1 - i) {
                System.out.print(" ");
                j++;
            }

            j = 0;
            while (j < i + 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

    }
}
