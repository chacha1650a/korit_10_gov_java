package study.ch07.Pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        // 피라미드 그리기 코드

        System.out.println("피라미드의 층을 입력해주세요 : ");
        Scanner scRows = new Scanner(System.in);

        int rows = scRows.nextInt();

        for(int i = 0; i < rows; i++) {
            int stars = 2 * i - 1;

            if (i == 0) {
                continue;
            }

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
