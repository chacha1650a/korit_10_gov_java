package study.ch23.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(5, 12, 3, 8, 20, 1);

        System.out.println(numStream.filter(num -> num >= 10).toList());
    }
} // 출력: 12, 20
