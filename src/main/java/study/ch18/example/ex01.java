package study.ch18.example;
class Counter {
    static int count = 0;
    String name;

    Counter(String name) {
        this.name = name;
        count++;
    }
}

public class ex01 {
    public static void main(String[] args) {
        Counter c1 = new Counter("A");
        Counter c2 = new Counter("B");
        Counter c3 = new Counter("C");
        System.out.println(Counter.count);
        System.out.println(c1.count);
    }
} // 실행 결과 : 해당 코드는 main 메서드에서 각각 3가지의 객체를 생성하면서 Counter 메서드를 호출하는 코드이다.
  // Counter 메서드는 호출되면서 int count = 0; 값이 1씩 더해지게 된다. static을 사용하였기에 c1 ~ c3까지
  // 총 3번이 호출이 일어나기에 최종 카운트는 3이 출력되고, c1에서 count를 호출하는 것도 저장된 count값을 불러오기에 3이 출력 된다.
