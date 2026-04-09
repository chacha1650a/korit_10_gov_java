package study.ch23.example;

import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> finalStream = numStream.map(num -> num * num);

        System.out.println(finalStream.toList());
    }
} // 출력: [1, 4, 9, 16, 25]
