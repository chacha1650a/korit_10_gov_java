package study.ch23;

import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {

        // 스트림은 1회 사용 후에 다시 재사용이 불가능하기에 이 점을 유의해야 한다.
        Stream<Integer> numStream = Stream.of(10, 20, 30, 40);
        Stream<Integer> numStream2 = numStream.map(num -> num * 10);

        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0);

        System.out.println(numStream3.toList());
    }
}
