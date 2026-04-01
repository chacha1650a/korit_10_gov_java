package study.ch10;

public class Array01 {
    public static void main(String[] args) {
        // 배열을 사용하지 않은 경우
//        int score1 = 90;
//        int score2 = 85;
//        int score3 = 78;
//        int score4 = 92;
//        int score5 = 88;

        int[] nums1 = new int[5]; // 5칸의 배열 생성
        int[] nums2 = new int[] {10, 20, 30, 40, 50}; // 5칸의 배열 생성 및 초기화
        int[] nums3 = {10, 20, 30, 40, 50};

        // 배열 값 참조
        System.out.println(nums1[0]); // nums1의 0번 인덱스 출력
        System.out.println(nums2[0]); // nums2의 0번 인덱스 출력
        System.out.println(nums3[0]); // nums3의 0번 인덱스 출력
        int num1 = nums1[1]; // nums1의 1번 인덱스 참조
        int num2 = nums2[1]; // nums2의 1번 인덱스 참조
        int num3 = nums3[1]; // nums2의 1번 인덱스 참조
        System.out.println(num1); // 참조 된 num1 값 출력
        System.out.println(num2); // 참조 된 num2 값 출력
        System.out.println(num3); // 참조 된 num3 값 출력

        // 배열 값 대입
        nums1[0] = 100;
        nums2[0] = 1000;
        nums3[0] = 10000;
        System.out.println(nums1[0]);
        System.out.println(nums2[0]);
        System.out.println(nums3[0]);



    }
}
