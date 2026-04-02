package study.ch10.example;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
