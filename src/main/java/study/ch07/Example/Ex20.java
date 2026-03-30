package study.ch07.Example;

public class Ex20 {
    public static void main(String[] args) {
        int dan = 8;
        int num = 9;

        System.out.println("7단을 시작합니다.");
        for(int i = 7; i < dan; i++) {
            for (int j = 0; j < num; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
        System.out.println("7단이 끝났습니다.");
    }
}
