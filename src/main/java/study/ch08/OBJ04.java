package study.ch08;

public class OBJ04 {

    public static void main(String[] args) {

        // 메서드 오버로딩
        // 메서드의 이름이 같을 때는 메서드의 매개변수가 중요하다
        // 들어오는 argument의 값에 따라 parameter를 구분하기 때문

        class Addition {
            void add(int a) { }
            void add(double b) { }
            void add(int a, double b) {}
            void add(double b, int a) {}
            int add(int a, int b , int c) {return a + b + c;}
            double add(int a, int b , int c, int d) {return a + b + c;}
            // 오버로딩에서는 메서드명이 동일해도 매개변수가 다르면 다른 메서드로 취급
            // 그러므로 다른 매개변수 값이 추가 되거나 매개변수의 순서가 바뀌면 다른 변수로 적용된다
            // 이때 리턴 값은 메서드 실행에 영향을 주지 않기 때문에 필요가 없다.
            // 요약 : 매개변수 개수,타입,순서가 다르면 가능 , 리턴타입 or 매개변수 이름만 다르면 불가능
        }

        Addition aaa = new Addition();
        aaa.add(10);
        aaa.add(3.14);
        aaa.add(1, 3.14);

        // 생성자 오버로딩 - 메서드 말고 생성자도 오버로딩이 가능하다
        // this()로 생성자에서 다른 생성자를 호출할 수 있다.
        // 단 this()는 반드시 생성자의 첫 번째 줄에 와야 한다.

    }
}
