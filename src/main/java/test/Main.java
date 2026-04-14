package test;

public class Main {
    public static void main(String[] args) {
        Integer n1 = 100;
        Integer n2 = 100;
        Integer n3 = 300;
        Integer n4 = 300;

        System.out.println(n1 == n2);
        System.out.println(n3 == n4);
    } // -128~127을 넘어가는 순간 new Integer()가 일어나면서 새로운 객체를 생성하깅테 메모리 주소가 달라짐.
}
