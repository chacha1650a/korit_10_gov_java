package study.ch10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 4, 1, 2 , 5, 1, 6, 7, 1 ,1};
        int[] sortedNums = nums.clone();

        int sort = sortedNums.length;

        // 버블 정렬
        for(int i = 0; i < sort - 1; i++) {
            for (int j = 0; j < sort - 1 - i; j++) {
                if(sortedNums[j] > sortedNums[j + 1]) {
                    int temp = sortedNums[j];
                    sortedNums[j] = sortedNums[j + 1];
                    sortedNums[j + 1] = temp;
                }
            }
        }

        System.out.println("정렬 전의 값 : " + Arrays.stream(nums).boxed().toList());
        System.out.println("정렬 후의 값 : " + Arrays.stream(sortedNums).boxed().toList());

    }
}
