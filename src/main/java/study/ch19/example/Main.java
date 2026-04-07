package study.ch19.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("해당하는 값을 넣어주세요 : ");
        int a = sc.nextInt();

        switch (a) {
            case 1: {
                System.out.println("전기");
                break;
            }
            case 2 : {
                System.out.println("전자");
                break;
            }
            default: {
                System.out.println("해당 값이 존재하지 않습니다.");
                break;
            }

        }

        System.out.println("끝");
    }
}
