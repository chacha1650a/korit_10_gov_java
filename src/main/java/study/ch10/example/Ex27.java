package study.ch10.example;

import java.util.Arrays;

public class Ex27 {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80 ,90}
        };

        int[] rowSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                rowSums[i] += nums[i][j];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "행 합계 : " + rowSums[i]);
        }
    }
}
