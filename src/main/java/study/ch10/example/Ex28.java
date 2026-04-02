package study.ch10.example;

import java.util.Arrays;

public class Ex28 {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80 ,90}
        };

        int[] colSums = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
            colSums[j] += nums[i][j];
            }
        }
        System.out.println(Arrays.toString(colSums));
    }
}
