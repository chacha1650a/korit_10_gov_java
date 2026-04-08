package study.ch21.example;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류가 발생했습니다.");
        }
        System.out.println("프로그램이 적상 작동했습니다.");
    }
}
