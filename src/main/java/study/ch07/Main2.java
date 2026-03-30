package study.ch07;

public class Main2 {
    public static void main(String[] args) {


        // for문 안에 있는 int num, count, count2는 지역변수로 지역 밖에서는 사용이 불가하다.
        // 반대로 말하면 다른 for문(지역)에서는 똑같은 변수명을 사용 할 수 있다.

        // for문 안에는 쉼표(,) 표시로 해당 구역에서 해당 식을 더 작성할 수 있다.
       for (int num = 10 , count = 0, count2 = 0; num % 2 ==0; num = count++ == 3 ? 1 : 10, count2++)
           System.out.println("짝수입니다.");
    }
}
