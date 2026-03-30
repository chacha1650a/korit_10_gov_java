package study.ch07.Example;

public class Ex19 {
    public static void main(String[] args) {

        int result = 1;
        for (int i = 0; i < 5; i++) {
            result = result * (i + 1);
        }
        System.out.println("5!의 값 : " + result);

    }
}
