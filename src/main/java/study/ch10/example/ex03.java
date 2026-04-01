package study.ch10.example;

public class ex03 {
    public static void main(String[] args) {
        int[] nums = {34, 78, 12, 56, 91, 23};
        int max = 0;
        max = nums[0];

        for (int i = 0; i < nums.length; i++) {
        max = nums[i] > max ? nums[i] : max;

        }
        System.out.println("최대 값 : " + max);
    }
}
