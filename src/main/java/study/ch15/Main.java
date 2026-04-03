package study.ch15;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("김대훈", 20);
        st1.setAddress("동래구");
        System.out.println(st1);

        Student st2 = new Student("김준일", 33, "동래구");
        System.out.println(st2);

        final String data = "임시 데이터 값"; // 상수
//        data = "test";    상수는 한번 초기화 후 변경 할 수 없다.
        System.out.println(data);

        final String data2; // 상수 선언
        data2 = "test"; // 초기화

        Student st3 = new Student("김준이", 34);
    }
}
