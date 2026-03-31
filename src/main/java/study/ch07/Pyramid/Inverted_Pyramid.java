package study.ch07.Pyramid;

import java.util.Scanner;

public class Inverted_Pyramid {
    public static void main(String[] args) {

        System.out.println("피라미드의 층을 입력해주세요 : ");
        Scanner scRows = new Scanner(System.in);

        int rows = scRows.nextInt();
        for (int i = 0; i < rows * 3; i++) {
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0; i < rows; i++) {
            int stars = 2 * (rows - i) - 1;

            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < rows * 3; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
