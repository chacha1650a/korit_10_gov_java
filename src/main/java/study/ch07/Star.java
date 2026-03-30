package study.ch07;

public class Star {
    public static void main(String[] args) {
        /*
         *  *
         *  **
         *  ***
         *  ****
         *  *****
         *  와 같이 출력되는 프로그램을 구현
         */

        int count = 5;


        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < count - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
