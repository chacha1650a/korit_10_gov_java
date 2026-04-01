package study.ch10.example;

public class ex04 {
    public static void main(String[] args) {
        int[] nums = {44, 11, 77, 33, 55};
        int index = -1;
        int min = 0;
        min = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }

        }
        System.out.println("최소 값 : " + min);
        System.out.println("발견한 인덱스 : " + index);
    }
}
