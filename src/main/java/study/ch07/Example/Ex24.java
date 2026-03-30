package study.ch07.Example;

public class Ex24 {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + "은(는) " + (isPrime ? "소수" : "소수 아님"));
    }
} // 실행 결과 : 해당 코드는 int num 변수에 13이 초기화 되어 있고 boolean 타입인 isPrime이 true;로
  // 저장되어 있다. 또한 밑의 코드에는 for문으로 2부터 13까지 반복되는 for문이 있으며 그 안에 if 제어문으로
  // num % i를 통해 나머지 값이 0일때 isPrime의 타입을 false;로 바꿔버리고 break;로 반복 & 제어문을 탈출하여
  // 그러므로 1과 자기자신만을 약수로 가지는 '소수'는 13이며 반복문의 마지막 반복에 해당 조건이 실행되며
  // 마지막 줄의 System.out.println(num + "은(는) " + (isPrime ? "소수" : "소수 아님"));에 13이 출력 되게 된다.
