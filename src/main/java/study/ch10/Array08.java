package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        // for-each문 : 범위 반복 없이 전체 반복이 되는 for문으로
        // 배열을 추가할 때 사용한다 (단순 읽기용으로 사용)
        // 인덱스 값이 필요하거나 값을 수정해야 하면 기존 for문을 사용해야 한다

        int[] nums = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int num : nums) {
            num = num * 10;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();


        String[] names = { "김준일", "김준이", "김준삼" };

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.print(name + " ");
        }

        System.out.println();
        for(String name : names) {
            System.out.print(name + " ");
        }
    }
}

