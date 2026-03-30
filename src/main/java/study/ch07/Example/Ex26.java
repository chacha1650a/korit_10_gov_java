package study.ch07.Example;

public class Ex26 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (sum < 20) {
            sum += n;
            n++;
        }
        System.out.println("sum=" + sum + ", n=" + n);
    }
} // 실행 결과 : 해당 반복문은 최종 합 sum에 n값을 더한 값을 sum에 저장 후 n++; 증감을 하는 형태의
  // 반복문으로 최종 출력은 sum += n의 값을 가진 21과 마지막 n 값인 7이 출력 된다.
