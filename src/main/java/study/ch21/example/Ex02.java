package study.ch21.example;


public class Ex02 {
    public static void main(String[] args) {
        String input = "abc123";

        try {
            int num = Integer.parseInt(input);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다.");
        }
    }
}
