package study.ch10.example;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {5, 12, 3, 18, 7, 21, 9, 14};
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                total++;
            }
        }
        System.out.println("홀수의 갯수 : " + total);

    }
}
