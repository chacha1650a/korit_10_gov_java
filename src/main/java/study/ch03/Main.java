package study.ch03;

public class Main {
    public static void main(String[] args) {
        // 증감 연산

        int a = 10;

        System.out.println(a + 10);
        a += 1;
        System.out.println(a + 10);

        int b = 10;
        System.out.println(b++ + 10);
        System.out.println(b + 10);

        int c = 10;
        c += 1;
        System.out.println(c + 10);
        System.out.println(c + 10);

        int d = 10;
        System.out.println(++d + 10);
        System.out.println(d + 10);

        int e = 100;
        System.out.println(e);
        System.out.println(--e);
        System.out.println(--e);
        System.out.println(--e);
        System.out.println(--e);
        System.out.println(--e);
        System.out.println(e);

        //
        int f = 1000;
        int g = f++;
        System.out.println(g);
        g = f;
        System.out.println(g);

        // 비교 연산자 : 두 값을 비교하여 true 또는 false를 반환 ( 결과 타입 : boolean)
        // 예시 : a = 10, b= 3
        // > : 크다 -> a > b : true
        // < : 작다 -> a < b : false
        // >= : 크거나 같다 -> a >= 10 : true
        // <= : 작거나 같다 -> a < 3 : false
        // == : 같다 -> a == 10 : true
        // != : 같지 않다 -> a != b : true

        System.out.println(10 > 5);
        boolean status = 10 > 5;
        System.out.println(status);
        boolean status2 = 10 + 2 > 10;

        int num = 5;
        boolean even = num % 2 == 0;

        // 논리 연산자 : boolean 값을 조합하여 새로운 boolean 결과를 만드는 연산자
        // AND : 둘 다 true일 때만 true &&
        // OR : 둘 중 하나라도 true면 true ||
        // NOT : true <-> 반대로 뒤집기

        // 삼항 연산자 : 조건에 따라 두 값 중 하나를 선택하는 연산자

        int score = 85;
        String result = (score > 60) ?"합격" : "불합격";
        System.out.println(result);

    }
}
