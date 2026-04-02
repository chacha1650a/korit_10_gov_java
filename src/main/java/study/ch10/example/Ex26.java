package study.ch10.example;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {

        int[][] nums = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                int num = j + 1;
                nums[i][j] = num + (i * 3);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }

    }
}
