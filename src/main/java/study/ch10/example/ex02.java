package study.ch10.example;

public class ex02 {
    public static void main(String[] args) {
        int[] nums = {85, 92, 78, 96, 88};
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < nums.length; i++)  {
            sum = sum + nums[i];
            avg = (double) sum / nums.length;
        }
        System.out.println("평균: " + avg);

    }
}
