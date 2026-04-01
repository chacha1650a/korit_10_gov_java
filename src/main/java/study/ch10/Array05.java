package study.ch10;

public class Array05 {
    public static void main(String[] args) {
        // 구구단을 배열에 시작 단부터 끝단까지 자동으로 저장하여 출력하는 프로그램 작성
        int danStart = 1;
        int danEnd = 9;

        int Size = danEnd - danStart + 1;
        int[][] results = new int [Size][9];

        for(int i = 0; i < results.length; i++) {
            int dan = i + danStart;
            for(int j = 0; j < results[i].length; j++) {
                int num = j + 1;
                results[i][j] = dan * num;
            }
        }


        System.out.println("프로그램 시작");
        for(int i = 0; i < results.length; i++) {

            System.out.println(i + danStart + "단");

            System.out.print("[ ");
            for(int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("프로그램 종료");
    }
}
