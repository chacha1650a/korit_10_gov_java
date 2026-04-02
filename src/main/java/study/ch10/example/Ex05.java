package study.ch10.example;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 22, 7, 36, 41};
        int[] sum = new int[7];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum[i] = nums[i];
                System.out.println("짝수 출력 : " + sum[i]);
            }
        }

    }
}