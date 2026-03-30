package study.ch01;

public class Main {

    public static void main(String[] args) {
        // 형변환 코드
       int num1 = 10;
       double num2 = num1;
       int num3 = (int) num2;

        System.out.println("기본 값 : " + num1);
        System.out.println("업캐스팅 된 값 : " + num2);
        System.out.println("다운 캐스팅 된 값 : " + num3);

    }

}
