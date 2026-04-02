package study.ch10.example;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int[] reversedNums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            reversedNums[nums.length - 1 - i] = nums[i];
        }
        System.out.println(Arrays.toString(reversedNums));
    }
}
